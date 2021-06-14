package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TunnelTest {

    public void tunnelTest(RemoteWebDriver driver, String status, long totaltimeforlocaltest) {


        long localtesttimestart;
        long localtesttimestop;
        localtesttimestart = System.currentTimeMillis();

        try {
            driver.get("http://localhost:3000/iframes");
            Thread.sleep(10000);
            String TitleValue = "IFrames";
            String title = driver.getTitle();
            if (TitleValue.matches(title)) {
                status = "passed";

            } else {
                status = "failed";
                System.out.println("Title Value not matched test marked as failed");
            }

            driver.switchTo().frame("frame-one-id");
            driver.findElement(By.cssSelector("#firstname")).sendKeys("Prateek");
            driver.findElement(By.cssSelector("#lastname")).sendKeys("Singh");
            Thread.sleep(2000);
            driver.switchTo().parentFrame();
            Thread.sleep(2000);
            driver.switchTo().frame("frame-two-id");
            driver.findElement(By.cssSelector("#root > div > div > div > button")).click();
            Thread.sleep(2000);
            driver.switchTo().parentFrame();
            driver.switchTo().frame("frame-three-id");
            driver.findElement(By.cssSelector("#text-id")).sendKeys("This is Prateek Singh Running Iframe Test with the Tunnel");
            //driver.switchTo().parentFrame();
            driver.switchTo().frame("frame-four-id");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#root > div > div > div > button")).click();


        } catch (Exception f) {
            status = "failed";
            System.out.println(f);
        }
        try {
            driver.get("http://localhost.lambdatest.com:3000");
            Thread.sleep(2000);
        } catch (Exception t) {

        }
        localtesttimestop = System.currentTimeMillis();
        totaltimeforlocaltest = localtesttimestop - localtesttimestart;


        System.out.println("Time taken by the test to execute in local" + "    " + totaltimeforlocaltest / 1000f);
        ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);

    }
}

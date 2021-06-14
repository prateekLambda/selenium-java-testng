package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class StreamTest {
    public void TestStream(RemoteWebDriver driver, String status) {
        try {
          /*  ((JavascriptExecutor) driver).executeScript("window.open()");
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));*/

            driver.get("https://www.youtube.com/watch?v=wpI6XAteXOI");
            Thread.sleep(5000);
            String Tiilegot = driver.getTitle();
            //  Actions action = new Actions(driver);


            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            WebElement doubleclick = driver.findElement(By.id("search"));
            // doubleclick.click();
//            Actions action = new Actions(driver);
//            action.moveToElement(doubleclick).click().perform();

            driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div/div[1]/input")).sendKeys("lambdaTest");

            WebElement move = driver.findElement(By.id("search-icon-legacy"));
            move.click();
            //  driver.findElement(By.id("search-icon-legacy")).click();


            System.out.println("scroll down");
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,500)");

            JavascriptExecutor scrollup = (JavascriptExecutor) driver;
            scrollup.executeScript("window.scrollBy(0,-500)");
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            if (driver.findElement(By.linkText("LambdaTest")).isDisplayed()) {
                status = "passed";


            } else {
                status = "failed";


            }
          /*  ((JavascriptExecutor) driver).executeScript("window.open()");
            ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(0));*/
            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);


        }
        catch (Exception e){

        }

    }

}
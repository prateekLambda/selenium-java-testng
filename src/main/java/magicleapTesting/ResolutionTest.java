package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import java.util.concurrent.TimeUnit;

public class ResolutionTest {

    public void Resolution(RemoteWebDriver driver, String ResolutionValue, String status, long ResolutionTotal, String ResolutionValueCap, SessionId session) {
        try {


            long ResolutionStart;
            long ResolutionStop;

            ResolutionStart = System.currentTimeMillis();
           /* ((JavascriptExecutor) driver).executeScript("window.open()");
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(2));*/
            driver.get("http://whatismyscreenresolution.net/");
            // for (int i = 0; i < 50; i++) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"resolution\"]")).isDisplayed();
            WebElement browserResolution = driver.findElement(By.xpath("//*[@id=\"resolution\"]"));
            browserResolution.getAttribute("innerText");

            ResolutionValue = browserResolution.getAttribute("innerText");
            ResolutionValue.trim().replaceAll("\\s", "");



            if (ResolutionValueCap.equalsIgnoreCase(ResolutionValue)) {


                status = "passed";

            } else {

                System.out.println("Resolution does not Matched");
                status = "failed";

            }


            ResolutionStop = System.currentTimeMillis();
            ResolutionTotal = ResolutionStop - ResolutionStart;
            System.out.println("Total time took for resolution" + "  " + ResolutionTotal / 1000f + "Sec.");
          //  ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            ((JavascriptExecutor) driver).executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\"}}");


            //}
        } catch (Exception R) {
            System.out.println(R+"    "+" SessionID --->"+"  "+session);
        }

    }
}

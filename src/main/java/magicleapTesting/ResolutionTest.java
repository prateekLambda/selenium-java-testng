package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
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


                status = "failed";

            }


            ResolutionStop = System.currentTimeMillis();
            ResolutionTotal = ResolutionStop - ResolutionStart;

          //  ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
         //   ((JavascriptExecutor) driver).executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\"}}");


            //}
        } catch (Exception R) {

            Date date;
            DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            formatter.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

            date = new Date();
            System.out.println(R + "\n" + "This is the Time TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" + date + "\n" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");

            System.out.println(R+"    "+" SessionID --->"+"  "+session);
        }

    }
}

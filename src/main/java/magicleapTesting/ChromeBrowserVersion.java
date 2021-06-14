package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeBrowserVersion {

    public void BrowserVersion(RemoteWebDriver driver) {
        try {
            driver.get("https://www.whatismybrowser.com/");

            Thread.sleep(5000);
            WebElement VersionValue = driver.findElement(By.xpath("/html/body/section/article[1]/div[1]/a"));
            VersionValue.getAttribute("innerText");
           // System.out.println("Chrome version value" + " = " + VersionValue.getAttribute("innerText") + "   " + deviceNameValue + "  " + platformVersionValue);
        } catch (Exception c) {
            System.out.println(c);

        }
        try {
            driver.get("http://thismachine.info/");
            Thread.sleep(5000);
            WebElement ExactVersionValue = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/p"));
            ExactVersionValue.getAttribute("innerText");
            System.out.println("Chrome Exact Version value" + " = " + ExactVersionValue.getAttribute("innerText"));
        } catch (Exception b) {

            System.out.println(b);
        }


    }

}

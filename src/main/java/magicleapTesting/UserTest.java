package magicleapTesting;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserTest {

    public void TestCase(RemoteWebDriver driver, String status) {
        try {

            driver.get("https://www.bikester.es/");
            //   ((JavascriptExecutor) driver).executeScript("lambda-name=" + getClass().getName());
            driver.manage().addCookie(new Cookie("httpOnly", "false"));
            driver.manage().addCookie(new Cookie("name", "kameleoonOptout"));
            driver.manage().addCookie(new Cookie("path", ""));
            driver.manage().addCookie(new Cookie("secure", "false"));
            driver.manage().addCookie(new Cookie("value", "true"));
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(40000, TimeUnit.MICROSECONDS);
            new WebDriverWait(driver, 30).until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("document.querySelector(\"#onetrust-accept-btn-handler\").click()");
            new WebDriverWait(driver, 30).until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            jse.executeScript("document.querySelector(\"body > header > div > div.header__nav.only-from-lg.js-headerNav > ul > li:nth-child(8) > a\").click();");
            new WebDriverWait(driver, 30).until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(1) > a\").click();");
            new WebDriverWait(driver, 30).until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(4) > a\").click();");
            new WebDriverWait(driver, 30).until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            jse.executeScript("document.querySelector(\"#\\\\36 0663b53052bc3ef9c88f2009f > div > div > a\").scrollIntoView();");

        } catch (Exception T) {
            System.out.println(T);
            status = "failed";

        }
        // ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);

    }
}

package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("document.querySelector(\"#onetrust-accept-btn-handler\").click()");
            wait.until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            jse.executeScript("document.querySelector(\"body > header > div > div.header__nav.only-from-lg.js-headerNav > ul > li:nth-child(8) > a\").click();");
            wait.until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(1) > a\").scrollIntoView();");
            wait.until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(1) > a\").click();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(4) > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(4) > a\").click();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#ae29b201919598a5ca8315ae1a > div > div > a\").scrollIntoView();");

            for (int Display = 1; Display <= 13; Display++) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[" + Display + "]/div/div")));

            }
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#main > div > div > div.scroll-pivot > div.js-searchbreadcrumbs.breadbrumbs-wrapper > ul > li:nth-child(4) > span > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#main > div > div > div.scroll-pivot > div.js-searchbreadcrumbs.breadbrumbs-wrapper > ul > li:nth-child(4) > span > a\").click();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(3) > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(3) > a\").click();");
            for (int Display = 1; Display <= 13; Display++) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[" + Display + "]/div/div")));

            }
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#main > div > div > div.scroll-pivot > div.js-searchbreadcrumbs.breadbrumbs-wrapper > ul > li:nth-child(4) > span > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#main > div > div > div.scroll-pivot > div.js-searchbreadcrumbs.breadbrumbs-wrapper > ul > li:nth-child(4) > span > a\").click();");

            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(5) > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(5) > a\").click();");
            Thread.sleep(5000);
            for (int Display = 1; Display <= 13; Display++) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[" + Display + "]/div/div")));

            }
            driver.get("https://www.bikester.es/outlet/bicicletas/");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(2) > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(2) > a\").click();");
            for (int Display = 1; Display <= 13; Display++) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[" + Display + "]/div/div")));

            }
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#main > div > div > div.scroll-pivot > div.js-searchbreadcrumbs.breadbrumbs-wrapper > ul > li:nth-child(4) > span > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#main > div > div > div.scroll-pivot > div.js-searchbreadcrumbs.breadbrumbs-wrapper > ul > li:nth-child(4) > span > a\").click();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(7) > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(7) > a\").click();");
            Thread.sleep(5000);

            for (int Display = 1; Display <= 13; Display++) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[" + Display + "]/div/div")));

            }
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"body > header > div > div.header__nav.only-from-lg.js-headerNav > ul > li:nth-child(1) > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"body > header > div > div.header__nav.only-from-lg.js-headerNav > ul > li:nth-child(1) > a\").click();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(1) > a\").scrollIntoView();");
            Thread.sleep(5000);
            jse.executeScript("document.querySelector(\"#category-level-0 > ul > li:nth-child(1) > a\").click();");
            Thread.sleep(5000);
            for (int Display = 1; Display <= 13; Display++) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[" + Display + "]/div/div")));

            }
            Thread.sleep(5000);
            driver.get("https://www.bikester.es/bicicletas/bicicletas-de-montana/");
            for (int Display = 1; Display <= 13; Display++) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[" + Display + "]/div/div")));

            }
            jse.executeScript("window.scrollBy(0,200)");
            Thread.sleep(5000);
            for (int Display = 13; Display <= 26; Display++) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[" + Display + "]/div/div")));

            }
        } catch (Exception T) {
            System.out.println(T);
            status = "failed";

        }
        // ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);

    }
}

package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserTest {

    public void TestCase(RemoteWebDriver driver, String status) {
        try {

            driver.get("https://lambdatest.github.io/sample-todo-app/");
            ((JavascriptExecutor) driver).executeScript("lambda-name=" + getClass().getName());
            driver.manage().addCookie(new Cookie("httpOnly", "false"));
            driver.manage().addCookie(new Cookie("name", "kameleoonOptout"));
            driver.manage().addCookie(new Cookie("path", ""));
            driver.manage().addCookie(new Cookie("secure", "false"));
            driver.manage().addCookie(new Cookie("value", "true"));
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(40000, TimeUnit.MICROSECONDS);
            new WebDriverWait(driver, 30).until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));

            if (driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed()) {
                driver.findElement(By.id("onetrust-accept-btn-handler")).click();
            }
            driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[8]/a")).isDisplayed();
            driver.findElement(By.linkText("/html/body/header/div/div[2]/ul/li[8]/a")).click();
            driver.findElement(By.linkText("Serious Rockville Disc 27.5\", negro")).isDisplayed();
            driver.findElement(By.linkText("Ortler Mainau Trapez, negro")).isDisplayed();
            driver.findElement(By.linkText("Ortler Van Dyck Wave, negro")).isDisplayed();
            driver.findElement(By.linkText("Serious Rockville 27.5\", negro/amarillo")).isDisplayed();
            driver.findElement(By.linkText("Serious Rockville 27.5\", verde")).isDisplayed();


        } catch (Exception T) {
            System.out.println(T);
            status = "failed";

        }
        // ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);

    }
}

package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UserTest {

    public void TestCase(RemoteWebDriver driver, String status) {
        try {


            String username = "storefront";
            String password = "storefront";
            driver.get("https://shop-stage.scholastic.com/teachers-ecommerce/teacher/tsohomepage.html");
            Thread.sleep(5000);
            driver.findElement(By.className("sch-global-profile-icon")).click();
            driver.findElement(By.linkText("Sign In")).click();
            Thread.sleep(15000);
            driver.switchTo().frame(driver.findElement(By.className("loginframe")));
            driver.switchTo().frame("loginIframe");
            Thread.sleep(5000);
            driver.findElement(By.id("signin-email-input")).sendKeys("testqa@test.com");
            Thread.sleep(10000);
            driver.findElement(By.id("signin-email-submit-button")).click();

            Thread.sleep(10000);
            driver.findElement(By.id("signin-password-input")).sendKeys("test1234");
            driver.findElement(By.id("signin-password-submit-button")).click();
            Thread.sleep(10000);
            driver.navigate().refresh();
            Thread.sleep(8000);
            driver.findElement(By.className("sch-global-username")).click();


        } catch (Exception T) {
            System.out.println(T);
            status = "failed";

        }
        // ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);

    }
}

package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

public class uploadTest {

    public void upload(RemoteWebDriver driver, String status) {
        try {
            driver.get("https://angular-file-upload.appspot.com/");
            driver.setFileDetector(new LocalFileDetector());
            driver.findElement(By.cssSelector("#editArea > div > div > form > fieldset > input:nth-child(2)")).sendKeys("Prateek-Singh-Lambda");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/fieldset/input[2]")).sendKeys("5mb.jpg");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/fieldset/button")).click();
            //Click on upload button
            status = "passed";


        } catch (Exception u) {
            System.out.println(u);
            status = "failed";
        }


        ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
    }
}

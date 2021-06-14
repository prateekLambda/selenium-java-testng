package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SessionTest {
    public void SessionLaunch(RemoteWebDriver driver, String status) {
        try {
            driver.get("http://www.google.com");
            driver.findElement(By.name("q")).click();
            driver.findElement(By.name("q")).sendKeys("LambdaTest");
            driver.findElement(By.name("btnK")).click();

            String TitleValue = "LambdaTest - Google Search";
            String GoogleTitleValue = driver.getTitle();
            if (TitleValue.equals(GoogleTitleValue)) {
                status = "passed";

            } else {
                status = "failed";
            }
        } catch (Exception b) {
            status = "failed";
            System.out.println(b);

        }
       // ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);

    }


}

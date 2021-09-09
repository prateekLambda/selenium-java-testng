package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CpuExten {

    public void extension(RemoteWebDriver driver, String status, String BrowserValue) {
        try {

            if (BrowserValue.matches("chrome") || BrowserValue.matches("Chrome")) {

                driver.get("chrome-extension://abhdadadmefcinkehbogolpfocgjkkgb/html/popup.html");
                WebDriverWait wait = new WebDriverWait(driver, 20);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("highcharts-9m7iwqa-0")));
                Thread.sleep(5000);
                TakeScreenShot shot = new TakeScreenShot();
                shot.Screenshot(driver, status);

            }


        } catch (Exception E) {
            System.out.println("Chrome Extension class giving error" + "    " + E);

        }
    }
}

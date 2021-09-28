package magicleapTesting;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.logging.Logger;

public class CpuExten {

    public void extension(RemoteWebDriver driver, String status, String BrowserValue, Logger log) {
        try {

            if (BrowserValue.matches("chrome") || BrowserValue.matches("Chrome")) {

                driver.get("chrome-extension://abhdadadmefcinkehbogolpfocgjkkgb/html/popup.html");
                TakeScreenShot shot = new TakeScreenShot();
                shot.Screenshot(driver, status, log);
            }


        } catch (Exception E) {
            System.out.println("Chrome Extension class giving error" + "    " + E);
            log.info(E.getMessage());

        }
    }
}

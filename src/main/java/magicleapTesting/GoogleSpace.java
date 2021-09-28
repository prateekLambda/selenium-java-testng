package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import java.util.logging.Logger;

public class GoogleSpace {
    public void GSpace(RemoteWebDriver driver, SessionId session, Logger log) {
        try {
            driver.get("https://mrdoob.com/projects/chromeexperiments/google-space/");

            Thread.sleep(3000);
            WebElement logo = driver.findElement(By.id("logo"));
            Actions slider = new Actions(driver);
            WebElement daylight = driver.findElement(By.id("logo"));
            slider.dragAndDropBy(daylight, 50, 0).build().perform();
            slider.dragAndDropBy(daylight, 10, 0).build().perform();
            slider.dragAndDropBy(daylight, -50, 0).build().perform();
            slider.dragAndDropBy(daylight, 100, 50).build().perform();
            slider.dragAndDropBy(daylight, 150, 100).build().perform();
            slider.dragAndDropBy(daylight, 200, 0).build().perform();
            slider.dragAndDropBy(daylight, 25, 200).build().perform();
            slider.dragAndDropBy(daylight, 50, 150).build().perform();
            slider.dragAndDropBy(daylight, 0, 100).build().perform();
            slider.dragAndDropBy(daylight, 0, -100).build().perform();
            slider.dragAndDropBy(daylight, 0, -150).build().perform();
            slider.dragAndDropBy(daylight, 0, -200).build().perform();
          /*  slider.dragAndDropBy(daylight, -10, -250).build().perform();
            slider.dragAndDropBy(daylight, -10, -260).build().perform();*/
            //     slider.dragAndDropBy(daylight, 10, 350).build().perform();
            //   slider.dragAndDropBy(daylight, -20, 400).build().perform();
            Thread.sleep(5000);
        } catch (Exception G) {

            log.info(G.getMessage() + "    " + " SessionID --->" + "  " + session);
        }

    }
}

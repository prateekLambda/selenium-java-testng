package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DesignPlane {

    public void plane(RemoteWebDriver driver, SessionId session) {
        try {
            driver.get("https://designyourown.newairplane.com/");
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container-canvas")));

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gallery > div.accordion-section-title.active > span.hint")));
            Actions slider = new Actions(driver);
            WebElement daylight = driver.findElement(By.id("container-canvas"));
            slider.dragAndDropBy(daylight, 50, 0).build().perform();
            slider.dragAndDropBy(daylight, 10, 0).build().perform();
            slider.dragAndDropBy(daylight, -50, 0).build().perform();
            driver.findElement(By.cssSelector("#gallery > div.accordion-section-title.active > span.hint")).click();

            driver.findElement(By.cssSelector("#designs-items > div.layers-item.static.off > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(2) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(3) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(4) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(5) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(6) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(7) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(8) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(9) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(10) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(11) > div.toggle")).click();
            driver.findElement(By.cssSelector("#designs-items > div:nth-child(12) > div.toggle")).click();
            Thread.sleep(5000);

            driver.findElement(By.cssSelector("#gallery > div.accordion-section-title")).click();
            driver.findElement(By.cssSelector("document.querySelector(\"#gallery > div.accordion-section-content.open > div.gallery-scroll-area.ps-container.ps-theme-default.ps-active-y > div.gallery-items-list > div.item.active > div.top > div.thumb > img\")")).click();
            driver.findElement(By.cssSelector("document.querySelector(\"#gallery > div.accordion-section-content.open > div.gallery-scroll-area.ps-container.ps-theme-default.ps-active-y > div.gallery-items-list > div.item.active > div.top > div.thumb > img\")")).click();

            Thread.sleep(5000);

        } catch (Exception p) {
            System.out.println(p);
            System.out.println(p+"    "+" SessionID --->"+"  "+session);

        }


    }
}

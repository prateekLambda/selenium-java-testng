package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.logging.Logger;

public class NetSpeed {
    public void NetSpeed(RemoteWebDriver driver, String status, long Nettotalspeedtest, Logger log) {
        try {
            long NetSpeedteststart;
            long NetSpeedteststop;
            NetSpeedteststart = System.currentTimeMillis();


            driver.get("https://testmy.net/");


            //  driver.findElement(By.cssSelector("#qc-cmp2-ui>div.qc-cmp2-footer.qc-cmp2-footer-overlay.qc-cmp2-footer-scrolled>div>button.css-47secv")).click();

            WebElement NetSpeed = driver.findElement(By.xpath("/html/body/div[1]/div/p[2]/a[2]"));
            NetSpeed.click();
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,200)");
            WebElement StarTesting = driver.findElement(By.xpath("/html/body/section/div[2]/div/div[1]/form/div[1]/div[2]/p[3]/input"));
            StarTesting.click();
            Thread.sleep(30000);
            driver.switchTo().frame("test_09837");

            WebElement DownloadSPeed = driver.findElement(By.xpath("/html/body/section/div[2]/div/div[1]/table/tbody/tr/td/div[2]/div[2]/div/div[1]/h3"));
            TakeScreenShot shot = new TakeScreenShot();
            shot.Screenshot(driver, status, log);
            System.out.println("Download speed of machine" + "  " + DownloadSPeed.getAttribute("innerText"));
            WebElement UploadSpeed = driver.findElement(By.xpath("/html/body/section/div[2]/div/div[1]/table/tbody/tr/td/div[2]/div[2]/div/div[2]/h3"));
            System.out.println("Upload Speed of the machine" + "  " + UploadSpeed.getAttribute("innerText"));

            status = "passed";

            NetSpeedteststop = System.currentTimeMillis();
            Nettotalspeedtest = NetSpeedteststop - NetSpeedteststart;
            System.out.println("Total time took to NetSpeed test" + "  " + Nettotalspeedtest / 1000f + "Sec.");

            //}
        } catch (Exception e) {

            status = "failed";
            log.info(e.getMessage());
        }
        //System.out.println(driver.getCapabilities());

    }
}

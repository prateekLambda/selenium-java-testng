package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Base64;

public class DownloadTest {

    public void FileDownload(RemoteWebDriver driver) {

        try {
            driver.get("https://www.stats.govt.nz/large-datasets/csv-files-for-download/");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//           // driver.switchTo().frame("iframeResult");
//
            WebElement element = driver.findElement(By.linkText("International trade: March 2021 quarter – CSV – corrected"));
            element.click();
//
            Thread.sleep(10000);

            Assert.assertEquals(((JavascriptExecutor) driver).executeScript("lambda-file-exists=international-trade-march-2021-quarter-csv-corrected.zip"), true); //file exist check

            System.out.println(((JavascriptExecutor) driver).executeScript("lambda-file-stats=international-trade-march-2021-quarter-csv-corrected.zip")); //retrieve file stats

            String base64EncodedFile = ((JavascriptExecutor) driver).executeScript("lambda-file-content=international-trade-march-2021-quarter-csv-corrected.zip").toString(); // file content download
            System.out.println(base64EncodedFile);


            byte[] data = Base64.getDecoder().decode(base64EncodedFile);
            OutputStream stream = new FileOutputStream("International trade: March 2021 quarter – CSV – corrected.zip");
            stream.write(data);

        } catch (Exception e) {

            System.out.println(e);
        }


    }
}

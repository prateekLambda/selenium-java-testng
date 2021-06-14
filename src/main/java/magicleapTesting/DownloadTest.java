package magicleapTesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class DownloadTest {

    public void FileDownload(RemoteWebDriver driver) {

        try {
//            driver.get("https://www.stats.govt.nz/large-datasets/csv-files-for-download/");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//           // driver.switchTo().frame("iframeResult");
//
//            WebElement element = driver.findElement(By.linkText("Business employment data: December 2020 quarter – CSV"));
//            element.click();
//
//            Thread.sleep(4000);

            Assert.assertEquals(((JavascriptExecutor) driver).executeScript("lambda-file-exists=ex.xpi"), true); //file exist check

            System.out.println(((JavascriptExecutor) driver).executeScript("lambda-file-stats=ex.xpi")); //retrieve file stats

//            String base64EncodedFile = ((JavascriptExecutor) driver).executeScript("lambda-file-content=business-employment-data-december-2020-quarter-csv.zip").toString(); // file content download
//            System.out.println(base64EncodedFile);
//
//
//            byte[] data = Base64.getDecoder().decode(base64EncodedFile);
//            OutputStream stream = new FileOutputStream("business-employment-data-december-2020-quarter-csv.zip");
//            stream.write(data);

        } catch (Exception e) {

            System.out.println(e);
        }


    }
}

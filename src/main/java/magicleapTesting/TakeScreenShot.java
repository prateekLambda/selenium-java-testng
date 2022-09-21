package magicleapTesting;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class TakeScreenShot {
    Date date;

    public void Screenshot(RemoteWebDriver driver, String status, Logger log) {
        try {

            String FilePath;
            DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
            Date date = new Date();
            FilePath = "target/" + dateFormat.format(date) + "/" + ".png ";
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(SrcFile, new File(FilePath));


        } catch (Exception e) {
            log.info(e.getMessage());
        }

    }
}

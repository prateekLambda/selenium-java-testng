package magicleapTesting;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TakeScreenShot {
    Date date;
    public void Screenshot(RemoteWebDriver driver, String status ) {
        try {

            System.out.println("ScreenShot taking Start" + "\n" + "This is the Time TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"+"\n" + date + "\n" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
            String FilePath;
            DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
            Date date = new Date();
            FilePath="Screenshots\\"+dateFormat.format(date)+"\\"+".png ";
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(SrcFile, new File(FilePath));
            System.out.println("ScreenShot taking Stop" + "\n" + "This is the Time TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +"\n"+ date + "\n" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");



        } catch (Exception e) {
            DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            formatter.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

            date = new Date();
            System.out.println(e+"\n"+"This is the Time TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"+"\n"+date+"\n"+"LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        }

    }
}

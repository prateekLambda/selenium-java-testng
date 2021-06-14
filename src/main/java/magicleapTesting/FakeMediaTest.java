package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FakeMediaTest {

    public void TestFakeMediaPermissions(RemoteWebDriver driver) {
        try {
            driver.get("https://webcamtests.com/check");
            driver.findElement(By.id("webcam-launcher")).click();
            Thread.sleep(5000);


        } catch (Exception T) {

            System.out.println(T);
        }
        try {
            driver.get("https://www.vidyard.com/mic-test/");
            driver.findElement(By.xpath("//a[@id='start-test']")).click();
            Thread.sleep(2000);
        } catch (Exception f) {
            System.out.println(f);

        }
        try {
            driver.get("https://www.onlinemictest.com/webcam-test/");
            driver.findElement(By.id("webcam-start")).click();
            Thread.sleep(5000);
        } catch (Exception L) {
        }

    }


}

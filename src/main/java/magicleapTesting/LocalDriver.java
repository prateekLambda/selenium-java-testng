package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LocalDriver {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");

      /*  FirefoxProfile profile = new FirefoxProfile();
        profile.addExtension(new File("E:\\extensions\\bugfix_editor.xpi"));*/
        // Instantiate a ChromeDriver class.
        /*Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory",  "C:\\Users\\LenovoE14\\Downloads");*/
       /* FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);*/
        //  options.addArguments("--headless");
        // options.setExperimentalOption("prefs",prefs);
        //  options.addExtensions(new File("E:\\extensions\\CPU.crx"));

        // For use with ChromeDriver:
        WebDriver driver = new ChromeDriver();        //  System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");


        try {

            driver.get("https://www.bikester.es/");
            //  ((JavascriptExecutor) driver).executeScript("lambda-name=" + getClass().getName());
            driver.manage().addCookie(new Cookie("httpOnly", "false"));
            driver.manage().addCookie(new Cookie("name", "kameleoonOptout"));
            driver.manage().addCookie(new Cookie("path", ""));
            driver.manage().addCookie(new Cookie("secure", "false"));
            driver.manage().addCookie(new Cookie("value", "true"));
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(40000, TimeUnit.MICROSECONDS);
            new WebDriverWait(driver, 30).until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));


        //    driver.findElement(By.xpath("Ortler Berlin SUV Dual Power 1125 WH, azul")).isDisplayed();

            driver.findElement(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[1]/div/div/div/a")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[2]/div/div/div/a")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div[5]/div/main/div/div/div[2]/div[3]/div[1]/div[2]/div[6]/div[3]/div/div/div/a")).isDisplayed();
          /*  driver.findElement(By.linkText("Serious Rockville 27.5\", negro/azul")).isDisplayed();
            driver.findElement(By.linkText("Serious Rockville Disc 27.5\", blanco")).isDisplayed();*/
            driver.quit();
        } catch (Exception e) {
            System.out.println(e);
            driver.quit();

        }
    }


}

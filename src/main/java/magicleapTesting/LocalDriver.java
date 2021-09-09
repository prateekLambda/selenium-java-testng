package magicleapTesting;

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
            //   ((JavascriptExecutor) driver).executeScript("lambda-name=" + getClass().getName());
            driver.manage().addCookie(new Cookie("httpOnly", "false"));
            driver.manage().addCookie(new Cookie("name", "kameleoonOptout"));
            driver.manage().addCookie(new Cookie("path", ""));
            driver.manage().addCookie(new Cookie("secure", "false"));
            driver.manage().addCookie(new Cookie("value", "true"));
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(40000, TimeUnit.MICROSECONDS);
            new WebDriverWait(driver, 30).until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("document.querySelector(\"#onetrust-accept-btn-handler\").click()");
            jse.executeScript("document.querySelector(\"body > header > div > div.header__nav.only-from-lg.js-headerNav > ul > li:nth-child(8) > a\").click();");//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("zoom-buttons")));
            /*String click = "arguments[0].click();";
            ((JavascriptExecutor) driver).executeScript(click, pegman);
*/
            driver.quit();
        } catch (Exception e) {
            System.out.println(e);
            driver.quit();

        }
    }


}

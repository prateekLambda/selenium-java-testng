package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        //  options.addExtensions(new File("E:\\extensions\\1.2.3_0.crx"));

        // For use with ChromeDriver:
        WebDriver driver = new ChromeDriver();        //  System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");


        try {
            driver.get("https://www.lambdatest.com/automation-demos/");
            driver.manage().window().maximize();
            WebElement login = driver.findElement(By.cssSelector("#newapply > div.w-360.ml-auto.text-center.smtablet\\:w-full.smtablet\\:ml-0 > button"));
            login.isDisplayed();
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#newapply > div.w-360.ml-auto.text-center.smtablet\\:w-full.smtablet\\:ml-0 > button")));
            driver.findElement(By.id("username")).sendKeys("lambda");
            driver.findElement(By.id("password")).sendKeys("lambda123");
            login.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("populate"))));
            driver.findElement(By.id("developer-name")).sendKeys("prateeks@lambdatest.com");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/p[4]/label/input")).click();
            driver.findElement(By.id("others")).click();
            Select dropdown = new Select(driver.findElement(By.id("preferred-payment")));
            dropdown.selectByIndex(2);
            driver.findElement(By.cssSelector("#tried-ecom")).click();
            WebElement buttondrag = driver.findElement(By.cssSelector("#__next > div.wrapper > section.my-50.automationbar.smtablet\\:px-20 > div > div > div.form-bottom > div.sliderBar > div > div > div:nth-child(1) > div > div:nth-child(12)"));
            Actions hold = new Actions(driver);

            hold.dragAndDropBy(buttondrag, -11, -6).build().perform();
            hold.dragAndDropBy(buttondrag, 49, -6).build().perform();
            hold.dragAndDropBy(buttondrag, 109, -6).build().perform();
            hold.dragAndDropBy(buttondrag, 169, -6).build().perform();
            hold.dragAndDropBy(buttondrag, 469, -6).build().perform();
            // hold.dragAndDropBy(buttondrag, 589, -6).build().perform();

            driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[4]/div[3]/textarea")).sendKeys("Hi This is Prateek Support Team is the best. Whatever it takes");
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,350)");
            driver.findElement(By.cssSelector("#file")).sendKeys("5mb.jpg");

            driver.quit();
        } catch (Exception e) {
            System.out.println(e);
            driver.quit();

        }
    }


}

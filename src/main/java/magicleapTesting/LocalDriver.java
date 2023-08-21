package magicleapTesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class LocalDriver {

    public static void main(String[] args) {

        String status = null;
        System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");

        FirefoxProfile profile = new FirefoxProfile();
        profile.addExtension(new File("E:\\extensions\\bugfix_editor.xpi"));
        // Instantiate a ChromeDriver class.
        /*Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory",  "C:\\Users\\LenovoE14\\Downloads");*/
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
      //  options.addArguments("--headless");
       // options.setExperimentalOption("prefs",prefs);
      //  options.addExtensions(new File("E:\\extensions\\1.2.3_0.crx"));

        // For use with ChromeDriver:
        WebDriver driver = new FirefoxDriver(options);        //  System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");


        try {

            driver.get("https://www.googl.com");
            Thread.sleep(50000000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.postMessage('clicked_browser_action', '*')");

//            driver.get("https://www.stats.govt.nz/large-datasets/csv-files-for-download/");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            // driver.switchTo().frame("iframeResult");
//
//            WebElement element = driver.findElement(By.linkText("Business employment data: December 2020 quarter – CSV"));
//            element.click();
//
//            Thread.sleep(10000);

          /*  driver.manage().window().maximize();
            driver.get("https://shop-stage.scholastic.com/teachers-ecommerce/teacher/tsohomepage.html");
            Thread.sleep(5000);
            driver.findElement(By.className("sch-global-profile-icon")).click();
            driver.findElement(By.linkText("Sign In")).click();
            Thread.sleep(15000);
            driver.switchTo().frame(driver.findElement(By.className("loginframe")));
            driver.switchTo().frame("loginIframe");
            Thread.sleep(5000);
            driver.findElement(By.id("signin-email-input")).sendKeys("testqa@test.com");
            Thread.sleep(10000);
            driver.findElement(By.id("signin-email-submit-button")).click();

            Thread.sleep(10000);
            driver.findElement(By.id("signin-password-input")).sendKeys("test1234");
            driver.findElement(By.id("signin-password-submit-button")).click();
            Thread.sleep(10000);
            driver.findElement(By.className("sch-global-username")).click();*/






            /*driver.get("https://pa-ua.fadv.com");
            driver.manage().window().maximize();
            Thread.sleep(10000);
            driver.findElement(By.id("loginInputEmail")).sendKeys("snvinl21@example.com");
            driver.findElement(By.id("loginInputPwd")).sendKeys("Test1234");

            driver.findElement(By.name("action")).click();
            System.out.println("Login Button CLicked");
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,500)");
            Thread.sleep(30000);
            driver.findElement(By.id("paNameNext")).click();
            scroll.executeScript("window.scrollBy(0,500)");
            Thread.sleep(5000);
            System.out.println("Name next CLicked");
            driver.findElement(By.id("paNoMiddleName")).click();
            scroll.executeScript("window.scrollBy(0,500)");
            System.out.println("NoMName next CLicked");
            Thread.sleep(5000);
            driver.findElement(By.id("aliasNoName")).click();
            scroll.executeScript("window.scrollBy(0,500)");
            System.out.println("alias next CLicked");
            Thread.sleep(5000);
            driver.findElement(By.id("paGenderSkipContinue")).click();
            Thread.sleep(15000);
            driver.findElement(By.id("dobdp-widget")).click();
            Thread.sleep(15000);
            driver.findElement(By.id("dobdp-widget")).sendKeys("11-11-1991");
            System.out.println("Calendar date Clicked");*/
            //  Thread.sleep(15000);
//            WebElement elm = driver.findElement(By.xpath("#slick-slide01 > div > div > form > div > div.row.form-element-section.btn_center > div > div > input"));
//            Thread.sleep(30000);
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].value='January 05,2001';",elm);

//            driver.get("https://127.0.0.1:8001/");
//            driver.manage().window().maximize();
//            System.out.println(driver.getTitle());
//            driver.manage().addCookie(new Cookie("test1", "cookie1"));
//            driver.manage().addCookie(new Cookie("test2", "cookie2"));
//            String Cache = driver.manage().getCookies().toString();
//
//            System.out.println(Cache);
//            Thread.sleep(5000);
//            JavascriptExecutor scroll = (JavascriptExecutor) driver;
//            scroll.executeScript("window.scrollBy(0,500)");
//            driver.findElement(By.linkText("legOfenris")).click();
//
//            Thread.sleep(7000);
//           /* ((JavascriptExecutor) driver).executeScript("lambda-throttle-network", "GPRS");
//            Thread.sleep(7000);*/
//            driver.navigate().back();
//            //  ((JavascriptExecutor) driver).executeScript("lambda-throttle-network", obj.toString());
//            String CacheTwo = driver.manage().getCookies().toString();
//            System.out.println(CacheTwo);
//            scroll.executeScript("window.scrollBy(0,-500)");
//            Thread.sleep(50000);

            /*String username = "storefront";
            String password = "storefront";

            driver.get("https://shop-qa.scholastic.com/teachers-ecommerce/teacher/tsohomepage.html");
            // SessionStorage username= new RemoteSessionStorage()

            Set<Cookie> beforeAuthCookies= driver.manage().getCookies();
            FileUtils.writeStringToFile(new File("src/test/java/beforeAuthCookies.txt"), String.valueOf(beforeAuthCookies));

            driver.findElement(By.className("sch-global-cart-icon")).click();
            String getUrl = driver.getCurrentUrl();
            String newURl = getUrl.replace("https://", "");
            System.out.println(newURl);
            driver.get("https://" + username + ":" + password + "@" + newURl);
            System.out.println(driver.getCurrentUrl());
            Set<Cookie> afterAuthCookies= driver.manage().getCookies();
            FileUtils.writeStringToFile(new File("src/test/java/afterAuthCookies.txt"), String.valueOf(afterAuthCookies));
            System.out.println(driver.getTitle());*/
            //scroll.executeScript("window.scrollBy(0,500)");
           /* JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,600)");

            driver.findElement(By.id("win2")).click();
*/




            /* *//*  driver.manage().window().maximize();
            WebDriverWait wait=new WebDriverWait(driver, 20);
            driver.get("https://www.nsw.gov.au/");
            driver.findElement(By.id("home-search-autosuggest-input")).sendKeys("Jobs");
            WebElement link;
            link= wait.until(ExpectedConditions.visibilityOfElementLocated  (By.xpath( "//*[@id=\"home-search-autosuggest-list\"]/li[2]")));
            link.click();*//*
            driver.manage().window().maximize();
            driver.get("https://www.lambdatest.com/");
            WebElement homePageLogin= driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/nav/div/ul/li[6]/a"));
            homePageLogin.click();
            Thread.sleep(2000);
            WebElement username= driver.findElement(By.name("email"));
        
            Thread.sleep(2000);
            WebElement loginPlatform= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/button"));
            loginPlatform.click();
            Thread.sleep(2000);
            WebElement VisualUIOption= driver.findElement(By.className("arrow-menu"));
            VisualUIOption.click();
            Thread.sleep(2000);
            WebElement clickScreenShot= driver.findElement(By.xpath("/html/body/div[2]/header/aside/ul/li[3]/ul/li[1]/a"));
            clickScreenShot.click();
            Thread.sleep(2000);
            WebElement ClickAutomation= driver.findElement(By.cssSelector("body > app-root > app-console > app-header > header > aside > ul > li:nth-child(4) > a"));
            ClickAutomation.click();
            Thread.sleep(2000);
            WebElement AutomationLogs= driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/main/div/div[2]/div[2]/ul/li[2]/a"));
            AutomationLogs.click();
            Thread.sleep(2000);
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,600)");
            scroll.executeScript("window.scrollBy(0,-500)");
            Thread.sleep(2000);
            WebElement AutoamtionAnalyticls= driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/main/div/div[2]/div[2]/ul/li[3]/a"));
            AutoamtionAnalyticls.click();
            Thread.sleep(2000);
            WebElement userPofile= driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/main/div/div[2]/div[1]/nav/div/div[2]/ul/li[5]/a/div/span/img"));
            userPofile.click();
            Thread.sleep(2000);
            WebElement Profile= driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/main/div/div[2]/div[1]/nav/div/div[2]/ul/li[5]/ul/li[2]/a"));
            Profile.click();
            Thread.sleep(2000);
            WebElement userPofilepage= driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div/ul/li[5]/a"));
            userPofilepage.click();
            Thread.sleep(2000);
            WebElement LogOut= driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div/ul/li[5]/div/a[9]"));
            LogOut.click();
           // WebElement DownloadSPeed = driver.findElement(By.xpath("/html/body/section/div[2]/div/div[1]/table/tbody/tr/td/div[2]/div[2]/div/div[1]/h3"));

          *//*  driver.get("http://teachables-stage.scholastic.com/teachables/guesthomepage.html");
            driver.manage().window().maximize();

        WebElement search= driver.findElement(By.className("teachablesnav-search--field"));
       // search.setAttribute
            String val = "hello";

            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.className("teachablesnav-search--field")));
            actions.click();


            for (int i = 0; i < val.length(); i++) {

                char c = val.charAt(i);
                String s = new StringBuilder().append(c).toString();
                System.out.println(s);
                actions.sendKeys(s);

                actions.build().perform();
                Thread.sleep(5000);
            }
            search.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(20000);*//*
            Thread.sleep(30000);*/
            driver.quit();
        } catch (Exception e) {
            System.out.println(e);
            driver.quit();

        }
    }


}

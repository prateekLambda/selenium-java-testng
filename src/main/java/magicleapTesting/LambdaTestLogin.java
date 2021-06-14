package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LambdaTestLogin {

    public void Lambda(RemoteWebDriver driver, String status){
        try{
            driver.manage().window().maximize();
            driver.get("https://www.lambdatest.com/");
            WebElement homePageLogin= driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/nav/div/ul/li[6]/a"));
            homePageLogin.click();
            Thread.sleep(2000);
            WebElement username= driver.findElement(By.name("email"));
            username.sendKeys("prateek.delguy@gmail.com");
            Thread.sleep(2000);
            WebElement password= driver.findElement(By.name("password"));
            password.sendKeys("9582334806");
            Thread.sleep(2000);
            WebElement loginPlatform= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/button"));
            loginPlatform.click();
            Thread.sleep(2000);
            WebElement message= driver.findElement(By.className("browser-compatibility-message"));


            WebElement VisualUIOption = driver.findElement(By.className("arrow-menu"));
            VisualUIOption.click();
            Thread.sleep(2000);
            WebElement clickScreenShot = driver.findElement(By.xpath("/html/body/div[2]/header/aside/ul/li[3]/ul/li[1]/a"));
            clickScreenShot.click();
            Thread.sleep(2000);
            WebElement ClickAutomation = driver.findElement(By.cssSelector("body > app-root > app-console > app-header > header > aside > ul > li:nth-child(4) > a"));
            ClickAutomation.click();
            Thread.sleep(2000);
            WebElement AutomationLogs = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/main/div/div[2]/div[2]/ul/li[2]/a"));
            AutomationLogs.click();
            Thread.sleep(2000);
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,600)");
            scroll.executeScript("window.scrollBy(0,-500)");
            Thread.sleep(2000);
            WebElement AutoamtionAnalyticls = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/main/div/div[2]/div[2]/ul/li[3]/a"));
            AutoamtionAnalyticls.click();
            driver.getCurrentUrl();
            String AutomationPageSource;
            AutomationPageSource = driver.getPageSource();
            System.out.println("Automation Page Source" + "  " + AutomationPageSource);
            System.out.println("Page Title Value" + "  " + driver.getTitle());
            System.out.println("Current Page URl" + "  " + driver.getCurrentUrl());
            Thread.sleep(2000);
            WebElement userPofile = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/main/div/div[2]/div[1]/nav/div/div[2]/ul/li[5]/a/div/span/img"));
            userPofile.click();
            Thread.sleep(2000);
            WebElement Profile = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/main/div/div[2]/div[1]/nav/div/div[2]/ul/li[5]/ul/li[2]/a"));
            Profile.click();
            Thread.sleep(2000);


            WebElement userPofilepage = driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div/ul/li[5]/a"));
            userPofilepage.click();
            String ProfilePageSource;
            ProfilePageSource = driver.getPageSource();
            System.out.println("Profile Page Source" + "  " + ProfilePageSource);
            System.out.println("Page Title Value" + "  " + driver.getTitle());
            System.out.println("Current Page URl" + "  " + driver.getCurrentUrl());

            Thread.sleep(2000);
            WebElement RealTimeClick = driver.findElement(By.xpath("/html/body/div[2]/header/aside/ul/li[2]/a"));
            RealTimeClick.click();
            String ReaTimePageSource;
            ReaTimePageSource = driver.getPageSource();
            System.out.println("Profile Page Source" + "  " + ReaTimePageSource);
            System.out.println("Page Title Value" + "  " + driver.getTitle());
            System.out.println("Current Page URl" + "  " + driver.getCurrentUrl());
            WebElement RealTimeTextField = driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-test-detail/div[1]/div[1]/div/div[1]/form/div[1]/input"));
            RealTimeTextField.sendKeys("M9582334806L22823610T09061992");
            RealTimeTextField.clear();
            RealTimeTextField.sendKeys("Mon9582334806Land22823610Tue09061992");




        }
        catch (Exception L){
            System.out.println(L);
        }
    }

}
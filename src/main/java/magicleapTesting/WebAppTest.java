package magicleapTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebAppTest {
    public void test(RemoteWebDriver driver) {

        try {
            driver.get("https://eshop-onweb-webinar-demo2.azurewebsites.net/");
            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
            WebElement ItemOne = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(1) > form > input.esh-catalog-button"));
            ItemOne.isDisplayed();
            ItemOne.click();
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > div > form > div > article > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input")));
            WebElement quantity = driver.findElement(By.cssSelector("body > div > div > form > div > article > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            quantity.sendKeys("10");
            WebElement continues = driver.findElement(By.cssSelector("body > div > div > form > div > div.row > section.esh-basket-item.col-xs-1"));
            continues.isDisplayed();
            continues.click();
            WebElement Itemtwo = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(2) > form > input.esh-catalog-button"));
            Itemtwo.isDisplayed();
            Itemtwo.click();
            WebElement ItemTwoquantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(2) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            ItemTwoquantity.isDisplayed();
            ItemTwoquantity.clear();
            ItemTwoquantity.sendKeys("10");
            // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement Logo = driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img"));
            wait.until(ExpectedConditions.visibilityOf(Logo));
            Logo.isDisplayed();
            Logo.click();
            WebElement ThirdItem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(3) > form > input.esh-catalog-button"));
            ThirdItem.isDisplayed();
            ThirdItem.click();
            WebElement ThirdQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(3) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            ThirdQuantity.isDisplayed();
            ThirdQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            WebElement fourthItem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(4) > form > input.esh-catalog-button"));
            fourthItem.isDisplayed();
            fourthItem.click();
            WebElement FourthItemQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(4) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            FourthItemQuantity.isDisplayed();
            FourthItemQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            WebElement fifthitem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(5) > form > input.esh-catalog-button"));
            fifthitem.isDisplayed();
            fifthitem.click();
            WebElement fifthItemQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(5) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            fifthItemQuantity.isDisplayed();
            fifthItemQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            WebElement sixthItem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(6) > form > input.esh-catalog-button"));
            sixthItem.isDisplayed();
            sixthItem.click();
            WebElement sixthItemQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(6) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            sixthItemQuantity.isDisplayed();
            sixthItemQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            WebElement seventhItem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(7) > form > input.esh-catalog-button"));
            seventhItem.isDisplayed();
            seventhItem.click();
            WebElement seventhItemQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(6) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            seventhItemQuantity.isDisplayed();
            seventhItemQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            WebElement eigthItem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(8) > form > input.esh-catalog-button"));
            eigthItem.isDisplayed();
            eigthItem.click();
            WebElement eigthItemQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(7) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            eigthItemQuantity.isDisplayed();
            eigthItemQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            WebElement ninthItem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(9) > form > input.esh-catalog-button"));
            ninthItem.isDisplayed();
            ninthItem.click();
            WebElement ninthItemQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(8) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            ninthItemQuantity.isDisplayed();
            ninthItemQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            WebElement tenthItem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(10) > form > input.esh-catalog-button"));
            tenthItem.isDisplayed();
            tenthItem.click();
            WebElement tenthItemQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(9) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            tenthItemQuantity.isDisplayed();
            tenthItemQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            WebElement next = driver.findElement(By.cssSelector("#Next"));
            next.isDisplayed();
            next.click();
            WebElement eleventhItem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(1) > form > input.esh-catalog-button"));
            eleventhItem.isDisplayed();
            eleventhItem.click();
            WebElement eleventhItemQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(10) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            eleventhItemQuantity.isDisplayed();
            eleventhItemQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            driver.findElement(By.xpath("/html/body/div/div/div[3]/div/article/nav/div[3]/a")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/div/div[3]/div/article/nav/div[3]/a")).click();
            WebElement twelthitem = driver.findElement(By.cssSelector("body > div > div > div.esh-catalog-items.row > div:nth-child(2) > form > input.esh-catalog-button"));
            twelthitem.isDisplayed();
            twelthitem.click();
            WebElement twelthItemQuantity = driver.findElement(By.cssSelector("body > div > div > form > div > article:nth-child(11) > div:nth-child(1) > section:nth-child(4) > input.esh-basket-input"));
            twelthItemQuantity.isDisplayed();
            twelthItemQuantity.sendKeys("10");
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).isDisplayed();
            driver.findElement(By.xpath("/html/body/div/header/div/article/section[1]/a/img")).click();
            Select Brand = new Select(driver.findElement(By.id("CatalogModel_BrandFilterApplied")));
            Brand.selectByIndex(1);
            Brand.selectByIndex(2);
            Brand.selectByIndex(3);
            Brand.selectByIndex(4);
            Brand.selectByIndex(5);
            Select Type = new Select(driver.findElement(By.id("CatalogModel_TypesFilterApplied")));
            Type.selectByIndex(1);
            Type.selectByIndex(2);
            Type.selectByIndex(3);
            Type.selectByIndex(4);
            WebElement cart = driver.findElement(By.cssSelector("body > div > header > div > article > section.col-lg-1.col-xs-12 > a > div.esh-basketstatus-image > img"));
            cart.isDisplayed();
            cart.click();
            WebElement login = driver.findElement(By.cssSelector("body > div > header > div > article > section.col-lg-4.col-md-5.col-xs-12 > div > section > div > a"));
            login.isDisplayed();
            login.click();
            WebElement username = driver.findElement(By.id("Input_Email"));
            username.isDisplayed();
            username.click();
            username.clear();
            username.sendKeys("Hyper");
            WebElement password = driver.findElement(By.id("Input_Password"));
            password.isDisplayed();
            password.click();
            password.clear();
            password.sendKeys("1234567");
            WebElement remember = driver.findElement(By.id("Input_RememberMe"));
            remember.isDisplayed();
            remember.click();
            WebElement loginButton = driver.findElement(By.cssSelector("body > div > div > div > div > section > form > div:nth-child(6) > button"));
            loginButton.isDisplayed();
            loginButton.click();
            Thread.sleep(10000);


            // wait.until(ExpectedConditions.visibilityOf(ItemOne));


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

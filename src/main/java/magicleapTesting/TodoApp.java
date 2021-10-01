package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TodoApp {
    float ClickCommandTime;
    long CommandStart;
    long CommandStop;
    float SendKeyCommand;
    long SendKeysStart;
    long SendKeysStop;


    public void TodoAppTest(RemoteWebDriver driver, String status, SessionId session, Logger log) {
        try {

                    //   Actions action = new Actions(driver);

           // System.out.println(driver.getTitle());
            driver.get("https://lambdatest.github.io/sample-todo-app/");
            ((JavascriptExecutor) driver).executeScript("lambda-name=" + getClass().getName());
            driver.manage().addCookie(new Cookie("httpOnly", "false"));
            driver.manage().addCookie(new Cookie("name", "kameleoonOptout"));
            driver.manage().addCookie(new Cookie("path", ""));
            driver.manage().addCookie(new Cookie("secure", "false"));
            driver.manage().addCookie(new Cookie("value", "true"));
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(40000, TimeUnit.MICROSECONDS);
            new WebDriverWait(driver, 30).until((ExpectedCondition) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));

            WebDriverWait wait = new WebDriverWait(driver, 30);
            WebElement firstItem;
            firstItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > div > div > ul > li:nth-child(1) > input")));
            WebElement secondItem = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(2) > input"));
            WebElement thirdItem = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(4) > input"));
            WebElement fifthElement = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(5) > input"));

            CommandStart = System.currentTimeMillis();

            firstItem.click();
            firstItem.isDisplayed();
            secondItem.click();
            secondItem.isDisplayed();
            TakeScreenShot todo = new TakeScreenShot();
            todo.Screenshot(driver, status, log);
            thirdItem.click();
            thirdItem.isDisplayed();
            fifthElement.click();
            fifthElement.isDisplayed();
            CommandStop = System.currentTimeMillis();
            ClickCommandTime = CommandStop - CommandStop / 1000f;
           /* WebElement firstOption = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(3) > input"));
            action.moveToElement(firstOption).click().perform();*/
            SendKeysStart = System.currentTimeMillis();
            driver.findElement(By.xpath("//*[@id=\"sampletodotext\"]")).sendKeys("new item added");
            SendKeysStop = System.currentTimeMillis();
            SendKeyCommand = SendKeysStop - SendKeysStart / 1000f;

            driver.findElement(By.xpath("//*[@id=\"addbutton\"]")).isDisplayed();
            driver.findElement(By.xpath("//*[@id=\"addbutton\"]")).click();
        } catch (Exception t) {
            log.info(t +"    "+" SessionID --->"+"  "+session);

        }
    }

}

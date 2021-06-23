package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TodoApp {
    float ClickCommandTime;
    long CommandStart;
    long CommandStop;
    float SendKeyCommand;
    long SendKeysStart;
    long SendKeysStop;


    public void TodoAppTest(RemoteWebDriver driver, String status) {
        try {

                    //   Actions action = new Actions(driver);

            System.out.println(driver.getTitle());
            driver.get("https://lambdatest.github.io/sample-todo-app/");
            WebDriverWait wait = new WebDriverWait(driver, 30);
            WebElement firstItem;
            firstItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > div > div > ul > li:nth-child(1) > input")));
            WebElement secondItem = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(2) > input"));
            WebElement thirdItem = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(4) > input"));
            WebElement fifthElement = driver.findElement(By.cssSelector("body > div > div > div > ul > li:nth-child(5) > input"));

            CommandStart = System.currentTimeMillis();

            firstItem.click();
            secondItem.click();
            TakeScreenShot todo = new TakeScreenShot();
            todo.Screenshot(driver, status);
            thirdItem.click();
            fifthElement.click();
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
            System.out.println(t);
        }
    }

}

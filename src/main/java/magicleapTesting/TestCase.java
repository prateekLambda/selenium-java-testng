package magicleapTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestCase {

    public void LongCase(RemoteWebDriver driver) {

        try {
            driver.get("https://www.seleniumeasy.com/test/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[2]/a")).click();
            driver.findElement(By.id("btn_basic_example")).click();

            Thread.sleep(5000);
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,300)");
            driver.findElement(By.linkText("Simple Form Demo")).click();
            driver.findElement(By.id("user-message")).sendKeys("This is me noob doing practice to being expert");
            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")).click();
            driver.findElement(By.id("sum1")).sendKeys("9582");
            driver.findElement(By.id("sum2")).sendKeys("9582");
            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
            System.out.println(driver.findElement(By.id("displayvalue")).getAttribute("innterText"));
            driver.findElement(By.linkText("Input Forms")).click();
            driver.findElement(By.linkText("Checkbox Demo")).click();
            driver.findElement(By.id("isAgeSelected")).click();
            scroll.executeScript("window.scrollBy(0,300)");
            driver.findElement(By.id("check1")).click();
            driver.findElement(By.linkText("Date pickers")).click();
            driver.findElement(By.linkText("Bootstrap Date Picker")).click();
            driver.findElement(By.className("input-group-addon")).click();
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tfoot/tr[1]/th")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div/div/input[1]")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div/div/input[1]")).sendKeys("01/02/2021");
            driver.findElement(By.linkText("Date pickers")).click();
            driver.findElement(By.linkText("JQuery Date Picker")).click();
            driver.findElement(By.name("from")).click();
            driver.findElement(By.linkText("15")).click();
            driver.findElement(By.name("to")).click();
            driver.findElement(By.linkText("25")).click();
        } catch (Exception L) {

            System.out.println(L);
        }
//        try {
//            driver.get("https://www.rockdoor.com/");
//            driver.findElement(By.linkText("Design your Door")).click();
//            WebDriverWait wait = new WebDriverWait(driver,600);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ms-Button ms-Button--primary root-102")));
//
//
//
//        } catch (Exception T) {
//            System.out.println(T);
//        }
    }
}

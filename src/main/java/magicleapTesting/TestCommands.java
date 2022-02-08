package magicleapTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class TestCommands {

    public void commands(RemoteWebDriver driver) {
        try {
            driver.get("http://the-internet.herokuapp.com/");
            List<WebElement> items = driver.findElements(By.cssSelector("#content > ul"));
            for (WebElement e : items) {
                if (e.getText().startsWith("A")) {
                    System.out.println("  ==> starts with 'A'");
                } else {
                    System.out.println("  ==> does NOT start with 'A'");
                }
            }
            driver.findElement(By.linkText("A/B Testing")).isDisplayed();
            driver.findElement(By.linkText("A/B Testing")).click();


            driver.get("https://www.lambdatest.com/selenium-playground/");
            WebElement cookies = driver.findElement(By.cssSelector("#__next > div.cookies__bar > div > span.inline-block.py-7.px-15.rounded.text-size-10.font-semibold.bg-lambda-900.text-white.cursor-pointer.hover\\:underline"));
            cookies.isDisplayed();
            cookies.click();
            WebElement formbutton = driver.findElement(By.linkText("Simple Form Demo"));
            formbutton.isDisplayed();
            formbutton.click();
            WebElement usermessage = driver.findElement(By.cssSelector("#user-message"));
            usermessage.isDisplayed();
            usermessage.sendKeys("This is Hypertest Sample Prateek Running");
            WebElement showoutput = driver.findElement(By.id("showInput"));
            showoutput.isDisplayed();
            showoutput.click();
            WebElement entera = driver.findElement(By.cssSelector("#sum1"));
            entera.isDisplayed();
            entera.click();
            entera.sendKeys("9");
            WebElement enterb = driver.findElement(By.cssSelector("#sum2"));
            enterb.isDisplayed();
            enterb.click();
            enterb.sendKeys("3");
            WebElement getvalues = driver.findElement(By.cssSelector("#gettotal > button"));
            getvalues.isDisplayed();
            getvalues.click();
            WebElement checkbox = driver.findElement(By.linkText("Checkbox Demo"));
            checkbox.isDisplayed();
            checkbox.click();
            WebElement age = driver.findElement(By.id("isAgeSelected"));
            age.isDisplayed();
            age.click();
            WebElement option1 = driver.findElement(By.cssSelector("#ex1-check1"));
            option1.isDisplayed();
            option1.click();
            WebElement option2 = driver.findElement(By.cssSelector("#ex1-check2"));
            option2.isDisplayed();
            option2.click();
            WebElement option3 = driver.findElement(By.cssSelector("#ex1-check3"));
            option3.isDisplayed();
            option3.click();
            WebElement option4 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div[4]/input"));
            option4.isDisplayed();
            option4.click();
            WebElement RadioButtons = driver.findElement(By.linkText("Radio Buttons Demo"));
            RadioButtons.isDisplayed();
            RadioButtons.click();
            WebElement selectMale = driver.findElement(By.cssSelector("#__next > div.wrapper > section.mt-50 > div > div > div.w-8\\/12.smtablet\\:w-full.px-15.smtablet\\:mt-20 > div:nth-child(3) > div.px-10.pt-20.pb-5 > label.text-size-16.mt-10.text-black.mr-20 > input"));
            selectMale.isDisplayed();
            selectMale.click();
            WebElement selectButton = driver.findElement(By.cssSelector("#buttoncheck"));
            selectButton.isDisplayed();
            selectButton.click();
            WebElement selectFemale = driver.findElement(By.cssSelector("#__next > div.wrapper > section.mt-50 > div > div > div.w-8\\/12.smtablet\\:w-full.px-15.smtablet\\:mt-20 > div:nth-child(3) > div.px-10.pt-20.pb-5 > label:nth-child(3) > input"));
            selectFemale.isDisplayed();
            selectFemale.click();
            selectButton.isDisplayed();
            selectButton.click();


        } catch (Exception e) {

        }
    }
}

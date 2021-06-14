package magicleapTesting;

import org.openqa.selenium.remote.RemoteWebDriver;

public class ServiceWorkerTest {
    public void ServiceWorkerTestLambda(RemoteWebDriver driver, String status) {
        try {
            /*JSONObject obj = new JSONObject();
            obj.put("download", "0");
            obj.put("upload", "0");*/
            //  System.out.println(obj.toString());
            driver.get("http://localhost:8001/");
            driver.navigate().refresh();

            Thread.sleep(10000);
            System.out.println(driver.getTitle());

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
//            ((JavascriptExecutor) driver).executeScript("lambda-throttle-network", "GPRS");
//            Thread.sleep(7000);
//            driver.navigate().back();
//            //  ((JavascriptExecutor) driver).executeScript("lambda-throttle-network", obj.toString());
//            String CacheTwo = driver.manage().getCookies().toString();
//            System.out.println(CacheTwo);
//            scroll.executeScript("window.scrollBy(0,-500)");
//            Thread.sleep(20000);
        } catch (Exception S) {

            System.out.println(S);
        }


    }
}

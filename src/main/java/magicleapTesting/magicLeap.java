package magicleapTesting;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class magicLeap {

    public String username = System.getProperty("LT_USERNAME");
    public String accesskey = System.getProperty("LT_ACCESS_KEY");
    public RemoteWebDriver driver;
    public String gridURL = "@hub.lambdatest.com/wd/hub"; //"@eu-central-1-hub.lambdatest.com/wd/hub";
    String status;
    String ResolutionValue;
    long quitestoptime;
    long totaltime;
    long totaltimeforlocaltest;
    long Nettotalspeedtest;
    long GeolocationTotal;
    long ResolutionTotal;
    long totaltesttimeDuration;
    SessionId session;
    String BrowserValue;
    String versionValue;
    String PlatformValue;
    String FixedIpValue;
    String ResolutionValueCap;
    String TimeZoneValue;
    String GeoLocationValue;
    String hub;
    String TestName;
    String Space = "  ";
    String Tunnel;
    long SuiteStart;
    long SuiteStop;
    long SuiteTotalTime;
    Long AllVersions = null;


    @org.testng.annotations.Parameters(value = {"browser", "version", "platform", "fixedIp", "resolution", "timezone", "geoLocation", "tunnel"})
    public magicLeap(String browser, String version, String platform, String fixedIp, String resolution, String timezone, String geoLocation, String tunnel) {
        try {
            BrowserValue = browser;
            versionValue = version;
            PlatformValue = platform;
            FixedIpValue = fixedIp;
            ResolutionValueCap = resolution;
            TimeZoneValue = timezone;
            GeoLocationValue = geoLocation;
            Tunnel = System.getProperty("tunnel");
            if (BrowserValue != null) {
                TestName = BrowserValue;
                if (PlatformValue != null) {
                    TestName = BrowserValue + Space + PlatformValue;
                    if (versionValue != null) {
                        TestName = BrowserValue + Space + PlatformValue + Space + versionValue;
                        if (FixedIpValue != null)
                            TestName = BrowserValue + Space + PlatformValue + Space + versionValue + Space + FixedIpValue;

                    }
                }
            }

        } catch (Exception t) {
        }
    }

    @BeforeTest
    public void setUp() throws Exception {
        System.out.println(this.TestName);
        try {


            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", this.BrowserValue);
            capabilities.setCapability("version", this.versionValue);
            //capabilities.setCapability("version", "latest" + "-" + i);
            capabilities.setCapability("platform", this.PlatformValue);
            capabilities.setCapability("build", "Performance/Jenkins-8 " + "  " + this.PlatformValue);
            capabilities.setCapability("name", this.TestName);
            capabilities.setCapability("resolution", this.ResolutionValueCap);
            capabilities.setCapability("console", true);
            capabilities.setCapability("network", false);
            capabilities.setCapability("visual", false);
           // capabilities.setCapability("fixedIP", this.FixedIpValue);
            /*capabilities.setCapability("safari.cookies", true);
            capabilities.setCapability("safari.popups", true);*/

           /* String[] Tags = new String[]{this.PlatformValue, this.versionValue};
            capabilities.setCapability("tags", Tags);*/


            //      capabilities.setCapability("safari.cookies", true);


            //  capabilities.setCapability("video", true);

            //        capabilities.setCapability("tunnel", true);

            //   capabilities.setCapability("selenium_version", "4.0.0-alpha-1");

          /*  System.out.println(Tunnel);
            if (this.Tunnel.matches("true")) {

               RunTunnelListener TunnelInitateObjectToStart= new RunTunnelListener();
                TunnelInitateObjectToStart.onExecutionStart();

                Thread.sleep(20000);
                capabilities.setCapability("tunnel", "true");
            }*/
            //      capabilities.setCapability("safari.cookies",true);
            //   capabilities.setCapability("region", "eu");
            //
            //   capabilities.setCapability("tunnel", "true");
        /*capabilities.setCapability("ie.driver","3.4.0");
        capabilities.setCapability("ie.compatibility",11001);*/
            //     capabilities.setCapability("tunnelName", "prateek");
            //           capabilities.setCapability("geoLocation", geoLocation);
            //    capabilities.setCapability("unboundRegion", "PUSE-EU");
            //       capabilities.setCapability("timezone", this.TimeZoneValue);
            //        capabilities.setCapability("geoLocation", this.GeoLocationValue);
            //     capabilities.setCapability("headless", true);
            //   capabilities.setCapability("networkThrottling", "Regular 4G");
            //  capabilities.setCapability("prerun", "lambda:BasicAuthChrome/pre/httpdialog.au3");
//            String[] Tags = new String[]{"myproject", "myproject2","myproject3"};
//
//            capabilities.setCapability("tags", Tags);

            StopWatch driverStart = new StopWatch();
            driverStart.start();

            hub = "http://" + username + ":" + accesskey + gridURL;
            System.out.println(hub);

            driver = new RemoteWebDriver(new URL(hub), capabilities);
            session = driver.getSessionId();

            //   System.out.println(driver + "Session ID" + "  " + session.toString() + "\n" + browser + version + "\n" + fixedIp);
            driverStart.stop();

            float timeElapsed = driverStart.getTime() / 1000f;
            System.out.println("Driver initiate time" + "   " + timeElapsed);
              /*  for (int j = 0; j < 6; j++) {
                    TodoApp TodoAppTestObject = new TodoApp();
                    TodoAppTestObject.TodoAppTest(driver);
                    ResolutionTest ResolutionTestObject = new ResolutionTest();
                    ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap);
                    StreamTest stream = new StreamTest();
                    stream.TestStream(driver, status);
                    uploadTest upTest = new uploadTest();
                    upTest.upload(driver, status);
                    ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
                }
                driver.quit();*/
           /* SessionTest SessionTestObject = new SessionTest();
            SessionTestObject.SessionLaunch(driver, status);*/

        } catch (
                MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception f) {
            status = "failed";
            System.out.println(f);
            // System.out.println(f.getMessage() + browser + version + fixedIp);
        }
        //  }


    }

    @Test
    public void DesktopScript() {
        try {
            SuiteStart = System.currentTimeMillis();
          /*  SessionTest SessionTestObject = new SessionTest();
            SessionTestObject.SessionLaunch(driver, status);*/
            //   driver.manage().window().maximize();
           /* ChromeBrowserVersion ChromeVersionObject = new ChromeBrowserVersion();
            ChromeVersionObject.BrowserVersion(driver);*/
//            uploadTest UPFile = new uploadTest();
//            UPFile.upload(driver, status);


/*

           /* if (this.BrowserValue.matches("Chrome")) {
                ChromeBrowserVersion ChromeVersionObject = new ChromeBrowserVersion();
                ChromeVersionObject.BrowserVersion(driver);

            }

            System.out.println(hub);*/
            System.out.println(driver.getCapabilities());

            TodoApp TodoAppTestObject = new TodoApp();
            TodoAppTestObject.TodoAppTest(driver);
            ResolutionTest ResolutionTestObject = new ResolutionTest();
            ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap);
            StreamTest stream = new StreamTest();
            stream.TestStream(driver, status);
           /* uploadTest upTest = new uploadTest();
            upTest.upload(driver, status);*/
            NetSpeed NetSpeedTestObject = new NetSpeed();
            NetSpeedTestObject.NetSpeed(driver, status, Nettotalspeedtest);
         //   LambdaTestLogin lambdaTest= new LambdaTestLogin();
          //  lambdaTest.Lambda(driver,status);
            SuiteStop = System.currentTimeMillis();
            SuiteTotalTime = SuiteStop - SuiteStart;
            System.out.println("Total Time Took for Test suite execute" + "   " + SuiteTotalTime/1000f);
          /*  UserTest Testuser = new UserTest();
            Testuser.TestCase(driver, status);*/
           /* TunnelTest TunnelTestObject = new TunnelTest();
            TunnelTestObject.tunnelTest(driver, status, totaltimeforlocaltest);
            System.out.println(Tunnel);*/
            /*if (this.Tunnel.matches("true")) {
                TunnelTest TunnelTestObject = new TunnelTest();
                TunnelTestObject.tunnelTest(driver, status, totaltimeforlocaltest);
            }*/

        /*    TunnelTest TunnelTestObject = new TunnelTest();
            TunnelTestObject.tunnelTest(driver, status, totaltimeforlocaltest);*/
           /* UserTest test = new UserTest();
            test.TestCase(driver, status);*/
           /* DownloadTest downLoad= new DownloadTest();
            downLoad.FileDownload(driver);*/
           /* ResolutionTest ResolutionTestObject = new ResolutionTest();
            ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap);*/
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @AfterTest
    @org.testng.annotations.Parameters(value = {"browser", "version", "platform"})
    public void tearDown(String version, String platform, String browser) throws Exception {
        long quitetimestart;
        long quitetimestop;

        quitetimestart = System.currentTimeMillis();
        if (driver != null) {
            System.out.println(driver + "Session ID" + "  " + session.toString());
            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            driver.quit();
            RunTunnelListener TunnelInitateObjectToStop = new RunTunnelListener();
            TunnelInitateObjectToStop.onExecutionFinish();


        }
        quitestoptime = System.currentTimeMillis();
        quitetimestop = quitestoptime - quitetimestart;
        System.out.println(platform + "  " + browser + "  " + version + "\n" + "Driver Quite time" + "   " + quitetimestop / 1000f + "Sec.");

    }


}


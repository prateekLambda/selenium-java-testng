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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class browserStack {

    public String username = "falconmagicleap_vci1oa";
    public String accesskey = "JxzszpGVzPndo6ySxp3r";
    public RemoteWebDriver driver;
    public String gridURL = "hub-cloud.browserstack.com"; //hub-virginia.lambdatest.com/wd/hub"@eu-central-1-hub.lambdatest.com/wd/hub";
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
    String BSos_version;
    String Bsos;
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
    Date date;


    @org.testng.annotations.Parameters(value = {"browser", "version", "os_version", "os", "resolution", "timezone", "geoLocation", "tunnel"})
    public browserStack(String browser, String version, String os_version, String os, String resolution, String timezone, String geoLocation, String tunnel) {
        try {
            BrowserValue = browser;
            versionValue = version;
            BSos_version = os_version;
            Bsos = os;
            ResolutionValueCap = resolution;
            TimeZoneValue = timezone;
            GeoLocationValue = geoLocation;
            Tunnel = System.getProperty("tunnel");
            if (BrowserValue != null) {
                TestName = BrowserValue;
                if (BSos_version != null) {
                    TestName = BrowserValue + Space + BSos_version;
                    if (versionValue != null) {
                        TestName = BrowserValue + Space + BSos_version + Space + versionValue;
                        if (Bsos != null)
                            TestName = BrowserValue + Space + BSos_version + Space + versionValue + Space + Bsos;

                    }
                }
            }

        } catch (Exception t) {
        }
    }

    @BeforeTest
    public void setUp() throws Exception {
        System.out.println(this.TestName);
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        date = new Date();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                try {


                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("browserName", this.BrowserValue);
                    capabilities.setCapability("os_version",this.BSos_version);
                    //   capabilities.setCapability("version", "latest");
                    capabilities.setCapability("browser_version", "latest" + "-" + j);
                    capabilities.setCapability("os", this.Bsos);
                    //capabilities.setCapability("build", date +"  "+this.PlatformValue + System.getenv("LT_BUILD_NAME"));
                    capabilities.setCapability("build", "Jenkins"+"  " + formatter.format(date) + "  " + this.BSos_version +"  "+ System.getProperty("BUILD_NUMBER"));
                    capabilities.setCapability("name", this.TestName);
                    //   capabilities.setCapability("resolution", this.ResolutionValueCap);
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

                    hub = "https://" + username + ":" + accesskey + "@" + gridURL + "/wd/hub";
                    System.out.println(hub);

                    driver = new RemoteWebDriver(new URL(hub), capabilities);
                    session = driver.getSessionId();

                    System.out.println("====================DriverStart-up+++++++++++" + session + "+++++++++++DriverStart-up===================================");

                    //   System.out.println(driver + "Session ID" + "  " + session.toString() + "\n" + browser + version + "\n" + fixedIp);
                    driverStart.stop();

                    float timeElapsed = driverStart.getTime() / 1000f;
                    System.out.println("Driver initiate time" + "   " + timeElapsed);
                    DesktopScript();
                    tearDown();


                } catch (
                        MalformedURLException e) {
                    System.out.println("Invalid grid URL");
                } catch (Exception f) {
                    status = "failed";
                    System.out.println(f);
                    // System.out.println(f.getMessage() + browser + version + fixedIp);
                }
            }
        }

    }

    @Test
    public void DesktopScript() {
        try {
            System.out.println("==================TestStart+++++++++++++" + session + "++++++++++++++++TestStart==================");

            SuiteStart = System.currentTimeMillis();

            TodoApp TodoAppTestObject = new TodoApp();
            TodoAppTestObject.TodoAppTest(driver, status, session);
            ResolutionTest ResolutionTestObject = new ResolutionTest();
            ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap, session);
            GeolocationTest geo = new GeolocationTest();
            geo.Geolocation(driver, status, GeolocationTotal, session);
            TestCase SeleniumTest = new TestCase();
            SeleniumTest.LongCase(driver, session);
            GoogleSpace space = new GoogleSpace();
            space.GSpace(driver, session);
            SuiteStop = System.currentTimeMillis();
            SuiteTotalTime = SuiteStop - SuiteStart;
            System.out.println("Total Time Took for Test suite execute" + "   " + SuiteTotalTime / 1000f);
            System.out.println("=======================TestStop++++++++++++++" + session + "++++++++++++++++TestStop==============");

        } catch (Exception e) {
            System.out.println(e + "    " + " SessionID --->" + "  " + session);
        }
    }


    @AfterTest
    @org.testng.annotations.Parameters(value = {"browser", "version", "platform"})
    public void tearDown() throws Exception {
        long quitetimestart;
        long quitetimestop;

        quitetimestart = System.currentTimeMillis();
        if (driver != null) {
            System.out.println("=============" + session + "================");
            ((JavascriptExecutor) driver).executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\"}}");
            driver.quit();



        }
        quitestoptime = System.currentTimeMillis();
        quitetimestop = quitestoptime - quitetimestart;

    }


}


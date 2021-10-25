package magicleapTesting;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.remote.http.HttpClient;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.logging.Logger;


public class magicLeap {

    public String username = System.getProperty("LT_USERNAME");
    public String accesskey = System.getProperty("LT_ACCESS_KEY");

    public RemoteWebDriver driver;
    public String gridURL = System.getProperty("GRID_URL");
    //hub-virginia.lambdatest.com/wd/hub"@eu-central-1-hub.lambdatest.com/wd/hub";https://dark-1-hub.lambdatest.com/wd/hub/status
    //https://dark-2-hub.lambdatest.com/wd/hub/status
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
    Date date;
    Logger log = Logger.getLogger(magicLeap.class.getName());


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
                }
            }

        } catch (Exception t) {
        }
    }

    @BeforeTest
    public void setUp() throws Exception {
        System.out.println(this.TestName);
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        date = new Date();
        for (int i = 0; i <= 200; i++) {
            for (int j = 0; j <= 10; j++) {
                try {
                    String[] file = {"5mb.jpg", "10MB1.jpg", "10MB2.jpg", "10MB3.jpg", "10MB4.jpg", "10MB5.jpg", "10MB6.jpg", "10MB7.jpg", "10MB8.jpg", "10MB9.jpg", "10MB10.jpg"};
                    String region = "us";
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("browserName", this.BrowserValue);
                    //   capabilities.setCapability("version", "latest");
                    capabilities.setCapability("version", "latest" + "-" + j);
                    capabilities.setCapability("platform", this.PlatformValue);
                    //capabilities.setCapability("build", date +"  "+this.PlatformValue + System.getenv("LT_BUILD_NAME"));
                    capabilities.setCapability("build", formatter.format(date) + System.getProperty("BUILD_NAME"));
                    capabilities.setCapability("name", this.TestName + " " + FixedIpValue);
                    //  capabilities.setCapability("resolution", "1280x1024");
                    //capabilities.setCapability("lambda:userFiles", file);
                    capabilities.setCapability("console", true);
                    capabilities.setCapability("network", true);
                    //    capabilities.setCapability("visual", true);
                    //  capabilities.setCapability("selenium_version", "3.141.59");
                    //capabilities.setCapability("fixedIP", "213292378");
                    //   capabilities.setCapability("fixedIP", "9832721.912839.0298738921.098");

                    //capabilities.setCapability("region", region);
                    //  capabilities.setCapability("idleTimeout", "600");
//                    if (this.BrowserValue.matches("chrome") || this.BrowserValue.matches("Chrome")) {
//                        ChromeOptions options = new ChromeOptions();
//                        options.addExtensions(new File("Extensions/CPU.crx"));
//
//                        capabilities.setCapability("LT:Options", options);
//                    }
                    //  capabilities.setCapability("queueTimeout", "900");

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
                  /*  System.getProperties().put("http.proxyHost", "localhost");
                    System.getProperties().put("http.proxyPort", "9688");*/
                    log.info(capabilities.toString());
                    hub = "http://" + username + ":" + accesskey + "@" + gridURL + "/wd/hub";
                    //hub = "http://localhost:8080/wd/hub";
                    log.info(hub);
                    System.out.println("Start Time" + " " + formatter.format(date));
                    HttpClient.Factory factory = HttpClient.Factory.createDefault();
                    HttpClient.Builder builder = factory.builder()
                            .readTimeout(Duration.ofSeconds(1800))
                            .connectionTimeout(Duration.ofSeconds(1800));

                    new HttpCommandExecutor(ImmutableMap.of(), new URL(hub), new HttpClient.Factory() {
                        @Override
                        public HttpClient.Builder builder() {
                            return new HttpClient.Builder() {
                                @Override
                                public HttpClient createClient(URL url) {
                                    return builder.createClient(url);
                                }
                            };
                        }

                        @Override
                        public void cleanupIdleClients() {
                            factory.cleanupIdleClients();
                        }
                    });
                    HttpCommandExecutor executor = new HttpCommandExecutor(new HashMap<>(), new URL(hub), factory);
                    driver = new RemoteWebDriver(executor, capabilities);

//                    driver = new RemoteWebDriver(new URL(hub), capabilities);
/*
                    aPiCalls con = new aPiCalls();
                    con.concurrency();*/
                    //set timeout to 5 seconds

                    session = driver.getSessionId();
                    log.info(session.toString());
                    DesktopScript();
                    tearDown();
                    driver.quit();
                    driverStart.stop();

                    float timeElapsed = driverStart.getTime() / 1000f;
                    System.out.println("Driver initiate time" + "   " + timeElapsed);


                } catch (MalformedURLException e) {
                    System.out.println("Invalid grid URL");
                    log.info(e.getMessage());


                } catch (Exception f) {
                    log.info(f.getMessage());
                    status = "failed";

                }
            }
        }

    }

    @Test
    public void DesktopScript() {
        try {
            log.info("==================TestStart+++++++++++++" + session + "\n" + date + "++++++++++++++++TestStart==================");
//            driver.get("https://www.amazon.in/");
//            System.out.println(driver.getTitle());
//            for (int index = 0; index <= 10; index++) {
//                Thread.sleep(1000);
//            }
          /*  driver.get("https://www.amazon.in/");
            System.out.println(driver.getTitle());
            for (int index = 0; index <= 20; index++) {
                Thread.sleep(1000);
            }*/
          /*  UserTest user = new UserTest();
            user.TestCase(driver, status);*/

            CpuExten exten = new CpuExten();
            //   exten.extension(driver, status, this.BrowserValue);
            /*TakeScreenShot shot = new TakeScreenShot();
            shot.Screenshot(driver, status, log);*/

            log.info("LambdaTest Tutorial Test initiated");
            LambdaTutrial tut = new LambdaTutrial();
            tut.Lambdacert(driver, session, log);
            //  shot.Screenshot(driver, status, log);
            log.info("LambdaTest Tutorial Test Stopped");


            //     exten.extension(driver, status, this.BrowserValue);
            /*
                shot.Screenshot(driver, status);*/
            //   exten.extension(driver, status, this.BrowserValue);
            log.info("Resolution Test initiated");
            ResolutionTest ResolutionTestObject = new ResolutionTest();
            ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap, session, log);
            // shot.Screenshot(driver, status, log);
            log.info("Resolution Test Stopped");

            // exten.extension(driver, status, this.BrowserValue);
            log.info("Google Space Test initiated");
            GoogleSpace space = new GoogleSpace();
            space.GSpace(driver, session, log);
            // shot.Screenshot(driver, status, log);
            log.info("Google Space Test Stopped");
            //exten.extension(driver, status, this.BrowserValue);
            log.info("Selenium Test Started");
            TestCase SeleniumTest = new TestCase();
            SeleniumTest.LongCase(driver, session, log);
            //   shot.Screenshot(driver, status, log);
            log.info("Selenium Test Stopped");
//            DesignPlane fly = new DesignPlane();
//            fly.plane(driver, session, log);
            //exten.extension(driver, status, this.BrowserValue);
            log.info("Geolocation Test Started");
            GeolocationTest geo = new GeolocationTest();
            geo.Geolocation(driver, status, GeolocationTotal, session, log);
            //   shot.Screenshot(driver, status, log);
            log.info("Geolocation Test Stopped");

            // exten.extension(driver, status, this.BrowserValue);
            log.info("VideoUpload Test Started");
            VideoUpload test = new VideoUpload();
            test.vidupload(driver, log);

            //exten.extension(driver, status, this.BrowserValue);
            //  shot.Screenshot(driver, status, log);
            log.info("VideoUpload Test Stopped");
            //exten.extension(driver, status, this.BrowserValue);
            log.info("BadSSl Test Started");
            BadSslTest bad = new BadSslTest();
            bad.badSsl(driver, status, log);
            //   shot.Screenshot(driver, status, log);
            log.info("BadSSl Test Stopped");

            SuiteStop = System.currentTimeMillis();
            SuiteTotalTime = SuiteStop - SuiteStart;
            log.info("Total Time Took for Test suite execute" + "   " + SuiteTotalTime / 1000f);
            log.info(session.toString());
            status = "passed";
        } catch (Exception e) {
            log.info(e.getMessage());
            log.info(session.toString());
            status = "failed";

        }
    }


    @AfterTest
    @org.testng.annotations.Parameters(value = {"browser", "version", "platform"})
    public void tearDown() throws Exception {
        long quitetimestart;
        long quitetimestop;

        quitetimestart = System.currentTimeMillis();
        if (driver != null) {
            //  new aPiCalls(username, accesskey).getSessionDetails(session.toString());
            log.info(session.toString());
            //((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            //    driver.quit();

        }
        quitestoptime = System.currentTimeMillis();
        quitetimestop = quitestoptime - quitetimestart;

    }


}


package Pages;
import Pages.AndroidPages.AndroidHomePage;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;
public class AppiumAndroidTest {
    private AndroidDriver driver;

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("--full-reset", true);
        capabilities.setCapability("devicereadytimeout", "10000");
        capabilities.setCapability("deviceName","defaul1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.0.2");
        capabilities.setCapability("app", "/Users/gabrielholmes/Desktop/android-debug.apk");
        capabilities.setCapability("locationServicesEnabled", "true");
        capabilities.setCapability("prelaunch", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);




    }



   @After
    public void tearDown() throws Exception {
        driver.quit();
   }

    @Test
    public void testAndroidLocation() throws Exception {
        AndroidHomePage page = new AndroidHomePage(driver);
        page.updateLocation();
     }

    }



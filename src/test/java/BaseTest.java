import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","your android version here");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("deviceName","your device name here");

        cap.setCapability("app","your app path here");


        driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);




    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}

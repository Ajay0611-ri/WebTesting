package Tests;

import DriverCreation.Base;
import Pages.DialerPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DialerTest extends Base {

    private DialerPage dialerPage;

//    @Before
//    public void setUp() throws MalformedURLException, InterruptedException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("appium:automationName", "uiautomator2");
//        capabilities.setCapability("appium:deviceName", "vivo V2140");
//        capabilities.setCapability("appium:platformVersion", "12");
//        capabilities.setCapability("appium:appPackage", "com.google.android.dialer");
//        capabilities.setCapability("appium:appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
//
//        URL url = new URL("http://127.0.0.1:4723/");
//        driver = new AndroidDriver(url, capabilities);
//
//        dialerPage = new DialerPage(driver);
//
//        // Adding a delay to ensure the app is ready
//        Thread.sleep(5000);
//    }

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        super.setUp();
        dialerPage = new DialerPage(driver);
    }
    @Test
    public void testDialerFunctionality() throws InterruptedException {
        dialerPage.openDialpad();

        // Dial the number 9753436996
        dialerPage.dialNumber("9753436996");

        // Adding delay to ensure the digits are registered
        Thread.sleep(5000);
        dialerPage.initiateCall();

        // Adding delay to ensure call options are available
        Thread.sleep(5000);
        dialerPage.selectFirstContact();

        System.out.println("Successfully initiated the call.");
    }

    @After
    public void tearDown() {
        super.tearDown();
    }
}

package DriverCreation;

import Pages.DialerPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Base {
    protected AppiumDriver driver;

    public void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "uiautomator2");
        capabilities.setCapability("appium:deviceName", "vivo V2140");
        capabilities.setCapability("appium:platformVersion", "12");
        capabilities.setCapability("appium:appPackage", "com.google.android.dialer");
        capabilities.setCapability("appium:appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, capabilities);
        DialerPage dialerPage = new DialerPage(driver);


    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

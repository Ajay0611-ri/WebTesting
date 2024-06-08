package DriverCreation;

import io.appium.java_client.AppiumDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Base {
    @Test
    public void createDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set the capabilities
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "uiautomator2");
        caps.setCapability("appium:deviceName", "Small Phone");
        caps.setCapability("appium:app", "C:\\Users\\av896\\Downloads\\Test.apk");
//        caps.setCapability("platformversion", "13");  for real device here we declared the version

        URL url = URI.create("http://127.0.0.1:4723/").toURL();
        AppiumDriver driver = new AppiumDriver(url, caps);

        System.out.println("Successfully installed");

        driver.quit();
    }
}

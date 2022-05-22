package Drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import javafx.scene.chart.ValueAxis;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import test.mobile.drive.DriverPool;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static javafx.scene.input.KeyCode.V;

public class AndroidDriverPool {
    public static AndroidDriver create() {
        AndroidDriver<AndroidElement> driver = null;

            DesiredCapabilities caps = new DesiredCapabilities();

            String appiumURL = "http://127.0.0.1:4723/wd/hub";

            caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "29.0");
            caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + File.separator + "app/alta-online-shop.apk");

            try {
                driver = new AndroidDriver<AndroidElement>(new URL(appiumURL), caps);
            } catch (MalformedURLException e) {

                e.printStackTrace();
            }
            return driver;
        }
}


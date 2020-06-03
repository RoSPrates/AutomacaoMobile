package br.com.cursoudemy.appium.core;

import br.com.cursoudemy.appium.enuns.Apk;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    private static AndroidDriver<MobileElement> driver;

    private static void createDiver(String udid, boolean ativo) {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        capabilities.setCapability(MobileCapabilityType.APP, Apk.CTAPPIUM.getCaminho().getAbsolutePath());
        if (ativo) capabilities.setCapability(MobileCapabilityType.UDID, udid);

        URL remoteUrl;

        try {
            remoteUrl = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver(remoteUrl, capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static AndroidDriver<MobileElement> getDriver(String udid) {
        if (driver == null) createDiver(udid, true);
        return driver;
    }

    public static AndroidDriver<MobileElement> getDriver() {
        if (driver == null) createDiver("", false);
        return driver;
    }

    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}

package br.com.cursoudemy.appium.install;

import br.com.cursoudemy.appium.enuns.Apk;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Install {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;


    @Before
    public void install() {
        boolean ativo = false;
        String udid = "";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.APP, Apk.CAULCULADORA_MI.getCaminho().getAbsolutePath());
        if (ativo) capabilities.setCapability(MobileCapabilityType.UDID, udid);

        URL remoteUrl;

        try {
            remoteUrl = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver(remoteUrl, capabilities);
            wait = new WebDriverWait(driver,120);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void login(){

    }
}

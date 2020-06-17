package br.com.cursoudemy.appium.core;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static br.com.cursoudemy.appium.core.DriverFactory.getDriver;

public class Hooks {

    @After
    public void tearDown(Scenario scenario) {
        gerarScreenShot(scenario.getName());
        getDriver().resetApp();
    }

    public void gerarScreenShot(String name) {
        try {
            File imagem = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshot/" + name + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

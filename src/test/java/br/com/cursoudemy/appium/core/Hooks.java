package br.com.cursoudemy.appium.core;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks {


    @Rule
    public TestName testName = new TestName();

    @After
    public void tearDown(Scenario scenario) {
        gerarScreenShot(scenario.getName());
        DriverFactory.getDriver().resetApp();
    }

    @AfterClass
    public static void finalizaClasse() {
        DriverFactory.killDriver();
    }

    public void gerarScreenShot(String name) {
        try {
            File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshot/" + name + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

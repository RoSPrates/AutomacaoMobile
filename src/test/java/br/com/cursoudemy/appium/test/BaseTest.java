package br.com.cursoudemy.appium.test;

import br.com.cursoudemy.appium.core.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    @Rule
    public TestName testName = new TestName();

    @After
    public void tearDown() {
        gerarScreenShot();
        DriverFactory.getDriver().resetApp();
    }

    @AfterClass
    public static void finalizaClasse() {
        DriverFactory.killDriver();
    }

    public void gerarScreenShot() {
        try {
            File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshot/" + testName.getMethodName() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

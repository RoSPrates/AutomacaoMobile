package br.com.cursoudemy.appium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static br.com.cursoudemy.appium.core.AppiumServerUtils.startServer;
import static br.com.cursoudemy.appium.core.AppiumServerUtils.stopServer;
import static br.com.cursoudemy.appium.core.DriverFactory.killDriver;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"json:target/cucumber.json",
        "html:target/cucumber-report"},
        features = {"src/test/resources/features"},
        glue = {"br/com/cursoudemy/appium/steps", "br/com/cursoudemy/appium/core"},
        tags = {})
public class RunTest {

    @BeforeClass
    public static void beforeTests() {
        startServer();
    }

    @AfterClass
    public static void afterTests() {
        killDriver();
        stopServer();
    }
}

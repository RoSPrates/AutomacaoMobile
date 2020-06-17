package br.com.cursoudemy.appium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty",
        "json:target/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"br/com/cursoudemy/appium/steps", "br/com/cursoudemy/appium/core"},
        tags = {"@splash"})
public class RunTest {

}

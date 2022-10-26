package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/rihad/eclipse-workspace/CucumberProject/src/test/resources/Features",
glue = {"stepDefs"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports"},
tags = "@tag1"
		)
public class TestRunner {

}

package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="E:\\demo\\lib\\src\\test\\resources\\features" , glue = { "stepDefinition" }, monochrome = true)
public class TestRunner {

}




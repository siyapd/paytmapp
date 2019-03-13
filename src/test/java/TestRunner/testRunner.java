package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features" , glue="StepDefinations")

@Test
public class testRunner extends AbstractTestNGCucumberTests {
	
	

}

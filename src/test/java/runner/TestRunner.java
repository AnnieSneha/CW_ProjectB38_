package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {
				
			    "C:\\Users\\annie\\OneDrive\\Documents\\Desktop\\Construct_Week_B38\\Cucumber(TestNG) Naaptol\\src\\test\\resources\\Naaptol\\WomensWear.feature",
                
				"C:\\Users\\annie\\OneDrive\\Documents\\Desktop\\Construct_Week_B38\\Cucumber(TestNG) Naaptol\\src\\test\\resources\\Naaptol\\MensWear.feature"

		},
		
glue = "step_definition")

public class TestRunner extends AbstractTestNGCucumberTests{

}

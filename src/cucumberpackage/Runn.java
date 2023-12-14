package cucumberpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Shub\\eclipse-workspace\\Java_Training\\src\\cucumberpackage\\A.feature",
		glue = {"cucumberPackage"},
		dryRun = false
		)
public class Runn {


}

package Package_10_24;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Takescreenshot1 {
	
	WebDriver driver;
	
	public void captureScreenshot(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
		
			//then Create a ref of Takescreenshots interface by type casting
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			//use getScreenshotAs method to capture screenshot in file format
			//getScreenshotAs return type is file 
			
			File sorce=ts.getScreenshotAs(OutputType.FILE);
			
			//copy file to specific location 
			 
			
			
			
	}
	
	}
	}

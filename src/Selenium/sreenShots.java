package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class sreenShots {

	WebDriver driver;
	
	sreenShots s=new sreenShots();
	
	public void captureScreenshot(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			//create type casting as we want to use method of screenshots
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			//need to use getScreenshot method and in file format 
			File src=ts.getScreenshotAs(OutputType.FILE);
			
			//need to copy the file into the specific location 
			//FileUtils.copyFile(src, new File("./screenshot/"+result.getName()+".png"));
			FileUtils.copyFile(src, new File("./screenshot/"+result.getName()+".png"));
			System.out.println(result.getName()+"method() screenshot captured.");
			}
		}
	 
	
}

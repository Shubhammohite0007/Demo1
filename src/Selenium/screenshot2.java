package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class screenshot2 {

	sreenShots s=new sreenShots();
	
	
	@Test
	public void facebook() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String str=driver.getTitle();
		System.out.println(str);
		driver.findElement(By.id("wrongid")).sendKeys("Shubhammohite0007@gmail.com");
		
	}
	@AfterTest
	public void Screenshot(ITestResult result2) throws Exception {
		s.captureScreenshot(result2);	
	}
}

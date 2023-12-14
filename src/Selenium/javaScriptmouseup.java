package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptmouseup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().deleteAllCookies();
		
	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('email').value='Abc@1234'");
		
		jse.executeScript("document.getElementById('pass').value='Shub123'");
		
		jse.executeScript("window.scrollBy(0,400)");
		
		
		
		
	}

}

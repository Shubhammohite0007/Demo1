package Selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");   //draggable
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
       String expected="Do you confirm action?";
       String actual=driver.switchTo().alert().getText();
       
		Assert.assertEquals(actual, expected);
		
		Thread.sleep(2000);
	   driver.switchTo().alert().accept();
		
		

	}

}

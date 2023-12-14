package Selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class dropdown_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("How Stuff works");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> ddl =driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		String str="how stuff works science";
		
		for(int i=0;i<ddl.size();i++) {
			if(ddl.get(i).getText().equalsIgnoreCase(str)) {
				ddl.get(i).click(); 
			}
		}
		
		
		
		
		
		
		
		
		

	}

}

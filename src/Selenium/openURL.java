package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.sym.Name;



public class openURL {

//	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//xpath=//tagname[@Attribute=’Value’]
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String str=driver.getTitle();
		System.out.println(str);
		driver.findElement(By.id("email")).sendKeys("Shubhammohite0007@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();
		Thread.sleep(1000);
		
		//Radio buutton
		List<WebElement> Radios=driver.findElements(By.xpath("//input[@type='radio']"));
		Thread.sleep(2000);
		System.out.println(Radios.size());
		
		
		Radios.get(1).click();
		//DDL element select
	List<WebElement> Month= driver.findElements(By.xpath("//select[@id='month']/option"));
	String st="May";
	for(int i=0;i<Month.size();i++) {
		if(Month.get(i).getText().equalsIgnoreCase(st)) {
			Month.get(i).click();
		}
	}
	List<WebElement> Days= driver.findElements(By.xpath("//select[@id='day']/option"));
     String day="8";
     for(int i=0;i<Days.size();i++) {
    	 if(Days.get(i).getText().equalsIgnoreCase(day)){
    		 Days.get(i).click();
    	 }
     }
		
	
	
	}
	}
	
	
	
		
		
		
			
		
		
		

	



``	package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverflipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 // find web element reference
		WebElement Elect= driver.findElement(By.xpath("//*[text()='Electronics']"));
		// mouse hover
		Actions act=new Actions(driver);
		act.moveToElement(Elect).build().perform();
		//keys function
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Clicked");
		Thread.sleep(3000);
		//Home 
		WebElement ho= driver.findElement(By.xpath("//*[text()='Home']"));
		act.sendKeys(ho, Keys.ENTER).build().perform();
		System.out.println("Pressed");
		
		//Referesh
		driver.navigate().refresh();
		
		//Right click on webpage 
		act.contextClick().build().perform();
		
		
		
		
		
		
		
		
		
		
	}

}

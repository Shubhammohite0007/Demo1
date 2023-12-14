package Sel2two;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class url{
	
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.get("https://www.facebook.com/login/");
		
		//E:\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe
		
		
	//String element=driver.getTitle();
	
	//String acutal="abcde";
	
    // Assert.assertEquals(element, acutal);
		
		
		
		
	}
	
	
	
	
	
	
}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		int iframe=driver.findElements(By.tagName("iframe")).size();
		System.out.println(" "+iframe);
		
		for(int i=0;i<iframe;i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();  
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[text()='Close']")).click();////*[contains(text(),'Watch Video')
			
		}
		System.out.println("clicked");
		
		
		
		
	}

}

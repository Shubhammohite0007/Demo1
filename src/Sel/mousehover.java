package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 WebElement str =driver.findElement(By.xpath("//*[text()='Electronics']"));
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(str).build().perform();
		 act.contextClick(str).build().perform();
		 System.out.println("click");

	}

}

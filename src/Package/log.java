package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class log {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");   //draggable
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String expceted="Do you confirm action?";
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		String actual =driver.switchTo().alert().getText();
		
		Assert.assertEquals(actual, expceted);
		System.out.println("a");
		
		
		//driver.switchTo().alert().accept();
		
		//Actions act=new Actions(driver);
		
		
			
		}

	}



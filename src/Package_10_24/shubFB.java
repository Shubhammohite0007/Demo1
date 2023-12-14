package Package_10_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shubFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32//chromedriver.exe") ;     
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Shubhammohite0007@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("114433114433");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@data-testid=royal_login_button]")).click();
		
		
		
		
		
		
	}

}

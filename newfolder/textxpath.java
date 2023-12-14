package newfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class textxpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		
       WebElement wb=driver.findElement(By.xpath("//span[text()='Sports, Books & More']"));
       
       Actions act=new Actions(driver);
       act.moveToElement(wb).build().perform();
       act.moveToElement(wb).build().perform();
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//a[text()='Helmets & Riding Gears']")).click();
       
		
	}

}

package newfolder;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts"); 
		Thread.sleep(3000);//draggable
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		String expected="You clicked a button";
		
		String actual=driver.switchTo().alert().getText();
		System.out.println(actual);

		Assert.assertEquals(actual, expected);
		driver.switchTo().alert().accept();
		
	}

}

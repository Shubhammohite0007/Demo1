package Sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;


public class url {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shubham");
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();
		
		//driver.findElement(By.xpath("//input[@value='2']")).click();
		WebElement ddl=driver.findElement(By.xpath("//select[@id='month']"));
		Select st=new Select(ddl);
		Thread.sleep(2000);
		st.selectByIndex(4);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> dd=driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(dd.size());
		
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.close();
		

	}

}

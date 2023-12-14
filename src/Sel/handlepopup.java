package Sel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlepopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Set<String> window=driver.getWindowHandles();
	
		System.out.println(window.size());
		
		Iterator<String> itr=window.iterator();
		String win1=itr.next();
		String win2=itr.next();
		
		
	}

}

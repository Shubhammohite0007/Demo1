package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class windowPopupHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");   
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allwindow= driver.getWindowHandles();    // set because it will not allow duplicate 
		
		System.out.println(" "+allwindow.size());
		
		Iterator <String> abc=allwindow.iterator();
		String window1=abc.next();
		String window2=abc.next();
		
	    driver.switchTo().window(window2);
	    System.out.println(" "+window2);
		
		
		
		
		
		

	}

}

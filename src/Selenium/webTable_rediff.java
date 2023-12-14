package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable_rediff {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//list of companies 
		List<WebElement> table= driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td[1]/a"));
		System.out.println("total size is "+table.size());
	String st="ADC India Communicat";
	Thread.sleep(2000);
	//llist of current prices
	List<WebElement> table1= driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td[3]"));
	System.out.println("total size is "+table1.size());
	Thread.sleep(2000);
	for(int i=0;i<table.size();i++) {
		if(table.get(i).getText().equalsIgnoreCase(st)) {
			table.get(i).click();
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

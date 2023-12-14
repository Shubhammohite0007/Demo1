package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readingFilefacebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//first we need to set the loaction of file 
		File src=new File("C:\\Users\\Shub\\eclipse-workspace\\Java_Training\\repository\\object_repo.properties");
		
		//then we need to loaad file by fileinputstream
		FileInputStream fis=new FileInputStream(src);
		
		//then we need to read the properties of file by using property 
		Properties prop=new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("URL"));;
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("Email"))).sendKeys(prop.getProperty("TestData1"));
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("TestData2"));

		
		
	}

}

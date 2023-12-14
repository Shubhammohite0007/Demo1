package Selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create logger instance for which we want to create log 
		Logger log=Logger.getLogger("log4j");
		
		//location set 
		PropertyConfigurator.configure("C:\\Users\\Shub\\eclipse-workspace\\Java_Training\\repository\\log4j.properties");
		
		//wirte code
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// jars prob ahe pn mahiti aplyala  rough krto 
		
	   //logger.info("Chrome instance opened");
		
		//output fakt log kai taklay te disnar bass
		//sysout replecw krto sni log fie use krto 
		

	}

}

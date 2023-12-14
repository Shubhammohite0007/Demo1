package Sel2two;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://money.rediff.com/gainers");
		
		List <WebElement> li=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		String str="Daikaffil Chemic";
		
		for(int i=0;i<li.size();i++) {
			if(li.get(i).getText().equalsIgnoreCase(str)) {
				li.get(i).click();
			}

	}
		
	}	

}

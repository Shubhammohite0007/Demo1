package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://money.rediff.com/gainers");
		
		
		
		List<WebElement> tab=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		System.out.println(tab.size());
		String str="P H Capital Ltd.";
		for(int i=0;i<tab.size();i++) {
			if(tab.get(i).getText().equalsIgnoreCase(str)) {
				tab.get(i).click();
			}
		}

	}

}


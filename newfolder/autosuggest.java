package newfolder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("facebook");
	Thread.sleep(1000);
	////ul[@role='listbox']/li
	
	List <WebElement> name=driver.findElements(By.xpath("//ul[@role='listbox']/li"));

	System.out.println(name.size());

	Thread.sleep(3000);
	for(int i=0;i<name.size();i++) {
		String st="facebook video download";
        if(name.get(i).getText().equalsIgnoreCase(st)) {
        	name.get(i).click();
        	break;
        }
	}
	}

}

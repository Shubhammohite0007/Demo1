package Package_10_24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_Selenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        
	    System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32//chromedriver.exe") ;     
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//*String str=driver.getCurrentUrl();
		//System.out.println(str);
		
	//	String st=driver.getTitle();
		//System.out.println(st);
		
		Thread.sleep(2000);
	//	driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		List<WebElement> radios= driver.findElements(By.xpath("//input[@type='radio']"));
		Thread.sleep(2000);
		System.out.println(radios.size());
		System.out.println(radios.get(1).isEnabled());
		
		Thread.sleep(3000);
		
		radios.get(1).click();
		
		List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']/option"));
		String str="Jun";
		for(int i=0;i<month.size();i++) {
			if(month.get(i).getText().equalsIgnoreCase(str)) {
				month.get(i).click();
				System.out.println("Clicked");
			}
		}
		
	}

}

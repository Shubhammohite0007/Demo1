package newfolder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=4169373936281717955&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301798&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus nord ");
		Thread.sleep(1000);
		String str="oneplus nord 3";
		Thread.sleep(1000);
		List<WebElement> mob=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		
		System.out.println(mob.size());
		
		for(int i=0;i<mob.size();i++) {
			if(mob.get(i).getText().equalsIgnoreCase(str)) {
				mob.get(i).click();
			}
			
		}
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[text()='Nord 3 5G (Misty Green, 8GB RAM, 128GB Storage)']")).click();
		
			
	}	
}

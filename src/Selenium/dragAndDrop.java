package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class dragAndDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");   //draggable
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> allframe=driver.findElements(By.tagName("iframe"));
		System.out.println("Total size of frame is "+allframe.size());
		driver.switchTo().frame(0);
		
		//find element for draggable 
		WebElement draggable=driver.findElement(By.id("draggable"));
		
		//find element for droppable 
				WebElement droppable=driver.findElement(By.id("droppable"));
		
				Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		act.dragAndDrop(draggable, droppable).build().perform();
		
	    // for draggable only 
		//act.dragAndDropBy(draggable, 100, 40).build().perform();
		//Thread.sleep(2000);
		//act.clickAndHold(draggable);
		

	}

}

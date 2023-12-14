package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {

	
	@Test
	public void a() {
		
		String actual="shub";
		String expected="shuhb";
		
		Assert.assertEquals(actual, expected);
	}
}

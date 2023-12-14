package Selenium;

import org.testng.annotations.Test;

import io.restassured.internal.common.assertion.Assertion;

//skipping and priority
public class testng2 {

	
	@Test(priority=0)
public void a() {
		System.out.println("a");
	}
	@Test(priority=-1)
public void b() {
		System.out.println("b");
	}
	@Test(enabled=false)
public void c() {
		System.out.println("c");
	}
	@Test(dependsOnMethods="b")
public void d() {
		
		System.out.println("a");
	}
	
	
}

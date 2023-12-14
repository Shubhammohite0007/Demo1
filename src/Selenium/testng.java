package Selenium;


import org.testng.annotations.*;


public class testng {
	
	
	@Test
	public void a() {
		System.out.println("Test");
	}
	@BeforeTest
	public void b() {
		System.out.println("before test");
	}
	@AfterTest
	public void c() {
		System.out.println("after test");
	}
	@BeforeSuite
	public void d() {
		System.out.println("Before suite");
	}
	@AfterSuite
	public void e() {
		System.out.println("After suite");
	}
	@BeforeMethod
	public void f() {
		System.out.println("before method");
	}
	@AfterMethod
	public void g() {
		System.out.println("After method");
	}
	@Test
	public void h() {
		System.out.println("Test2 ");
	}
	@BeforeClass
	public void i() {
		System.out.println("Before class");
	}
	@AfterClass
	public void m() {
		System.out.println("After class");
	}
	

}

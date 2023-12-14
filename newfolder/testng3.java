package newfolder;

import org.testng.annotations.Test;


public class testng3 {
	
	@Test
	public void add() {
		System.out.println("hello");
	}

	@Test(priority=0)
      public void ad() {
  		System.out.println("hello");
  	}
	
	@Test(enabled=false)
	 public void ak() {
  		System.out.println("hello");
  	}
	
	
      
}

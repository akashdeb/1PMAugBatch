package testNg;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test (priority = 1)
	public void a2() {
		System.out.println("from demo");
	}
	
	@Test(priority = 2)
	public void a1() {
		System.out.println("from demo2");
	}
	

}

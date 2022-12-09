package testNg;

import org.testng.annotations.Test;

public class ClassE {
	
	@Test
	public void test1() {
		System.out.println("From Test1");
	}
	
	@Test (enabled = false)
	public void test2() {
		System.out.println("From Test2");
	}
	
	@Test (invocationCount = 0)
	public void test3() {
		System.out.println("From Test3");
	}

}

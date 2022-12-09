package testNg;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test(invocationCount = 5)
	public void demo() {
		System.out.println("From Demo");
	}

}

package testNg;

import org.testng.annotations.Test;

public class ClassD {
	
	@Test (groups = "regression")
	public void paymentTest() {
		System.out.println("Product is purchased");
	}
	@Test (groups = "smoke")
	public void logoutTest() {
		System.out.println("Logged out succesfully");
	}

}

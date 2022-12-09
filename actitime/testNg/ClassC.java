package testNg;

import org.testng.annotations.Test;

public class ClassC {
	
	@Test (groups = "smoke")
	public void loginTest() {
		System.out.println("Login is successfull");
	}
	@Test (groups = "regression")
	public void searchTheProductTest() {
		System.out.println("Product is identified");
	}
	@Test (groups = "regression")
	public void selectProductTest() {
		System.out.println("Product is Selected");
	}
	@Test (groups = "regression")
	public void addToCartTest() {
		System.out.println("Product is Added to the cart");
	}
	

}

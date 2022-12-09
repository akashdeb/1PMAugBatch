package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProductTest {
	
	@Test (priority = 1)
	public void loginTest() {
		System.out.println("Login is successfull");
	}
	@Test (priority = 2)
	public void searchTheProductTest() {
		System.out.println("Product is identified");
	}
	@Test (dependsOnMethods = "searchTheProductTest")
	public void selectProductTest() {
		Assert.fail();
		System.out.println("Product is Selected");
	}
	@Test (dependsOnMethods = "selectProductTest")
	public void addToCartTest() {
		System.out.println("Product is Added to the cart");
	}
	@Test (dependsOnMethods = "addToCartTest")
	public void paymentTest() {
		System.out.println("Product is purchased");
	}
	@Test (dependsOnMethods = "paymentTest")
	public void logoutTest() {
		System.out.println("Logged out succesfully");
	}
	
}

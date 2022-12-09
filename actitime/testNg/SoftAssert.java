package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {

	@Test
	public void test() {
		String expectedResult = "abc";
		String actualResult = "ab";
		
		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertEquals(actualResult, expectedResult);
		System.out.println("Pass");
		s.assertAll();

}
	
	@Test
	public void test2() {
		int expectedIntResult = 123;
		int actualIntResult = 12;
		
		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertEquals(actualIntResult, expectedIntResult);
		System.out.println("Pass");
		s.assertAll();
}
}
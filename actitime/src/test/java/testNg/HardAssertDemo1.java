package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo1 {
	
	@Test
	public void test() {
		String expectedResult = "abc";
		String actualResult = "abc";
		
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Pass1");
		
		int expectedIntResult = 123;
		int actualIntResult = 12;
		
		Assert.assertEquals(actualIntResult, expectedIntResult);
		System.out.println("Pass2");
		
		boolean expectedbooleanResult = true;
		boolean actualBooleanResult = false;
		
		Assert.assertEquals(actualBooleanResult, expectedbooleanResult);
		System.out.println("Pass3");
	}

}

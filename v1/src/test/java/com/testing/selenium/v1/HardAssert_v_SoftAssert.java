package com.testing.selenium.v1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HardAssert_v_SoftAssert {
	
	
	@Test(priority =1)
	
	public void Hard1() {
		
		System.out.println("Hard assert passed-1");
		Assert.assertTrue(true);
		
		System.out.println("Hard assert passed-2");
		Assert.assertTrue(false);
		
		System.out.println("Hard assert passed-3");
		Assert.assertTrue(true);/// Hard asset fail the test case the moment he got incorrect statement
		
	}
	
	@Test (priority =2)
	
	public void Soft() {
		
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("Soft assert passed-1");
		softassert.assertTrue(true);
		
		System.out.println("Soft assert passed-2");
		softassert.assertTrue(false);
		
		System.out.println("Soft assert passed-3");
		softassert.assertTrue(true);
		softassert.assertAll();// When we enable AsserAll then it will go through all the condition but will fail test if found incorrect statement.
		
	}
	

}

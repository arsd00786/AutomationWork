package com.testing.selenium.v1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPractice {
	
	public static WebDriver driver;
	
	
	@Test (priority = 1)
	public void Critical() 
	{
		String Expected = "Hello";
		String Actual = "Not hello";
		
		Assert.assertEquals(Actual, Expected);
		
	}
	
	@Test (priority = 2)
	public void High() 
	{
		boolean a = 10>20;
		boolean b = 30<20;
		Assert.assertTrue(b!=a);
	}

	@Test(priority = 3)
	public void Normal() 
	{
		SoftAssert softassert = new SoftAssert();
		boolean a = 1<2;
		boolean b = 2>3;
		softassert.assertEquals(b,a);// Only check first logic if found true will pass the test
		softassert.assertAll();  // This statement allows assert to check all the logic inside test
	}


}

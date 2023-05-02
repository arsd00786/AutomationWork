package com.testing.selenium.v1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationPriority {
	
	
	/*
	 * @BeforeMethod
	 * 
	 * public void Registration()
	 * 
	 * { System.out.println("User is getting registered."); }
	 */
	
	
	/// If we do not set priority then test cases execute alphabetically as per methode name.
	
	// If we want to set priority then we have to set priority for ALL the test cases "Other wise testNG ignore it"
	@Test(priority = 1)
	
	public void ValidLogin()
	{
		System.out.println("User registered with valid Cred: 1");
	}
	
    @Test(priority = 2, enabled = false)
	
	public void HomePage()
	{
		System.out.println("HomePage is visible: 2");
	}

    @Test(priority = 3)
	
	public void AddBeneficiary()
	{
		System.out.println("Add Beneficiary: 3");
	}
    
    @Test(priority = 4)
	
	public void ValidateBeneficiary()
	{
		System.out.println("Validate Beneficiary: 4");
	}
	
    @AfterMethod
	
   	public void LogOut()
   	{
   		System.out.println("User getting LogOut.");
   	}

}

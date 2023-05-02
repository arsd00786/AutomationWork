package com.testing.selenium.v1;

import org.testng.annotations.Test;

public class GroupsActivity {
	
	@Test (groups = {"Sanity", "Regression"})
	
	public void TC1() 
	{
		System.out.println("This TC 1:");
	}
@Test (groups = {"Sanity", "Smoke"})
	
	public void TC2() 
	{
		System.out.println("This TC 2:");
	}
@Test(groups = {"Sanity"})

public void TC3() 
{
	System.out.println("This TC 3:");
}
@Test (groups = {"Smoke"})

public void TC4() 
{
	System.out.println("This TC 4:");
}

}

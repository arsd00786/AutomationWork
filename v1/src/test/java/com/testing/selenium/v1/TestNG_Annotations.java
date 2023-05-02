package com.testing.selenium.v1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	
	// Annotation Execution precedence wise
	
	@BeforeSuite

	public void BeforeSuite() {
		System.out.println("This is Before suite:");
	}

	
	  @BeforeTest
	  
	  public void BeforeTest() { System.out.println("This is BeforeTest suite:"); }
	  
	  @BeforeClass
	  
	  public void BeforeClass() {
	  System.out.println("This is BeforeClass suite:"); }
	  
	  @BeforeMethod
	  
	  public void BeforeMethod() {
	  System.out.println("This is Before Method suite:"); }
	  
	  @Test
	  
	  public void Testcase() { System.out.println("This is Testcase suite:"); }
	  
	  @AfterMethod
	  
	  public void AfterMethod() { System.out.println("This is AfterMethod suite:");
	  }
	  
	  @AfterClass
	  
	  public void AfterClass() { System.out.println("This is AfterClass suite:"); }
	  
	  @AfterTest
	  
	  public void AfterTest() { System.out.println("This is AfterTest suite:"); }
	  
	  @AfterSuite
	  
	  public void AfterSuite() { System.out.println("This is AfterSuite suite:"); }

}

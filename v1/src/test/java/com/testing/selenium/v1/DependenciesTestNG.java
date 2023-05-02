package com.testing.selenium.v1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;



public class DependenciesTestNG {
	
	
	public static WebDriver driver;
	
	
	@BeforeTest
	
	public void start()
	{
		
		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mycarhelpline.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	@Test (priority = 1)
	
	public void LandgingPage() 
	{
	
		
	 	System.out.println(driver.getCurrentUrl());
	 	String currentURL="https://mycarhelpline.com";
	 	
	 	if (currentURL.equals("https://mycarhelpline.com"))
	 	{
	 		System.out.println("Test case passesd!");
	 	} else {
	 		System.out.println("Failed Landing page");
	 	}
	 	
	 	//Assert.fail("Delibretly failed");
	}
	
	@Test (priority = 2, dependsOnMethods = "LandgingPage")
	
	public void Calculater() 
	{
	
		driver.findElement(By.xpath("//*[@id=\"bluemenu\"]/ul/li[5]/a")).click();
		System.out.println("Test case calculater passed!!");
		
	}
	
	@Test (priority = 3, dependsOnMethods = {"LandgingPage", "Calculater"})
	
	public void HomeBack() 
	{
	
		
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Test case HomeBack passed!!");
		
	}
	
	@AfterTest
	
	public void AfterTest() 
	{
		System.out.println("We are backe at HomePage: Closing the Browser!!");
		driver.close();
	}
	

	
}

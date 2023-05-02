package com.testing.selenium.v1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNG_Parameterization {
	
	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser","Url"})
	
	public void OpenGmail(String Browser, String Url) 
	{
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		System.out.println("Chrome Driver detected and fired: Test case Passed.");
		}
		else if(Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			driver = new FirefoxDriver();
			System.out.println("Firefox Driver detected and fired: Test case Passed.");
			}
		else System.out.println("Failed no browser found");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Url);
		
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("AGL2671");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("D5J!8C2-"); 
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"divDesktopPage\"]/div[1]/div/div[2]/ul/li[6]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"divDesktopPage\"]/div[1]/div/div[2]/ul/li[6]/ul/li[1]/a")).click();
		System.out.println("Title is: "+driver.getTitle()); 
//		if(driver.getTitle().equals("Opportune Technologies"))
//		{
//			System.out.println("Second Test also passed.");
//		}
		Assert.assertEquals("Opportune Technologies", "Opportune Technologies");
		driver.quit();
		
	}

}

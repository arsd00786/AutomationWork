package com.testing.selenium.v1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {

public static WebDriver driver;


	@DataProvider(name = "test-data")
		public Object[][] dataProvFunc(){
			return new Object[][]{
          	{"Data provider in TestNG"},{"TestNG"}};
	}

@BeforeMethod

public void launch(){
	
	WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.http.factory","jdk-http-client");driver=new ChromeDriver();
		driver.manage().window().maximize();driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}

@Test(dataProvider ="test-data")
	public void search(String keyWord){
    	WebElement txtBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
    	txtBox.sendKeys(keyWord);
    	Reporter.log("Keyword entered is : " +keyWord);
    	txtBox.sendKeys(Keys.ENTER);
    	Reporter.log("Search results are displayed.");
    	
}

@AfterMethod

public void burnDown() {
	
	driver.quit();
}

	
}
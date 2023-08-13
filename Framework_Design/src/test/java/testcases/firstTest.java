

package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseTest;
import utilities.readXLSLfile;



public class firstTest extends baseTest {
	
	@Test (dataProviderClass = readXLSLfile.class, dataProvider= "logindataxl")
	public void loginTest(String userName, String password) throws InterruptedException {
		
		driver.findElement(By.xpath(loc.getProperty("sign_In"))).click();
		driver.findElement(By.xpath(loc.getProperty("login_ID"))).sendKeys(userName);
		driver.findElement(By.xpath(loc.getProperty("next_btn"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("main_btn"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(loc.getProperty("skip_verify"))).click();
		
		
	}
	
	
//	@DataProvider(name = "logindata")
//	  public Object[][] createData() {
//	    return new Object[][] {
//	      
//	    	{"md50@amitknkscyonline.com", "arsnkd@321"},  // "This Data Provide is only when we have small requirement and if want to run data driven test without xlsl sheet
//	    	{"md50@amionline.com", "arsdi@321"},
//	    	{"md50@amityonline.com", "asd@321"},
//	    	{"md50@amityonline.com", "arsd@321"}
//	    };
//	  }


}

	    
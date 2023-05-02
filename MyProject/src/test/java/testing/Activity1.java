package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 {

	public static void main(String[] args) {
		
		/*================== TRADITINAL WAY TO LAUNCH BROWESER USING AND CALLING WEBDRIVER AND CHROME DRIVER OBJECTS============ */
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\AGL\\Documents\\ChromeDriver\\chromedriver.exe");
		 * 
		 * WebDriver driver= new ChromeDriver(); //we can also use below line to create * object of chrome driver directly
		 * 
		 * ChromeDriver dr1 = new ChromeDriver();
		 * 
		 * 
		 * //driver driver.get("https://facebook.com");
		 =======================================================================================================*/
		
		/*===============================Launch browser using WebDriver Manager Dependency ================================*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.instagram.com/");
		System.out.println("This is how we can extract page Title:  "+driver.getTitle());
		System.out.println("This is how we can extract page URL:  "+driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
        
        //Closing the browser
       // dr1.quit();
        
        
	}

}

package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnImage {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.instagram.com/accounts/password/reset/";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"mount_0_0_UZ\"]/div/div/div/div[1]/div/div/div/div[1]/section/main/div[2]/div/div/div/div/div[8]/div/a")).click();
		System.out.println(driver.getTitle());
		
		  if(driver.getTitle().equals("Instagram"));{
		  
		  System.out.println("We are back to homepage!!!"); }
		 
		
		//else {System.out.println("Failed!!!");}
	}

}

package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatuWebElement {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		//WebElement elementt = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		
		
		//System.out.println("To check Element Displayed or not: "+elementt.isDisplayed());
		//System.out.println("To check Element enabled or not: "+elementt.isEnabled());
		//=======================================================================================//
		//============== isSelected() method is used to check "Radio button, Check Box and DropDown!!!===========//
		/*
		 * driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F"); WebElement
		 * male = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		 * System.out.println("To check Element Selected or not: "+male.isSelected());
		 * WebElement female =
		 * driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		 * System.out.println("To check Element Selected or not: "+female.isSelected());
		 * 
		 * female.click();
		 * System.out.println("To check Element is Selected or not: "+female.isSelected(
		 * )); male.click();
		 * System.out.println("To check Element is Selected or not: "+male.isSelected())
		 * ;
		 */
	}

}

package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadingFile {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		String URL = "http://demo.guru99.com/test/upload/";
		Driver.get(URL);
		WebElement element = Driver.findElement(By.id("\"uploadfile_0\""));
		element.sendKeys("C:\\Users\\AGL\\Desktop\\New folder\\Book1.xlsx");
		Driver.findElement(By.id("terms")).click();
		Driver.findElement(By.name("send")).click();
			

	}

}

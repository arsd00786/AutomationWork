package testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");

		// Taking full screen screenshot
		
		  TakesScreenshot ts = (TakesScreenshot)driver; File src =
		  ts.getScreenshotAs(OutputType.FILE); File trg = new
		  File("C:\\Users\\AGL\\Desktop\\Completed\\HomePage.png");
		  FileUtils.copyFile(src, trg);
		 

		// Taking screenshot of perticular section/portion
		/*
		 * WebElement section = driver.findElement(By.xpath(
		 * "//*[@id=\"web-footerMount\"]/div/footer/div/address/div/div[1]")); File src
		 * = section.getScreenshotAs(OutputType.FILE); File trg = new
		 * File("C:\\Users\\AGL\\Desktop\\Completed\\Section.png");
		 * FileUtils.copyFile(src, trg);
		 */

		//
		Thread.sleep(3000);
		driver.close();

	}

}

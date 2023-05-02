package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Geting_Size {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		//Get location
		WebElement location = driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[1]/div[3]"));
		System.out.println("Element Location in X and Y: "+location.getLocation());
		System.out.println("Element Location in X: "+location.getLocation().getX());
		System.out.println("Element Location in Y: "+location.getLocation().getY());
		System.out.println("=================================================");
		
		//Method 2
		System.out.println("Element Location in X: "+location.getRect().getX());
		System.out.println("Element Location in Y: "+location.getRect().getY());
		System.out.println("=================================================");

		// Get Size
		WebElement size = driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[1]/div[3]"));
		System.out.println("Element SIze Width and Height: "+size.getSize());
		System.out.println("Element SIze Width: "+size.getSize().getWidth());
		System.out.println("Element SIze Height: "+size.getSize().getHeight());
		System.out.println("=================================================");
		
		//Method 2
		System.out.println("Element SIze Width and Height: "+size.getRect().getDimension());
		System.out.println("Element SIze Width: "+size.getRect().getDimension().width);
		System.out.println("Element SIze Height: "+size.getRect().getDimension().height);
		System.out.println("========================THE END=========================");
		Thread.sleep(2000);
		driver.close();
		
	}

}

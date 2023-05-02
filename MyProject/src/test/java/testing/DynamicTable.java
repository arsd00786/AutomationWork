package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	

	public static void main(String[] args) {

		// Setting up browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/");
		
		// Log-in 
		
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//Sales====goto----Orders
		
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//Find number of pages in table
		
		String totalOrders = driver.findElement(By.xpath("//*[@id=\"form-order\"]/div[2]/div[2]")).getText();
		System.out.println("Total number of pages are :"+totalOrders);
		
		
		
		int totalPage = Integer.valueOf(totalOrders.substring(totalOrders.indexOf("(")+1, totalOrders.indexOf("Pages")-1));
		
		System.out.println("Total Orders are :"+totalPage);
																  	
		for(int p=2; p<=5; p++) {
			
			
			
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active page :"+active_page.getText());
			//active_page.click();
			
		int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
		System.out.println("Total number of Rows :"+rows);
		
		String pageno = Integer.toString(p+1);
		driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']"));
		
		
			
			
		}
		
		//driver.quit();
		
		
		
	}

}

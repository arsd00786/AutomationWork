package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suggest_dropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); 
			
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// we can also use thred.sleep method for wait.
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("sb_form_q")).sendKeys("apple");	
		Thread.sleep(3000);  
		List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		
		System.out.println("Size of auto suggestion"+list.size());

		for(WebElement listitem:list)
		{
			if(listitem.getText().contains("store"));
			{
				listitem.click();
				break;
			}
		}
	}

}

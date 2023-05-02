package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateBackForword {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/"); //open Amazon
		driver.navigate().to("https://www.myntra.com/");  //opens myntra. same as get but this method contains call by 
		//string url and URL instance. inside this calass back and forwed method implemented. this method can hold cache and History.
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();  // this methode refresh/reload the methode.
		Thread.sleep(3000);
		driver.close();

	}

}

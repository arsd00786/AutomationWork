package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextPartialLinkText {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String BaseURL = "https://www.amazon.in/";
		
		driver.get(BaseURL);
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();

		List <WebElement> lists = driver.findElements(By.tagName("a"));
		//System.out.println("Number of Links available in amazon websites are:- "+lists.size());
		
		//Getting all links and text with normal for loop.
		
		/*
		 * for(int i=0; i<=lists.size(); i++) {
		 * //System.out.println(lists.get(i).getText());
		 * System.out.println(lists.get(i).getAttribute("href")); }
		 */
		
		//Getting all links and text with normal forEach loop.
		
		for(WebElement list:lists)
		{
			System.out.println(list.getText());
			System.out.println(list.getAttribute("href"));
		}
		
	}

	
	
}

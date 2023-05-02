package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActivity_RightClick {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// driver.get("https://demo.guru99.com/test/simple_context_menu.html");  used for click actions.
		//driver.get("https://jqueryui.com/droppable/");  // This is used for Drag and Drop.
		
		driver.get("https://demo.opencart.com/");
		
		
		 		
		driver.manage().window().maximize();

		//WebElement button = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));  //This link used for Right Click test.
		
		//WebElement button = driver.findElement(By.xpath("/html/body/button")); // This link used for Double Click test.
		
		WebElement hoverMouse = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement hoverClick = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		
		/* This is used for Drag and Drop
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));*/
		
		Actions act = new Actions(driver);
		
		// act.contextClick(button).perform(); Used for Right Click.
		
		// act.doubleClick(button).perform(); Used for Double click.
		
		// act.dragAndDrop(Source, Target).perform(); Used for Drag and Drop.
		
		act.moveToElement(hoverMouse).moveToElement(hoverClick).click().perform();
		
	}

}

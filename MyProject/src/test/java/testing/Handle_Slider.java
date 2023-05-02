package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Slider {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement slide_start = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		System.out.println("Slide position is: "+slide_start.getLocation());
		System.out.println("Slide Size is: "+slide_start.getSize());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(slide_start, 80, 0).perform();
		
		System.out.println("Slide position is: "+slide_start.getLocation());
		System.out.println("Slide Size is: "+slide_start.getSize());
		

	}

}

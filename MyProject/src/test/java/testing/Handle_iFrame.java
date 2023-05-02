package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_iFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium.bidi.log']")).click();
		driver.switchTo().defaultContent();

		
		Thread.sleep(5000);
	    driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[normalize-space()='ConsoleLogEntry']")).click();
		driver.switchTo().defaultContent();

		Thread.sleep(5000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Deprecated']")).click();

	}

}

package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithTables {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyse.com/ipo-center/filings");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		List<WebElement> rowsNumber = driver.findElements(By.xpath("//table//tr"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);
		Thread.sleep(5000);

		List<WebElement> columnsNumber = driver.findElements(By.xpath("//table//tr//td"));
		int columnCount = columnsNumber.size();
		System.out.println("No of columns in this table : " + columnCount);

		Thread.sleep(5000);
		 WebElement cellAddress = driver.findElement(By.xpath("//table//tr[1]//td[5]"));
		 String value = cellAddress.getText(); 
		 System.out.println("The Cell Value is :" +value);
		 
		 driver.quit();
		
	}

}

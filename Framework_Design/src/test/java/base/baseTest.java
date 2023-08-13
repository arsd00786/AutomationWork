package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseTest{
	
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() throws IOException
	{
		
		if(driver==null) {
			fr = new FileReader(System.getProperty("user.dir")+ "\\\\resources\\\\configfiles\\\\config.properties");
			fr1 = new FileReader(System.getProperty("user.dir")+ "\\\\resources\\\\configfiles\\\\locaters.properties");
			prop.load(fr);
			loc.load(fr1);
		}
		
			
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.http.factory", "jdk-http-client");	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(prop.getProperty("testurl"));
		driver.manage().window().maximize();
		
		}
		
	
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		
	}

}

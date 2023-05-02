package HRMS_LogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMS_LogIn{
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void SettinUp()
	
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://hrms.opportune.in/AGL-SS/");
	}
	
	
	@Test(priority =0)
	public void CheckTitle() 
	{
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Opportune Technologies";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		
	}
	
	@Test(priority =1)
	public void VerifyLogo()
	{
		boolean Logo = driver.findElement(By.xpath("//img[@id='imgClient']")).isDisplayed();
		Assert.assertTrue(Logo, "Logo Verfied.");
		
	}
	
	@Test(priority =2)
	public void LoginWithValidCred()
	{
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("AGL2671");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("D5J!8C2-");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Home";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		
	}
	
	@Test(priority =3)
	public void LoginWithInvalidCred()
	{
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("AGL271");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("DJ!8C2-");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		//boolean ActualTitle = driver.findElement(By.xpath("//*[@id=\"divLoginBox\"]/form/table/tbody/tr[3]/td/span")).isDisplayed();
		
		//Assert.assertTrue(ActualTitle);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Home";
		Assert.assertNotEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test(priority =4)
	public void LoginWithInvalidUsername()
	{
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("AGL271");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("D5J!8C2-");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Home";
		Assert.assertNotEquals(ActualTitle, ExpectedTitle);
		
		
	}
	
	@Test(priority =5)
	public void LoginWithInvalidPassword()
	{
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("AGL2671");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("!8C2-");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Home";
		Assert.assertNotEquals(ActualTitle, ExpectedTitle);
		
		
	}
	
	@Test(priority =6)
	public void LogOut()
	{
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("AGL2671");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("D5J!8C2-");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"divDesktopPage\"]/div[1]/div/div[2]/ul/li[6]")).click();
		driver.findElement(By.className("clip-exit")).click();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Opportune Technologies";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		
	}
	
	@Test (priority =7)
	public void forgetPassword()
	{
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("AGL2671");
		driver.findElement(By.linkText("Forgot Password")).click();
		
		while(true) {
		
		String month = driver.findElement(By.xpath("//input[@id='DOB']")).getText();
		String year = driver.findElement(By.xpath("//input[@id='DOB']")).getText();
		
		if(year.equals("1992") && month.equals("Oct")) {
			driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > tbody > tr:nth-child(4) > td:nth-child(1)")).click();
		}
		else {
			driver.findElement(By.xpath("(//th[@class='prev'][normalize-space()='«'])[1]")).click();
		}
	
		}
	}
	
	
	@Test(priority =8)
	public void LoginWithInvalidPasswordManualInsert() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("AGL2671");
		driver.findElement(By.linkText("Forgot Password")).click();
		
		WebElement datePicker = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/table[2]/tbody[1]/tr[1]/td[2]/input[1]"));
		datePicker.sendKeys("18-Oct-1992");
		 Thread.sleep(5000);
			
			  driver.findElement(By.xpath("//*[@id=\"btnSendMail\"]")).click(); 
			  Thread.sleep(5000);
			  boolean  checksuccess = driver.findElement(By.xpath("//*[@id=\"pMessage\"]")).isDisplayed();
			  System.out.println(checksuccess); Assert.assertTrue(checksuccess,
			  "message delivered");
			 
				
		
		
	}
	
	
	@AfterMethod()
	public void TearDown()
	{
		driver.quit();
	//	driver.close();
	}

}

package UAT_Env;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class UAT_Environment {
	
	
	@Test
	
	public void U1() {
		
		System.out.println("UAT environment 1:");
	}
	
	@Test
	
public void U2() {
		
		System.out.println("UAT environment 2:");
	}
	
	@Test(retryAnalyzer = MyRetry.class)
	
public void U3() {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://hrms.opportune.in/AGL-SS/Error/SessionExpire");
		
		System.out.println("UAT environment 3:");
		Assert.fail("Delibretry fails!!!");
		System.out.println("We failed this test case knowingly");
	}

}

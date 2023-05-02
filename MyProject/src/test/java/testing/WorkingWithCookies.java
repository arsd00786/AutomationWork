package testing;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithCookies {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:apple.com/");
		
		//How to capture Cookies
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of cookies are: "+cookies.size());
		
		//How to print cookies from browser?
		
		for(Cookie cokie:cookies)
		{
			System.out.println(cokie.getName()+""+cokie.getValue());
		}

		Thread.sleep(10000);
		Cookie cookobj = new Cookie("Arshadcookies-","your browser history saved.");
		driver.manage().addCookie(cookobj);
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookie after adding: "+cookies.size());
		
		
		//driver.manage().deleteCookie(cookobj);
		//driver.manage().deleteCookieNamed("Arshadcookies-");
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookie after Deletinh it all..: "+cookies.size());
		
		driver.close();
		
		
		
		
		
	}

}

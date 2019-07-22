package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstScript {
	
	@Test
	public void testMavenBuild() {
		
		System.setProperty("webdriver.chrome.driver", "D://Automation//Softwares//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.out.println("My first maven project script");
		
		driver.quit();
		
	}

}

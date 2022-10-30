package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTC1 {

	@Test
	public void loginTC1()
	{
		System.out.println("in login TC1");
		
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromdriver.exe");
		// down load chromdriver.exe manually 
		// to download automatically chromedriver.exe. EdgeDriver. geckdriver.exe ....etc
//		WebdriverManger  jar file  :  can be used to download all driver executebales for all browser automatically
		//		
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver =  new ChromeDriver();
//		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.0.0");
		
		// Edge		
		WebDriverManager.edgedriver().setup();
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.0.0");
		
		// HW  firefox 
		
	}
	
}

package TestPOMAllPagesWithPageFactoryTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AllPagesWithPageFactory.HomePage;
import AllPagesWithPageFactory.LoginPage;
//import AllPagesWithPageFactory.*;


public class LoginTC1 
{
	@Test
	public void loginTC1()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver  = new ChromeDriver();
		
		String url  ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		
		LoginPage lp =  new LoginPage(driver);
		
		//  get all links count 
		lp.getAllLinks();// 5
		
		
		lp.enter_username("Admin");
		lp.enter_password("admin123");
		lp.click_LoginBtn();
		
		HomePage hp =  new HomePage(driver);
		hp.isHomePageDisplayed();
		
	
		
		
	}

}

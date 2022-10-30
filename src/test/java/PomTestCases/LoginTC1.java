package PomTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SystemUserPage;

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
		
		//  call enter_username() from LoginPage class		
		LoginPage lp =  new LoginPage(driver);
		lp.enter_username("Admin");
		lp.enter_password("admin123");
		lp.click_LoginBtn();	
		
		
		HomePage  hp =  new HomePage(driver);
		hp.isHomePageDisplayed();
		
		hp.click_AdminLink();
		
		SystemUserPage  sysuserPage =  new SystemUserPage(driver);
		sysuserPage.verifySystemUserPageDisplayed();
		
		
		
	}
	
}

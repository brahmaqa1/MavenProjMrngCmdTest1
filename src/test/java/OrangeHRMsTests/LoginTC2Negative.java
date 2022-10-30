package OrangeHRMsTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTC2Negative {
	
	
	@Test
	public void loginTC1Negative() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  driver  = new ChromeDriver();
		
		String url  ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		//  it is taking some time to display user name textbox  --   apply synchronisation
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Define wedbdriver wait
		WebDriverWait  wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		//  define cond:   wait for user name text box to be visible
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));
		
//		Thread.sleep(10000);
		
		String userName= "sita";
		System.out.println("Enter user name =" +userName);
		driver.findElement(By.name("username")).sendKeys(userName);
		
		System.out.println("Enter password");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		System.out.println("click 'Login'  button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		System.out.println("Verify 'Invalid credentials'  msg is displayed for invalid user ");
		boolean  Invalidcredentials_Ele = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();
		
		if(Invalidcredentials_Ele == true)
		{
			System.out.println("Pass.Login is not succesfull for invalid user="+userName);
		}
		else
		{
			System.out.println("Fail. Login is successful for user =" +userName);
		}
		
				
	}

}

package OrangeHRMsTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchForUserTC4 {
	
	
	@Test
	public void searchForUserTC4() throws InterruptedException
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
		
		System.out.println("Enter user name ");
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		System.out.println("Enter password");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		System.out.println("click 'Login'  button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		System.out.println("Verify Home page is displayed or not ");
		boolean  profile_ImageDisplayed = driver.findElement(By.xpath("//img[@alt='profile picture']")).isDisplayed();
		
		if(profile_ImageDisplayed == true)
		{
			System.out.println("Home page is displayed successfully");
		}
		else
		{
			System.out.println("Home page is not  displayed successfully.Plz check username  and pwd");
		}
		
		// ****************************************************
		
		System.out.println("Click admin Link ");
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		String username = "Admin";
		driver.findElement(By.xpath("//label[text()='Username']/../following-sibling::div[1]/input")).sendKeys(username);
		
		System.out.println("Click submit btn" );
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();		
		
		
		// takes more time to displays results table
//		WebDriverWait  wait  =  new WebDriverWait(driver, Duration.ofSeconds(20));
		String myxpathResultsTable = "//div[@class='oxd-table-body']/div//div[@role='cell'][2]/div[text()='" + username+ "']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(myxpathResultsTable)));
		
		System.out.println("Verify user name is exist in table or not ");
		
		boolean userNameDisplayed = driver.findElement(By.xpath(myxpathResultsTable)).isDisplayed();
		
		if(userNameDisplayed == true)
		{
			System.out.println(username + " is searched successfully");
			
		}
		
		else {
			System.out.println(username + " is  not searched successfully");
		}
		
				
	}

}

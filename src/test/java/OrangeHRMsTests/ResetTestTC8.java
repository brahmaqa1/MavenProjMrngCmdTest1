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

public class ResetTestTC8 {


	@Test
	public void resetTestTc8() throws InterruptedException
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

		System.out.println("Click reset button");
		driver.findElement(By.xpath("//button[text()=' Reset ']")).click();
		Thread.sleep(3000);
		
		// get val from text box -username 

		String  ValFromUserNametextbox =	driver.findElement(By.xpath("//label[text()='Username']/../following-sibling::div[1]/input")).getAttribute("value");
		System.out.println("ValFromUserNametextbox= "+ValFromUserNametextbox);
		//	get sleected value from user role

		String 	valFromUSerRoleDropdown = driver.findElement(By.xpath("//label[text()='User Role']//../following-sibling::div[1]//div[text()='-- Select --']")).getText();
		System.out.println("valFromUSerRoleDropdown=" +valFromUSerRoleDropdown);

		String valFromEmplName= 	driver.findElement(By.xpath("//label[text()='Employee Name']//../following-sibling::div[1]//input")).getAttribute("placeholder");
		System.out.println("valFromEmplName =" +valFromEmplName);
		
		
		// HW get selected Value from status dropdown  and validate value is  '--Select--'
		
		
		if(ValFromUserNametextbox.equals("")  && valFromUSerRoleDropdown.equals("-- Select --") && valFromEmplName.equals("Type for hints...") )
		{
			System.out.println("Values are reset with default values ");
		}
		else
		{
			System.out.println("Values are  not reset with default values.plz check ValFromUserNametextbox="+ ValFromUserNametextbox + ",valFromEmplName= " +valFromEmplName + ",valFromEmplName ="+valFromEmplName);
			
		}
			
			
		


	}
}

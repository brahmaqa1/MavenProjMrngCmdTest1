package OrangeHRMsTests;

import java.time.Duration;
import java.util.Random;

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

public class CreateNewUserTC3 {
	
	
	@Test
	public void CreateNewUserTC3() throws InterruptedException
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
		
		System.out.println("Click 'Add'  button ");		
		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button[@type='button']")).click();
		Thread.sleep(4000);
		
		System.out.println("click User Role dropdown");		
		driver.findElement(By.xpath("//label[text()='User Role']/parent::div/following-sibling::div/descendant::i")).click();
		
		System.out.println("Select User role " );
		
		String myxpath = "//label[text()='User Role']/parent::div/following-sibling::div/descendant::i/ancestor::div[contains(@class,'select-text--focus')]/following-sibling::div[@role='listbox']//*[text()='ESS']";
		
//		String myxpath = "//div[@role='listbox']//*[text()='Admin']";
		driver.findElement(By.xpath(myxpath)).click();
		
		
		String empName = "Orange";
		System.out.println("Enter employee name ");
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empName);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='Orange  Test']")).click();
		
		
		System.out.println("click Status dropdown");
		driver.findElement(By.xpath("//label[text()='Status']/parent::div/following-sibling::div/descendant::i")).click();
		
		System.out.println("Select some value  in Status dropdown ");
		driver.findElement(By.xpath("//label[text()='Status']/parent::div/following-sibling::div/descendant::i/ancestor::div[contains(@class,'select-text--focus')]/following-sibling::div[@role='listbox']//*[text()='Enabled']")).click();
		
		Random  r = new Random();
		 int randomNo = r.nextInt(100);
		String userName ="Sita"+randomNo;
		System.out.println("Enter user name  =" +userName);
		
		driver.findElement(By.xpath("//label[text()='Username']/../following-sibling::div[1]/input")).sendKeys(userName);
		
		String pwd = userName + "@123321";
		System.out.println("enter pwd= " +pwd);
		driver.findElement(By.xpath("//label[text()='Password']/../following-sibling::div[1]/input")).sendKeys(pwd);
		
		
		System.out.println("Enter confirm pwd=" + pwd);
		driver.findElement(By.xpath("//label[text()='Confirm Password']/../following-sibling::div[1]/input")).sendKeys(pwd);
		
		System.out.println("clicn Save button");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();// no working
		
		//2 
		Actions act   = new Actions(driver);
//		act.click(driver.findElement(By.xpath("//button[@type='submit']"))).perform();// nok 
//		act.doubleClick(driver.findElement(By.xpath("//button[@type='submit']"))).perform(); // nok
		
//		driver.findElement(By.xpath("//button[@type='submit']")).submit(); // nok
		
		
		// keyboard
		WebElement  SaveBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		
//		act.moveToElement(SaveBtn).sendKeys(Keys.ENTER).build().perform();// nok
		
		// JSE
		
		JavascriptExecutor  js =  (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", SaveBtn);// nok
		
		// press tab 2 times and focus is on Save btn anf Press enter
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).perform();	
		Thread.sleep(5000);
		
		// takes more time to displays results table
//		WebDriverWait  wait  =  new WebDriverWait(driver, Duration.ofSeconds(20));
		String myxpathResultsTable = "//div[@class='oxd-table-body']/div//div[@role='cell'][2]/div[text()='" + userName+ "']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(myxpathResultsTable)));
		
		System.out.println("Verify user name is exist in table or not ");
		
	
		
		boolean userNameDisplayed = driver.findElement(By.xpath(myxpathResultsTable)).isDisplayed();
		
		if(userNameDisplayed == true)
		{
			System.out.println(userName + " is created successfully");
			
		}
		
		else {
			System.out.println(userName + " is  not created successfully");
		}
		
				
	}

}

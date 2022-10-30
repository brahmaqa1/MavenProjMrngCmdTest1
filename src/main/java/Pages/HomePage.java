package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
//	int a; // 0
//	float fl;// 0/0
//	String ename;//  null
//	ChromeDriver  driver;//   null
	public WebDriver driver;//  null

	// 1 Define all elements
	public WebElement profilepictureImage;
	public WebElement admin_Link;
	
	
	
	//..................

	//2 define constr
	public HomePage(WebDriver driver)
	{
		System.out.println();
		
		// intilaise all elemnst
		profilepictureImage =  driver.findElement(By.xpath("//img[@alt='profile picture']"));
		admin_Link =  driver.findElement(By.xpath("//span[text()='Admin']"));
//		systemUsersText =  driver.findElement(By.xpath("//h5[text()='System Users']"));
		System.out.println("driver= " +driver);
		
		this.driver = driver;
		//  current instalnce var driver           chrome browser  addres
//	
	}


	//3  define separate method for each action

	public void isHomePageDisplayed()
	{
		boolean  profile_ImageDisplayed = profilepictureImage.isDisplayed();

		if(profile_ImageDisplayed == true)
		{
			System.out.println("Home page is displayed successfully");
			
		}
		else
		{
			System.out.println("Home page is not  displayed successfully.Plz check username  and pwd");
		}
	}
	
	
	// click Admin 
	public void click_AdminLink()
	{
		System.out.println("Click admin Link ");
		admin_Link.click();	
		//  it takes some time to display system users page-   define  explicit wait
		System.out.println("driver =" +driver);// null
		
//		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10))	;
//		
//		wait.until(ExpectedConditions.visibilityOf(systemUsersText));
	
//		
		
		
	}
	
	
	

}

package AllPagesWithPageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	@FindBy(xpath= "//img[@alt='profile picture']")
	public WebElement profilepictureImage;
	
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement admin_Link;	
	//  standard  while giving var/ ele name
	//  labelname_typeOfele
	// Firstname text box  --  firstName_TxtBox;
	// ex2:   Lastname text box  -  lastName_TxtBox
//	ex3   Login button  -->  Login_Btn
	// Ex4:  Male Radio button 	-- > MAle_RadioBtn;
	/// Ex 5:  Checkbox  --- >  
	// EX6:  Link  ---->   
	
	//  Duplicate elements 
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement  adminLink;
	
	
	//..................

	//2 define constr  and use Pagefeactory.initelemnts()
	public HomePage(WebDriver driver)
	{
		System.out.println();
		
//		// intilaise all elemnst
//		profilepictureImage =  driver.findElement(By.xpath("//img[@alt='profile picture']"));
//		admin_Link =  driver.findElement(By.xpath("//span[text()='Admin']"));
//		systemUsersText =  driver.findElement(By.xpath("//h5[text()='System Users']"));
		System.out.println("driver= " +driver);
		
		PageFactory.initElements(driver, this);
		
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
	}
	
	//  if resuable method is  there ,   use that method / call that method  form test case
	//  if resuable method is not  there , we have to develop new method / write a new method 
	
	
	

}

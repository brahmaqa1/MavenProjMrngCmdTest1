package AllPagesWithPageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	//	1.define all elements with locators 
	
	// @FindBy(loc name = "loca val")
	@FindBy(name = "username") //  @FindBy - is Annotation -  can be use to identify element with given lcator name =  loc val
	public WebElement UsernameTextbox;

	@FindBy(name = "password")
	public WebElement Passwordtextbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn; //    if element is not initialised ,   by defualt  webelemnt var has null value

	@FindBy(xpath="//a")
//	public WebElement allLinks;
	public List<WebElement> allLinks;
	


	//	2. initilase all elements 	/   we use constr 
	public LoginPage(WebDriver driver) //  constr 
	{
//		UsernameTextbox =  driver.findElement(By.name("username"));
//		Passwordtextbox = driver.findElement(By.name("password"));
//		loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		PageFactory.initElements(driver, this);
		//  this current class obj 
		
		// PageFactory - predefined class in Selenium
		//  has initElements()  can be used to initiliase all elments in current class with given locators
		//  We dont need to write driver.findElement() every time 
		// without identifying element using driver.findElemnt() ;  we can initilaise all elements  -- we can for pagefactory

	}

	//	UsernameTextbox = driver.findElemnt(by.xpath());

	//	3.   define seperate method for each action / utilise all elments in method //
	public void  enter_username(String val)
	{
		System.out.println("Enter user name =" + val);
		UsernameTextbox.sendKeys(val);
		//  null.sendKeys(); //  throws NullPointerException
//		java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.WebElement.sendKeys(java.lang.CharSequence[])" because "this.UsernameTextbox" is null
	}
	
	public void  enter_password(String val)
	{
		System.out.println("Enter password =" + val);
		Passwordtextbox.sendKeys(val);
	}
	
	public void  click_LoginBtn()
	{
		System.out.println("clikc login button");
		loginBtn.click();
	}

	
	public void getAllLinks()
	{
		int linksCnt =  allLinks.size();
		System.out.println("linksCnt =" +linksCnt);
		
	}

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	//	1.define all elements with locators 


	public WebElement UsernameTextbox;

	public WebElement Passwordtextbox;
	
	public WebElement loginBtn;


	//	2. initilase all elements 	/   we use constr 
	public LoginPage(WebDriver driver) //  constr 
	{
		UsernameTextbox =  driver.findElement(By.name("username"));
		Passwordtextbox = driver.findElement(By.name("password"));
		loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
					//		PageFactory.initElements(driver, this);

	}

	//	UsernameTextbox = driver.findElemnt(by.xpath());

	//	3.   define seperate method for each action / utilise all elments in method //
	public void  enter_username(String val)
	{
		System.out.println("Enter user name =" + val);
		UsernameTextbox.sendKeys(val);
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


}

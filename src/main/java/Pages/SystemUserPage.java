package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SystemUserPage 
{
	//1
	public WebElement systemUsersText;
	
	//2
	
	public SystemUserPage(WebDriver driver)
	{
		systemUsersText =  driver.findElement(By.xpath("//h5[text()='System Users']"));
	}
	
	
	//3
	public void verifySystemUserPageDisplayed()
	{
		
		System.out.println("Verify System Users page is displayed");
//		
		if(systemUsersText.isDisplayed())
		{
			System.out.println("System User page is displayed");
		}
		else
		{
			System.out.println("System User page is displayed");
		}
	}
	

}

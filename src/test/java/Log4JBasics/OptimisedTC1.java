package Log4JBasics;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OptimisedTC1  extends TestBase
{

	@Test
	public void testA()
	{
//		Logger  log =Logger.getLogger("testA");
		
		// way1  access log obj  var from TestBase class
//		TestBase  tb=  new TestBase();
//		Logger  log =  tb.log;
		
		//  Way 2 : accces log var   from test base class
		
		log.info(" ----->   1. Oct 16 Tc1: Verify Login ");
		log.info("Step2: Enter user name");
		log.info("3. Enter pwd");
		log.debug("4. Click login btn");
		log.debug("5. Home page is displayed");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");			
		WebDriver driver =  new ChromeDriver();

		// open given url
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		driver.findElement(By.name("firstname")).sendKeys("Ramu");
		
		log.info("TC ends here");
		
		System.out.println("Hi");
	
		
	}
	
	
}

package ExtentReportsBasics1;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OptimisingExtentReportsTC1  extends  MyListeners
{
	@Test
	public void login()
	{
//		// write login stepss in extent report
//		String ResultFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\ExtentReportsBasics1\\MyExtentReportsNew2.html";
//		ExtentReports  exReports = new ExtentReports(ResultFile);	
//		
		//  get parent class var   i.e exReports  from  MyListeners
		
//		ExtentTest exTest =  exReports.startTest("Login TC");
		
				System.out.println("exTest ="+exTest);
				// to log
				exTest.log(LogStatus.PASS, "1. Open browser and Enter url");
				exTest.log(LogStatus.PASS, "2. Enter username");
				exTest.log(LogStatus.PASS, "3. Enter password");
				exTest.log(LogStatus.PASS, "4. click login");
				exTest.log(LogStatus.PASS, "5. Home page is displayed successfully");
		
//		exReports.endTest(exTest);
//		exReports.flush();	
		
	}

}

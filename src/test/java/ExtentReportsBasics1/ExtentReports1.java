package ExtentReportsBasics1;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports1 {

	@Test
	public   void testA()
	{
		System.out.println("testA - started execution");
		System.out.println("testA - Step- 1 : Enter user name");
		System.out.println("testA - Step -2 : Enter password");
		// testNG 
		// to generate   extent reports :  we need Extentreports. jar file 
		
		//  Predefiend classes -  can be used to generaet reports  and 
		//log  PAss msgs   in  reports
		//      Fail msgs
		//      info
		///      warning 
//		2   imp classes in extent reports
//		1. ExtentReports   	--  predefined class in Extentreports
//		2. ExtentTest		--  predefined class in Extentreports
		
		String ResultsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\ExtentReportsBasics1\\MyExtentreports.html";
		ExtentReports  exReports =  new ExtentReports(ResultsFile);
		
		ExtentTest  exTest =	exReports.startTest("Test Case 1");	
		
		//  pass msg
		exTest.log(LogStatus.PASS, "1. Open browser and enter url");
		exTest.log(LogStatus.PASS, "2. Enter user name");
		
		// fail msg
		exTest.log(LogStatus.FAIL, "3.Enter password ");
		
		// info msg
		exTest.log(LogStatus.INFO, "4. Click login button");
		
		// warning msg
		exTest.log(LogStatus.WARNING, "5. Passing warning msg ");
		
		exReports.endTest(exTest);
		
		exReports.flush();//   if we dont write, it does not generate extenreports.html file
			
		//   repeat for TC2 :
		
		ExtentTest  exTest2 = 	exReports.startTest("Test Case 2 ");
		
		exTest2.log(LogStatus.PASS, "TC2:  open order page");		
		exTest2.log(LogStatus.FAIL, "Order page is not open");
		
		exReports.endTest(exTest2);
		
		exReports.flush();//  is compulsory we have to use after logging all msg and after endtest()
		
		
		// HW  repeat for TC3 :   write any steps  -- pass, fail, info, warning msgs 
		
		
		
		
	}
	
	
}

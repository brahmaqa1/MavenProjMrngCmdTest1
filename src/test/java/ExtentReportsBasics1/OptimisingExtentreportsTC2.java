package ExtentReportsBasics1;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OptimisingExtentreportsTC2 extends MyListeners
{
	@Test
	public void createOrder()
	{
		
//		// write createOrder steps in extent report
//		// write login stepss in extent report
//				String ResultFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\ExtentReportsBasics1\\MyExtentReportsNew3.html";
//			//   creates new file here and log msgs 
//				ExtentReports  exReports = new ExtentReports(ResultFile);	
				
//				ExtentTest exTest =  exReports.startTest("createOrder TC");
				
						// to log
						exTest.log(LogStatus.PASS, "1.Search for product");
						exTest.log(LogStatus.PASS, "2. Select the Samsung mobile product");
						exTest.log(LogStatus.PASS, "3.Add qty");
						exTest.log(LogStatus.PASS, "4. add to cart");
						exTest.log(LogStatus.PASS, "5.checkout");
				
//				exReports.endTest(exTest);
//				exReports.flush();	
		
	}

}

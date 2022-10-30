package ExtentReportsBasics1;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class MyListeners implements ITestListener
{
	//	String ResultFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\MyExtentReports\\MyExtentReportsLatest.html";
	//	ExtentReports  exReports = new ExtentReports(ResultFile);

	public ExtentReports  exReports;
	public static  ExtentTest exTest;
	//   

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		System.out.println("onStart gets executed only once ");
		//  MyExtentReportsLatest +  Date and Time format 16101046
		Date d = new Date();
		System.out.println("d="+ d);// Sun Oct 16 10:46:43 IST 2022

		//		MyExtentReportsLatest Sun Oct 16 10:49:29 IST 2022.html
		// replace  space by underscore              MyExtentReportsLatest_Sun_Oct_16_10:49:29_IST_2022.html
		// :  replace by underscrore
		String newDate =	d.toString();
		newDate =newDate.replace(" ", "_");
		newDate =newDate.replace(":", "_");
		System.out.println("newDate=" +newDate);

		//String ResultFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\MyExtentReports\\MyExtentReportsLatest" + newDate+ ".html";
//		String ResultFile = ".\\MyExtentReports\\MyExtentReportsLatest" + newDate+ ".html";
		// . Dot refers current project folder
		String ResultFile = ".\\MyExtentReports\\MyExtentReportsLatest.html";

		System.out.println("ResultFile=" +ResultFile);		
		exReports = new ExtentReports(ResultFile);

	}


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("onTestStart -  gets executed for each Test Method");


		//		 exTest =  exReports.startTest("Login TC");
		//      some val 

		//  get test method name which is getting executed
		String TestName= result.getName();
		System.out.println("TestName =" +TestName);
		exTest =  exReports.startTest(TestName);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);

		exReports.endTest(exTest);
		exReports.flush();	
	}


}

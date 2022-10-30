package Log4JBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");			
		WebDriver driver =  new ChromeDriver();

		// open given url
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		//*****************************
		
//		Select :  is predefined class in selenium.  which has some methods - can select the values in thr dropdown
		//Select class  Methods:  Sele
		//------------------------------------
		//1. selectByVisibleText​(java.lang.String text)
		//2.selectByValue​(java.lang.String value)
		//3.selectByIndex​(int index)
		
		// Select the value 'Audi' in dropdown
		
		//1. create 'Select' class object
		//selectByVisibleText("")
//		ex:    classNAme  referVar =  new classNAme();
		//Select  sel = new Select();// The constructor Select() is undefined
		
//		WebElement carsDropdownEle=  driver.findElement(By.xpath("//select[@name='cars']"));	
//		Select sel  = new Select(carsDropdownEle);
//		
//		sel.selectByVisibleText("Audi");
//		Thread.sleep(4000);
//		
//		// select 'Kia'  
//		sel.selectByVisibleText("Kia");
//		Thread.sleep(4000);
//		
//		// sel.selectByVisibleText("bmw");// .NoSuchElementException: Cannot locate option with text: bmw
//		
//		// Note : all dropdown values are case sensitive, we have to give exact values from dropdown
//		sel.selectByVisibleText("BMW");
//		
//		Thread.sleep(4000);
		
		//**********************************************************
//		2. SelectByValue("value")
		
//	 WebElement carsDropdownele = driver.findElement(By.xpath("//select[@name='cars']"));
//		Select sel = new Select(carsDropdownele);
//		
//		sel.selectByValue("Mercedesval");
//		Thread.sleep(4000);
//		
//		// sleect maruthi
//		sel.selectByValue("maruthival");	
//		
//		//HW :select swift 	
//		
//		
////		sel.selectByValue("Mercedes");// erro ;NoSuchElementException: Cannot locate option with value: Mercedes
//		// we dont have value= Mercedes   for any option tag
//		Thread.sleep(4000);
	
		//*******************************************
		//3.selectByIndex​(int index)
		 WebElement carsDropdownele = driver.findElement(By.xpath("//select[@name='cars']"));
			Select sel = new Select(carsDropdownele);
			
			sel.selectByIndex(0);//   sleect first value in dropdown
			//index no always starts from index no =0 
			//  1st dropdown value - index no =0
			// 2nd dropdown value - index no   =1
		
			//  ....
			Thread.sleep(4000);
			
			sel.selectByIndex(1); // select 2nd value in dropdown
			Thread.sleep(4000);
			
			sel.selectByIndex(2); //  select 3rd  value in dropdown
			Thread.sleep(4000);
			
//			sel.selectByIndex(100);// NoSuchElementException: Cannot locate option with index: 100
			// in Dropdown, we dont have 99 value, we have index till 0 to 5 only 
			//  it does not throw indexoutoBoundsException
			
			// HW Select diff vlaues in Bikes dropdown use selectbyVisibleText("exact text from dropdown"), 
			//SelectbyValue("value prop") , SelectByIndex(0)
			
			
			WebElement SelectedOptionEle=  sel.getFirstSelectedOption();
			// option - is tag or ele in page --  
			
//			<Option>  Maruthi </option>
//			<a>  google  </a>
			
//			getText();  can be used to get text from element
			String selectedText = SelectedOptionEle.getText();
			                   // method retunns / gets selected value i.e selectedText = Mercedes from dropdown and store result in left side variable
			// i.e . selectedText. so selectedText  contains selectedText = Mercedes
			System.out.println("selectedText = " +selectedText);
			// selectedText = Mercedes
			
			
			// Select audi 
			sel.selectByVisibleText("Audi");
		WebElement  getFirstSelectedOptionEle =	sel.getFirstSelectedOption();
		
		String  selectedVal2FromDropdown=   getFirstSelectedOptionEle.getText();
			System.out.println("selectedVal2FromDropdown=" +selectedVal2FromDropdown);// Audi
			//selectedVal2FromDropdown=Audi
						
			
			//Can I use get text()  for below htm cosde?			
			//< input  type="text" name='firtname'  > 
//			HW :  Can I use getText()  first anme text box ? ?????
			
			// HW Select 'BMW' from cars dropdown  and get seleceted value and display it ?
			
			// HW Select 'Kia' from cars dropdown  and get seleceted value and display it ?

	}

}

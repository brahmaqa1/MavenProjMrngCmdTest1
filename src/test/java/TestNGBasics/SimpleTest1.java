package TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest1 {

	
	@Test
	public void testA()
	{
		System.out.println("Executing testA -1");
		System.out.println("Executing testA  -2-");
		System.out.println("Executing testA  -3-");
	}

}

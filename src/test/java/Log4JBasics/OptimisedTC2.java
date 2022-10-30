package Log4JBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class OptimisedTC2  extends TestBase
{

	@Test
	public void testB()
	{
//		Logger  log = Logger.getLogger("testB");
//		// Access log var from test base
//		TestBase tb = new TestBase();
//		 Logger  log=  tb.log;
		
		
		log.info("TC2 :  create order ");
		log.debug(" Enter prod name");
		log.debug("add to cart and checkout ");
		
		

		
	}
	
	
}

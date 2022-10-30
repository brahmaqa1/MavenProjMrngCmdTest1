package Log4JBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TC2 {

	@Test
	public void testB()
	{
		Logger  log = Logger.getLogger("testB");
		
		log.info("TC2 :  create order ");
		log.debug(" Enter prod name");
		log.debug("add to cart and checkout ");

		
	}
	
	
}

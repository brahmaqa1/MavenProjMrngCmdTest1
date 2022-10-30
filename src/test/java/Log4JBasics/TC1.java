package Log4JBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TC1 {

	@Test
	public void testA()
	{
		Logger  log =Logger.getLogger("testA");
		log.info(" ----->    Oct 16 Tc1: Verify Login ");
		log.info("Step2: Enter user name");
		log.info("3. Enter pwd");
		log.debug("4. Click login btn");
		log.debug("5. Home page is displayed");
		
		log.info("TC ends here");
		
		System.out.println("Hi");
	
		
	}
	
	
}

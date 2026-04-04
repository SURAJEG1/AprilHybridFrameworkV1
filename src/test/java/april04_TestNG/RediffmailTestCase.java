package april04_TestNG;

import org.testng.annotations.Test;

public class RediffmailTestCase extends BaseTest{
	
	
	@Test
	public void iframeHandlesRobotAndWindowHandles() 
	{
		driver.get(rediffmailUrl);
		Rediffmail_HomePageObject iframe = new Rediffmail_HomePageObject(driver);
		iframe.iframe();
		iframe.bseText();
		iframe.nseText();
		iframe.searchBox("IPL Match Result");
		iframe.windowHandles();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

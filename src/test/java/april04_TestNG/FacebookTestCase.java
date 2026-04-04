package april04_TestNG;

import java.awt.AWTException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class FacebookTestCase extends BaseTest{
	
	
	@Test
	public void mouseHoverAction() throws AWTException, InterruptedException 
	{
		driver.get(facebookUrl);
		System.out.println("Browser and Url Open");
		Facebook_LoginPageObject mousehover = new Facebook_LoginPageObject(driver);
		mousehover.rightClickOnInstagramLink();
		System.out.println("Right click on instagram link");
		mousehover.robotClass();
		System.out.println("Using robot class for arrow down key");
		Thread.sleep(1000);
		mousehover.windowHandles();
		System.out.println("using window Handles");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

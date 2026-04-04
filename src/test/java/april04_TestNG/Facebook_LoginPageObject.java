package april04_TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LoginPageObject {
	//object of WebDriver interface
	WebDriver driver;
	
	
	//constructor
	public Facebook_LoginPageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (linkText = "Instagram") WebElement insta;
	
	
	public void rightClickOnInstagramLink() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(insta).contextClick().build().perform();
	}
	
	
	public void robotClass() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	
	
	public void windowHandles() 
	{
		ReusableMethods reusable = new ReusableMethods(driver);
		reusable.windowHandles();
	}
	
	
	
	
	
	
	

}

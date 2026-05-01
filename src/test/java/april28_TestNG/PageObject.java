package april28_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	//create object of WebDriver interface;
	WebDriver driver;
	//constructor
	public PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (id = "") WebElement id;
	@FindBy (name = "") WebElement name;
	@FindBy (className = "") WebElement className;
	@FindBy (linkText = "") WebElement linkText;
	@FindBy (partialLinkText = "") WebElement partialLinkText;
	@FindBy (tagName = "") WebElement tagName;
	@FindBy (css = "") WebElement css;
	@FindBy (xpath = "") WebElement spath;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

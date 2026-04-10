package april10_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {

	//create object of WebDriver interface;
	WebDriver driver;
	
	
	//constructor
	public PageObjectClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "") WebElement enterFirstName;
	@FindBy (tagName = "") WebElement enterLastName;
	@FindBy (className = "") WebElement className;
	@FindBy (css = "") WebElement css;
	@FindBy (linkText = "") WebElement linkText;
	@FindBy (id = "") WebElement id;
	@FindBy (partialLinkText = "") WebElement partiallinkText;
	@FindBy (className = "") WebElement classname;
	
	
	
	
	public void getFirstName(String fName) 
	{
		enterFirstName.sendKeys(fName);
	}
	
	
	public void getLastName(String lName) 
	{
		enterLastName.sendKeys(lName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

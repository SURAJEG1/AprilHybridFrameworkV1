package april09_TestNG;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_HomePageObject {
	//create object of WebDriver interface
	WebDriver driver;
	Select sc;
	
	//constructor
	public Amazon_HomePageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (id = "searchDropdownBox") WebElement dropdown;
	@FindBy (id = "twotabsearchtextbox") WebElement searchBox;
	@FindBy (xpath = "//span[@class='s-heavy']") List<WebElement> dynamicLsit;
	@FindBy (tagName = "a") List<WebElement> homePageLinkList;
	
	
	public void staticDropdown_SelectByValue() {
		sc = new Select(dropdown);
		sc.selectByValue("search-alias=amazon-devices");
	}
	
	
	
	public void staticDropdown_SelectByIndex(int index) 
	{
		sc = new Select(dropdown);
		sc.selectByIndex(index);
	}
	
	
	
	public void staticDropdown_SendKeysAction() 
	{
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
	}
	
	
	
	public void amazonHomePageLinks() 
	{
		int count = homePageLinkList.size();
		System.out.println(count);
	}
	
	
	public void amazonHomePageLinksPrint() 
	{
		homePageLinkList.size();
		System.out.println("Total Links : " + homePageLinkList.size());
		for(WebElement linkCount : homePageLinkList) 
		{
			System.out.println(linkCount.getText());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

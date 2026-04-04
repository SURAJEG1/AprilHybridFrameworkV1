package april04_TestNG;

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
	
	//constructor
	public Amazon_HomePageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (id = "searchDropdownBox") WebElement dropdown;
	@FindBy (id = "twotabsearchtextbox") WebElement searchBox;
	@FindBy (xpath = "//span[@class='s-heavy']") List<WebElement> dynamicList;
	
	
	
	public void amazonDropdown_SelectByValue(String value) 
	{
		Select sc = new Select(dropdown);
		sc.selectByValue(value);
	}
	
	
	public void amazonDropdown_SelectByIndex(int index) 
	{
		Select sc = new Select(dropdown);
		sc.selectByIndex(index);
	}
	
	
	
	public void amazonDropdown_SelectBySendKeysAction() 
	{
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
	}
	
	
	
	public void dynamicSearch1(String prod, int index) throws InterruptedException 
	{
		searchBox.sendKeys(prod);
		int count = dynamicList.size();
		Thread.sleep(1000);
		System.out.println(count);
		dynamicList.get(index).click();
	}
	
	
	
	
	public void dynamicSearch2(String prod, String details) 
	{
		searchBox.sendKeys(prod);
		
		System.out.println(dynamicList.size());
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains(details)) 
			{
				dynamicList.get(i).click();
				break;
			}
			
		}
	
		
	}
	
	
	
	
	
	
	

}

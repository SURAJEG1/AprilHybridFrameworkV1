package april09_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Tc001_StaticDropdown extends BaseTest{
	
	

	@Test(enabled = false)
	public void staticDropdown_SelectByValue() 
	{
		driver.get(amazonUrl);
		Amazon_HomePageObject value = new Amazon_HomePageObject(driver);
		value.staticDropdown_SelectByValue();
	}
	
	@Test(enabled = false)
	public void staticDropdown_SelectByIndex() 
	{
		driver.get(amazonUrl);
		Amazon_HomePageObject value = new Amazon_HomePageObject(driver);
		value.staticDropdown_SelectByIndex(4);
	}
	
	@Test(enabled = false)
	public void staticDropdown_SelectBySendKeysAction() 
	{
		driver.get(amazonUrl);
		Amazon_HomePageObject value = new Amazon_HomePageObject(driver);
		value.staticDropdown_SendKeysAction();
	}
	
	
	@Test(enabled = false)
	public void amazonHomePageLinksCount() 
	{
		driver.get(amazonUrl);
		Amazon_HomePageObject linkCount = new Amazon_HomePageObject(driver);
		linkCount.amazonHomePageLinks();
	}
	
	
	
	@Test
	public void amazonHomePageLinksPrint() 
	{
		driver.get(amazonUrl);
		Amazon_HomePageObject linksPrint = new Amazon_HomePageObject(driver);
		linksPrint.amazonHomePageLinksPrint();
		
	}
	
	
	
	
	
	
	
	
	

}

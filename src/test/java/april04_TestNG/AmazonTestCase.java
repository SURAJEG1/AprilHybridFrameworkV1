package april04_TestNG;

import org.testng.annotations.*;

@Listeners(Listener.class)
public class AmazonTestCase extends BaseTest{
	
	
	@Test
	public void tc001_StaticDropdownSelectByValue() 
	{
		driver.get(amazonUrl);
		System.out.println("Browser & AmazonUrl Open");
		Amazon_HomePageObject dropdown = new Amazon_HomePageObject(driver);
		dropdown.amazonDropdown_SelectByValue("search-alias=fashion");
	}
	
	
	@Test
	public void tc002_StaticDropdownSelectByIndex() 
	{
		driver.get(amazonUrl);
		System.out.println("Browser & AmazonUrl Open");
		Amazon_HomePageObject dropdown = new Amazon_HomePageObject(driver);
		dropdown.amazonDropdown_SelectByIndex(5);
	}
	
	
	
	@Test
	public void tc003_StaticDropdownSelectBySendKeys() 
	{
		driver.get(amazonUrl);
		System.out.println("Browser & AmazonUrl Open");
		Amazon_HomePageObject dropdown = new Amazon_HomePageObject(driver);
		dropdown.amazonDropdown_SelectBySendKeysAction();
	}
	
	
	@Test
	public void tc004_DynamicSearch_Index() throws InterruptedException 
	{
		driver.get(amazonUrl);
		Amazon_HomePageObject dynamicSearch = new Amazon_HomePageObject(driver);
		dynamicSearch.dynamicSearch1("shoes", 5);
	}
	
	
	@Test
	public void tc005_DynamicSearch_DynamicClick() 
	{
		driver.get(amazonUrl);
		System.out.println("Browser & AmazonUrl Open");
		Amazon_HomePageObject dynamicSearch = new Amazon_HomePageObject(driver);
		dynamicSearch.dynamicSearch2("laptop", "under 50k");
	}
	
	
	
	

}

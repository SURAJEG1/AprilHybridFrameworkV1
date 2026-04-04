package april04_TestNG;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediffmail_HomePageObject {
	//create object of WebDriver interface
	WebDriver driver;
	
	//constructor
	public Rediffmail_HomePageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (id = "bseindex") WebElement bse;
	@FindBy (id = "nseindex") WebElement nse;
	@FindBy (id = "query") WebElement searchBox;
	
	
	public void iframe() 
	{
		driver.switchTo().frame("moneyiframe");
	}
	
	
	public void bseText() 
	{
		System.out.println(bse.getText());
	}
	
	
	public void nseText() 
	{
		System.out.println(nse.getText());
	}
	
	
	
	public void searchBox(String src) 
	{
		searchBox.sendKeys(src);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	
	public void windowHandles() 
	{
		ReusableMethods rubm = new ReusableMethods(driver);
		rubm.windowHandles();
	}
	
	
	
	
	
	
	
	
	
	

}

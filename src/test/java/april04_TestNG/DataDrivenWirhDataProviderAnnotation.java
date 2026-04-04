package april04_TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class DataDrivenWirhDataProviderAnnotation extends BaseTest{
	
	
	@Test(dataProvider = "item")
	public void searchProd(String prod) 
	{
		driver.get(amazonUrl);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(prod);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	
	@DataProvider(name = "item")
	public static Object[][] dataDriven() throws IOException
	{
		String fileName = "E:\\InfoEge Automation Project\\AprilHybridFrameworkV1\\Excelfile\\ProductDetails.xlsx";
		String sheetName = "items";
		
		return ReadExcelUtility.excelDriven(fileName, sheetName);
	}
	
	
	
	
	
	
	
	
	
	

}

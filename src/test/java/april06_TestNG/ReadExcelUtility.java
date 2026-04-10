package april06_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUtility {
	
	
	
	public static Object[][] excelDriven(String filepath, String sheetname) throws IOException
	{
		//setup-1
		FileInputStream fis = new FileInputStream(filepath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		
		//setup-2
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		//setup-3
		Object[][] data = new Object[rowCount-1][columnCount];
		
		//setup-4
		for(int i=1; i<rowCount; i++) 
		{
			Row row = sheet.getRow(i);
			for(int j=0; j<columnCount; j++) 
			{
				Cell cell = row.getCell(j);
				data[i-1][j] = cell.toString();
			}
		}
		
		//setup-5
		workbook.close();
		return data;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

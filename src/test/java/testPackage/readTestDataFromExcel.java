package testPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readTestDataFromExcel {

	@Test
	public void myTestData() throws IOException {
		File filePath = new File("C:\\Users\\gopi.balde\\OneDrive - Ideabytes\\Documents\\myIb\\automationFrameworks\\Selenium-testNg\\selenium-testNG\\src\\test\\java\\testData\\testDataFile.xlsx");
		FileInputStream fis = new FileInputStream(filePath);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		String myValues = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(myValues);
		xsf.close();
	}


}

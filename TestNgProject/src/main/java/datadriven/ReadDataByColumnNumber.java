package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataByColumnNumber 
{

	public static void main(String[] args) throws Exception 
	
	{
	FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet("login");
	XSSFRow row = sheet.getRow(2);
	XSSFCell cell = row.getCell(0);
	String value = cell.getStringCellValue();
			
	System.out.println(value);
	wb.close();
	fis.close();
	}

}

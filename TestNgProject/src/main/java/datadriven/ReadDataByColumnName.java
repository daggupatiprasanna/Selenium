package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
	FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet("login");
     XSSFRow row = sheet.getRow(0);
     XSSFCell Cell;
     
     int cellindex = -0;
     for(int i=0; i<row.getFirstCellNum();i++)
     {
    	 if(row.getCell(i).getStringCellValue().trim().equals("Password"))
    		 cellindex =i;
    	      }
     row = sheet.getRow(3);
     Cell = row.getCell(cellindex);
    Object value = Cell.getStringCellValue();
    System.out.println(value);
    wb.close();
    fis.close();
     
			

     
	}

}

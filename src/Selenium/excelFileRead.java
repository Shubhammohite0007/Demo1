package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//give locn to file 
		File src=new File("E:\\Softwares\\Training Materials\\Training Materials\\Short Notes.xlsx");
		//load file 
		FileInputStream fis=new FileInputStream(src);
		//load workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//load work sheet 
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		System.out.println(" name of sheet "+sh.getRow(1).getCell(1).getStringCellValue());
		
		System.out.println(" "+sh.getRow(1).getCell(0).getStringCellValue());
		
		System.out.println(" Total num of roe is "+sh.getPhysicalNumberOfRows());

	}

}

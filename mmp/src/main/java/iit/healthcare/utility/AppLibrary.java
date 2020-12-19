package iit.healthcare.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AppLibrary {

	
	
	public static String selectFutureDate(int days)
	{
		Calendar cal= Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, days);
		Date date=cal.getTime();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY");
		String formattedDate=sdf.format(date);
		return formattedDate; 
	}
	

	public static String[][] readXLS(String filePath ) throws BiffException, IOException
	{
		File f=new File(filePath);
		Workbook w= Workbook.getWorkbook(f);		 
		Sheet s= w.getSheet(0);	 
		//number of rows in the sheet having data		 
		int rows= s.getRows();
		//number of columns in the sheet having data
		int col= s.getColumns();
		 /*go to each row.its each column and fetch the datafrom cell
		Create an array which is going to store all the values of rows and columns */

		String inputdata[][]=new String[rows-1][col];

		//read the data
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<col;j++) 
			{
				//fetch the data from each cell of that row
				Cell cell= s.getCell(j,i);
				//once you have the cell value fetch the contents
				inputdata[i-1][j]=cell.getContents().toString();

			}
		}

		return inputdata;
	}

	
	
     public static String[][] readXlsx(String filePath) throws IOException{
		
		File srcFile = new File(filePath);
		FileInputStream fis = new FileInputStream(srcFile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[row][col];
		 XSSFCell cell;
		for (int i=0; i<row; i++)
		{
			for(int j=0;j<col;j++)
			{
				cell=sheet.getRow(i).getCell(j);
				String cellContents= cell.getStringCellValue();
				data[i][j]= cellContents;
				
			}
		}
		
		return data;		
		
	}	
	
}	
	


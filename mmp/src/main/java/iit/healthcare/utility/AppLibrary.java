package iit.healthcare.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.DataProvider;

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
	
	@DataProvider(name="inputdata")
	public static String[][] readXLS(String fileName ) throws BiffException, IOException
	{
		File f=new File("F:\\QA Training\\RADIUS -Selenium Healthcare Project\\Login.xls");
		/*fetch the excelfrom above provided location and store it an object*/
	
		Workbook w= Workbook.getWorkbook(f);		 
		Sheet s= w.getSheet("Sheet1");	 
		//number of rows in the sheet having data		 
		int rows= s.getRows();
		//number of columns in the sheet having data
		int col= s.getColumns();
		// go to each row.its each column and fetch the datafrom cell
		//Create an array which is going to store all the values of rows and columns

		String inputdata[][]=new String[rows][col];

		//read the data
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++) 
			{
				//fetch the data from each cell of that row
				Cell c= s.getCell(j,i);
				//once you have the cell value fetch the contents
				inputdata[i][j]=c.getContents();

			}
		}

		return inputdata;
	}
	 
	 
	 public static String[][] readXLSX(String fileName)
	 {
	  return new String[10][10];
	 }
	
	
	
}

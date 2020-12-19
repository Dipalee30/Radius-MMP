package org.iit.healthcare.mmp.patientmodule.tests;

import java.io.IOException;

import org.iit.healthcare.base.TestBaseClass;
import org.iit.healthcare.mmp.patientmodule.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import iit.healthcare.utility.AppLibrary;
import jxl.read.biff.BiffException;

public class LoginTest extends TestBaseClass {
	
 
	
	/*@Parameters({"uname","pword"})
	@Test
	public void login(String uname,String pword)
	{
		launchApplication("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");

		LoginPage lpage= new LoginPage(driver);	
		lpage.login(uname,pword);





	}*/
	
	
	@Test(dataProvider="testData")
	public void login(String uname,String pword)
	{
		launchApplication("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		
		LoginPage lpage= new LoginPage(driver);	
		lpage.login(uname,pword);
		
		
		
	}
	
	
	/*@DataProvider (name="testData")
	public String[][] loginData() throws IOException, BiffException
	{
		 String[][] loginData=AppLibrary.readXLS("Login1.xls");
		 return loginData;
		
		
	}*/
	
	@DataProvider (name="testData")
	 public String[][] loginData2() throws IOException
	 {
		 String[][] loginData2=AppLibrary.readXlsx("Login2.xlsx");
		 
		 return loginData2;
	 }
	
	
	
	
	
	
	
	
	
}

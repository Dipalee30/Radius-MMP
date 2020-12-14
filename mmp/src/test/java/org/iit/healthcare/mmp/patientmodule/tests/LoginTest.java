package org.iit.healthcare.mmp.patientmodule.tests;

import org.iit.healthcare.base.TestBaseClass;
import org.iit.healthcare.mmp.patientmodule.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import iit.healthcare.utility.AppLibrary;

public class LoginTest extends TestBaseClass {
	/*@Parameters({"uname","pword"})
	@Test
	public void login(String uname,String pword)
	{
		launchApplication("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");

		LoginPage lpage= new LoginPage(driver);	
		lpage.login(uname,pword);





	}*/
	
	
	@Test(dataProvider="inputdata")
	public void login(String uname,String pword)
	{
		launchApplication("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		
		LoginPage lpage= new LoginPage(driver);	
		lpage.login(uname,pword);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

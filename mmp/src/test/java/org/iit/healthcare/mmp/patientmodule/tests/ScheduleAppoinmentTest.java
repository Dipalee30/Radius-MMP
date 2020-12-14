package org.iit.healthcare.mmp.patientmodule.tests;



import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.iit.healthcare.base.TestBaseClass;
import org.iit.healthcare.mmp.patientmodule.pages.HomePage;
import org.iit.healthcare.mmp.patientmodule.pages.LoginPage;
import org.iit.healthcare.mmp.patientmodule.pages.ScheduleAppointmentPage;

import org.testng.Assert;
import org.testng.annotations.Test;




public class ScheduleAppoinmentTest extends TestBaseClass {
	
	
	@Test
	public void validateScheduleappoinment() throws InterruptedException 
	{
		
		launchApplication("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		
		LoginPage lpage= new LoginPage(driver);	
		lpage.login("ria1","Ria12345");
		
		HomePage hPage=new HomePage(driver);
		hPage.navigationMenuItem("Schedule Appointment");
		 ScheduleAppointmentPage sPage=new ScheduleAppointmentPage(driver);
		 HashMap<String,String> appointmentDetailsHmap= sPage.bookAppointment("Dr.Beth");
       
      boolean result=hPage.validatePatientPortalMessage();
      Assert.assertTrue(result);
      
      HashMap<String,String> hompageDetailsHmap=hPage.validateApptDetailsinHomePage();
       Assert.assertEquals( appointmentDetailsHmap,hompageDetailsHmap);
       
      
       hPage.navigationMenuItem("Schedule Appointment");
       
      
       HashMap<String,String> sPageHMap = sPage.validateApptDetailsinsPage();
       Assert.assertEquals(appointmentDetailsHmap, sPageHMap);
     
     
     
     
     
       
       
       
       
       
	}

	
	}
		
		
       
       
	
	
	
       
       
       
       
       
       
	



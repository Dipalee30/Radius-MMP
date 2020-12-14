package org.iit.healthcare.mmp.patientmodule.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private final WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void navigationMenuItem(String tabname)
	{
		//Navigation to the module
	       driver.findElement(By.xpath("//span[contains(text(),'"+tabname+"')]")).click();
	}
	
	public boolean validatePatientPortalMessage()
	{
		//validation -1
	       
	       WebDriverWait wait=new  WebDriverWait(driver,30);
	      Boolean result= wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[@class='panel-title']"), "Patient Portal"));
	       return result;
	}
	
	
	public HashMap<String, String> validateApptDetailsinHomePage()
	{

	       // Validation 2- Appointment Details are displayed in the home page
	       //table[@class='table']//tr[1]/td[1] -dateofAppointment
	       //table[@class='table']//tr[1]/td[2] - time
	       //table[@class='table']//tr[1]/td[3] - sym
	       //table[@class='table']//tr[1]/td[4] - doctorName
	       
	       HashMap<String,String> hompageDetailsHmap=new HashMap<String,String>();
	       hompageDetailsHmap.put("dateofAppointment", driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[1]")).getText());
	       hompageDetailsHmap.put("time", driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[2]")).getText());
	       hompageDetailsHmap.put("sym", driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[3]")).getText());
	       hompageDetailsHmap.put("doctorName", driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[4]")).getText());
	       return hompageDetailsHmap;
	}
	
	
	
	
	
	
	
	
}

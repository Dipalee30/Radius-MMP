package org.iit.healthcare.mmp.patientmodule.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditProfilePage {
     private final WebDriver driver;
     
     HashMap<String,String> profileDetails=new HashMap<String,String>();
	public EditProfilePage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void EditProfile()
	{
	
		driver.findElement(By.xpath("//a[@href='profile.php']")).click();
		
	    //driver.findElement(By.id("fname")).sendKeys(arg0);
		
	   // profileDetails.put("First Name", value)
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}

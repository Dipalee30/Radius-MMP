package org.iit.healthcare.mmp.patientmodule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import iit.healthcare.utility.AppLibrary;

public class LoginPage {
	 private final WebDriver driver;
	 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login(String uname,String pword)
	{
		
		 //login
	       driver.findElement(By.id("username")).sendKeys(uname);
	       driver.findElement(By.id("password")).sendKeys(pword);
	        driver.findElement(By.name("submit")).click();
	}
	
	
	
	
}

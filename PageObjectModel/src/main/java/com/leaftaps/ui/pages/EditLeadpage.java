package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class EditLeadpage extends ProjectSpecificMethod{
	
	public EditLeadpage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public EditLeadpage UpdateCompanyName(String companyname)
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyname);
		return this;
	}
	public ViewLeadpage ClickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadpage(driver);
			
	}
	
}

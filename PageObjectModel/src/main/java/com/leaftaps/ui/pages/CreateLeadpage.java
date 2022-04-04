package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class CreateLeadpage extends ProjectSpecificMethod{
	
	public CreateLeadpage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateLeadpage enterCompanyName(String companyname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		return this;
	}
	public CreateLeadpage enterFirstName(String firstname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
	}

	public CreateLeadpage enterLastName(String lastname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;
	}

	public ViewLeadpage ClickCreateLeadButton()
	
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadpage(driver);
	}


}

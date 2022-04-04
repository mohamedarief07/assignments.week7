package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class DuplicatePage extends ProjectSpecificMethod{
	
	public DuplicatePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public DuplicatePage DuplicateCompanyName(String companyname)
	{
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyname);
		return this;
	}
	public ViewLeadpage ClickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadpage(driver);
	}



}

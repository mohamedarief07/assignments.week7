package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MyLeadpage extends ProjectSpecificMethod{
	
	public MyLeadpage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	

	public FindLeadspage ClickFindLead()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadspage(driver);

	}
}

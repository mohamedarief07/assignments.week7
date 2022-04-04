package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class Leadpage extends ProjectSpecificMethod{
	
	public Leadpage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateLeadpage ClickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadpage(driver);
	}
	public FindLeadspage ClickFindLead()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadspage(driver);
	}
	public MergeLeadPage ClickMergeLead()
	{
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver);
	}
}

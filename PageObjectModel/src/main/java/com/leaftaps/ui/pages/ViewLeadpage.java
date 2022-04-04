package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class ViewLeadpage extends ProjectSpecificMethod{
	
	public ViewLeadpage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public ViewLeadpage VerifyLeadID()
	{
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(text);
		return this;
	}
	
	public EditLeadpage ClickEditButton()
	{
		driver.findElement(By.linkText("Edit")).click();
	
		return new EditLeadpage(driver);
	}
	
	public DuplicatePage ClickDuplicateButton()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
	
		return new DuplicatePage(driver);
	}
	
	public MyLeadpage ClickDeleteButton()
	{
		driver.findElement(By.linkText("Delete")).click();
	
		return new MyLeadpage(driver);
	}
	
	
	public FindLeadspage ClickFindLead()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadspage(driver);

	}

}

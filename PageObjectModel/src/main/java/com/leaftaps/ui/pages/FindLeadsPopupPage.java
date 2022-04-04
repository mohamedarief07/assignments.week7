package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class FindLeadsPopupPage extends ProjectSpecificMethod{
	
	public FindLeadsPopupPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public FindLeadsPopupPage EnterFirstName_From(String firstname_from)
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])")).sendKeys(firstname_from);
		return this;
	}
	
	public FindLeadsPopupPage EnterFirstName_TO(String firstname_to)
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])")).sendKeys(firstname_to);
		return this;
	}
	public FindLeadsPopupPage ClickPhoneTab()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public FindLeadsPopupPage EnterphNumber(String phoneNumber)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		return this;
	}
	

	public FindLeadsPopupPage ClickFindLeadsButton()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	
	
	public MergeLeadPage ClickFirstLeadID() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new MergeLeadPage(driver);
	}
	
	
}

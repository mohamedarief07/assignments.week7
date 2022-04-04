package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class FindLeadspage extends ProjectSpecificMethod{
	
	public FindLeadspage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public  FindLeadspage GetTextleadID()
	{
		WebElement LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	
		return this;
	}
	public FindLeadspage EnterLeadID()
	{
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys();
		return this;
	}	
		

	public FindLeadspage EnterFirstName(String firstname)
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstname);
		return this;
	}
	
	
	public FindLeadspage EnterLastName(String lastName)
	{
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys(lastName);
		return this;
	}
	
	public FindLeadspage ClickPhoneTab()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public FindLeadspage EnterphNumber(String phoneNumber)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		return this;
	}
	

	
	public FindLeadspage ClickFindLeadsButton()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	
	public FindLeadspage VerifyRecordsNotFound()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return this;
	}
	
	public ViewLeadpage ClickFirstLeadID() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadpage(driver);
	}
	
	
}

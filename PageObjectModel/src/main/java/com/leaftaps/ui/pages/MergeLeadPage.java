package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MergeLeadPage extends ProjectSpecificMethod{
	
	public MergeLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public MergeLeadPage ClickFromLeadLookup()
	{
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return this;
	}
	
	
	public MergeLeadPage ClickToLeadLookup()
	{
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return this;
	}
	
	public FindLeadsPopupPage getWindowHandlesToNewScreen()
	{
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsPopupPage(driver);
	}
	
	public MergeLeadPage getWindowHandlesToOldScreen()
	{
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return this;
	}

	public MergeLeadPage ClickMergeButton()
	{
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
	}
	
	public ViewLeadpage ManageAlert()
	{
		driver.switchTo().alert().accept();
		return new ViewLeadpage(driver);
	}



}

package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class Homepage extends ProjectSpecificMethod{
	
	public Homepage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public Leadpage ClickLeadTab()
	{
		driver.findElement(By.linkText("Leads")).click();
		return new Leadpage(driver);
	}

}

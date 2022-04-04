package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class Welcomepage extends ProjectSpecificMethod{
	
	public Welcomepage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public Homepage ClickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new Homepage(driver);
	}

}

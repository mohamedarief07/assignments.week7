package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class Loginpage extends ProjectSpecificMethod {

	public Loginpage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public Loginpage enterusername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;

	}

	public Loginpage enterpassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;

	}

	public Welcomepage clikcLoginButton_Positive() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Welcomepage(driver);

	}

	public Loginpage clikcLoginButton_Negative() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;

	}

}

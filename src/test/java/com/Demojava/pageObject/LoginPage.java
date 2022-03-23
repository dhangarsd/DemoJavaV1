package com.Demojava.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage   {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver,this );
		
	}
	
	
	@FindBy(xpath="//input[@name=\"uid\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//input[@name=\"btnLogin\"]")
	private WebElement login;
	
	@FindBy(xpath="//input[@name=\"btnReset\"]")
	private WebElement reset;
	
	
	
	public void setusername(String userid) {
		username.sendKeys(userid);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void login() {
		login.click();
	}
	
	public void reset() {
		reset.click();
	}

	
		

	
	
	
	
	
}

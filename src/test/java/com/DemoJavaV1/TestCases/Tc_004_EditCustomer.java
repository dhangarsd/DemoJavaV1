 package com.DemoJavaV1.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Demojava.pageObject.EditCustomer;
import com.Demojava.pageObject.LoginPage;
@Listeners(com.DemoJavaV1.utilities.Listerner.class)
public class Tc_004_EditCustomer extends BaseClass {


@Test
public void LoginTest() {
	LoginPage l=new LoginPage(driver);
	l.setusername(username);
	System.out.println("Username is enter");
	l.setPassword(password);
	System.out.println("password is enter");
	l.login();
	System.out.println("Login is done");
	
}

@Test(priority=1)
	public void EditCustomerwithId() {
		EditCustomer e=new EditCustomer(driver);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		try {
		WebElement close=	driver.findElement(	By.xpath("//span[@class=\"ns-uyhmr-e-18\"]"));
                close.click();
           }
	finally {	
		e.EditCustomer();
		e.Custid("101");
		e.Submit();
		
	}
}}

package com.DemoJavaV1.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Demojava.pageObject.EditCustomer;
import com.Demojava.pageObject.LoginPage;




//@Listeners(com.DemoJavaV1.utilities.Listerner.class)

public class Tc_002_LoginTest_BaseClass extends BaseClass {
  
  
  
	 @Test
	public void loginTest() throws IOException {
		
	LoginPage l=new LoginPage(driver);
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 l.setusername(username);
	 l.setPassword(password);
	 l.login();
	String atitle=driver.getTitle();
	capture(driver,"Login");
		Assert.assertEquals(atitle,"Guru99 Bank Manager HomePagess");
		

	}
	
	 @Test(priority=1)
	 public void EditCustomerwithId() throws IOException {
			EditCustomer e=new EditCustomer(driver);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			capture(driver," EditCustomerwithId");
			
			try 
			{
			WebElement close=	driver.findElement(	By.xpath("//span[@class=\"ns-uyhmr-e-18\"]"));
	                close.click();
	        
			}
			
		 finally
		 {	
			 
			System.out.println("I have not click close button");
		 }
			
			e.EditCustomer();
			e.Custid("101");
			e.Submit();
			capture(driver," EditCustomerwithId");
	 }


}


	
	
	
	
	
	



package com.DemoJavaV1.TestCases;







import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DemoJavaV1.utilities.ExtentReporter;
import com.Demojava.pageObject.LoginPage;

//@Listeners(com.DemoJavaV1.utilities.Listerner.class)

public class TC_LoginTest_001  {
	
String baseurl="https://www.demo.guru99.com/V4/";
String username="mngr384763";
String password="evarUhA";

	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseurl);
 
 
	}
	
	@Test(priority=1)
	public void prerequest(){
		System.out.println("Method is going to execute");
		
	}

	@Test     
	public void Login() {
		
		LoginPage p=new LoginPage(driver);
	
	
		p.setusername(username);
		
		p.setPassword("password");
	
		p.login();
		
		String title=driver.getTitle();
		if(driver.getTitle().equals(title)) {
			//System.out.println("I am passed");
		Assert.assertTrue(true);
	
		}
		else {
			Assert.assertTrue(false);
		System.out.println("I am fail");
		}
		
	}
}

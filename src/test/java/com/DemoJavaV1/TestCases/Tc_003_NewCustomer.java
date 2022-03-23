package com.DemoJavaV1.TestCases;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Demojava.pageObject.LoginPage;
import com.Demojava.pageObject.NewCustomer;

@Listeners(com.DemoJavaV1.utilities.Listerner.class)
public class Tc_003_NewCustomer extends BaseClass {

	@Test(priority=-1)
	public void loginTest() {
		
		LoginPage l=new LoginPage(driver);
		System.getLogger("I am logger");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 l.setusername(username);
		 l.setPassword(password);
		 System.getLogger("password is added succesfully");
		 l.login();
		 System.getLogger("loggin is done");
			String atitle=driver.getTitle();
			Assert.assertEquals(atitle,"Guru99 Bank Manager HomePage");
			System.getLogger("yupp done it ");
	}
	
	@Test
		public void newCustomer() {
		NewCustomer n=new NewCustomer(driver);
	       n.newCustomer();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	     Set<String> s1=driver.getWindowHandles();
	      Iterator <String>itr=s1.iterator();
	    try {   
	      if(s1.size()>1)
	         {
	          driver.switchTo().window(itr.next());
	         System.out.println("yes there are more than two window is present");
	           }
	          else 
	          {
	        	  System.out.println("Only single window is present");
	          }
	     
	    WebElement close1= driver.findElement(By.xpath("//span[@class=\"ns-uyhmr-e-18\"]"));
	     if(close1.isDisplayed()==true) 
	     {
	    	Alert a= driver.switchTo().alert();
	    	a.dismiss();
	    	System.out.println("Yes Element was there");
	     }
	    
	     WebDriverWait wait=new WebDriverWait(driver,20);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"ns-uyhmr-e-18\"]")));
	     close1.click();
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"ns-uyhmr-e-18\"]")));
	       close1.click();
	    }        
	          catch(Exception e) {
	        	  System.out.println("Exception was there but handels");
	        	  e.printStackTrace();
	          } 
	    finally{
	     try { 
	    	 n.Customername("Saurabh");
	              n.Gender();
	              n.adress("Manur kh,tq-Bodwad");
	              n.city("Pune");
	              n.submit();
	              Alert al=driver.switchTo().alert();
	       al.accept();
	     }   
	        catch(Exception e1) 
	        {
	        	System.out.println("2nd time exceptions was there but handel");
	        	e1.printStackTrace();
	        }
	      }
	       
	  }
  }

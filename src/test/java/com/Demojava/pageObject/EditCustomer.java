package com.Demojava.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoJavaV1.TestCases.BaseClass;

public class EditCustomer {
  WebDriver driver;
	@FindBy(xpath="//a[text()=\"Edit Customer\"]") private WebElement edit;
	@FindBy(xpath="//input[@name=\"cusid\"]") private WebElement custid;
	@FindBy(xpath="//input[@value=\"Submit\"]") private WebElement submit;
	
	public EditCustomer(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
        public void EditCustomer() 
      {
	        edit.click();
     }
     public void Custid(String id) 
     {
    	 custid.sendKeys(id);
     }
     
     public void Submit() {
    	 submit.click();
     }
    


}

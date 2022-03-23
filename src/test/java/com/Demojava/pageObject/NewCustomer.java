package com.Demojava.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewCustomer {
WebDriver driver;
	@FindBy(xpath ="//a[text()=\"New Customer\"]") private WebElement newCustomer;
	@FindBy(xpath="//label[text()=\"Customer name must not be blank\"]") private WebElement Customername;
	@FindBy(xpath="//textarea[@name=\"addr\"]") private WebElement address;
	@FindBy(xpath="//input[@name=\"rad1\"][1]") private WebElement Gender;
	@FindBy(xpath="//input[@id=\"dob\"]") private WebElement date;
	@FindBy(xpath="//input[@name=\"city\"]") private WebElement City;
	@FindBy(xpath="//input[@value=\"Submit\"]")	private WebElement Submit;
	@FindBy(xpath="//span[text()=\"Close\"]") private WebElement close;
	@FindBy(xpath="//span[@class=\"ns-uyhmr-e-18\"]") private WebElement close1;
	
	public  NewCustomer(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
    public void newCustomer() {
            newCustomer.click();
}
     public void Customername(String name) {
	     Customername.sendKeys(name);
}
public void adress(String name) {
	address.sendKeys(name);
}
public void Gender() {
	Gender.click();
}

public void city(String name) {
	City.sendKeys(name);
}
public void submit() {
	Submit.click();
}

public void close() {
	
	
	close1.click();
}

}

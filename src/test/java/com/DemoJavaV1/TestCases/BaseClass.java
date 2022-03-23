package com.DemoJavaV1.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.PropertyComponentBuilder;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import com.DemoJavaV1.utilities.ReadConfig;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class BaseClass {
String baseurl="https://www.demo.guru99.com/V4/";
String username="mngr384763";
String password="evarUhA";
	//String chrome="C:\\Users\\Shri\\eclipse-workspace\\DemoJavaV1\\Drivers\\chromedriver.exe";
WebDriver driver;
	ReadConfig read=new ReadConfig();
	//String baseurl=read.getbaseeurl();
	//String username=read.getusername();
	//String password=read.getpassword();
	
	
//@Parameters("Browser")
@BeforeClass
public void setup() {
//if(br.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shri\\eclipse-workspace\\DemoJavaV1\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
    // driver.get(baseurl);
}
	//	}
/*else if(br.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shri\\eclipse-workspace\\DemoJavaV1\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
}
	else if (br.equals("ie")) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Shri\\eclipse-workspace\\DemoJavaV1\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	driver.get(baseurl);   
}
 
@AfterClass
public void teardown() {
	driver.close();

}*/
  public  void  capture(WebDriver driver,String tname) throws IOException {
	  TakesScreenshot tr=((TakesScreenshot)driver);
	try {
	  File source=  tr.getScreenshotAs(OutputType.FILE);
	
	File destination=new File(System.getProperty("user.dir")+"/Screenshots/" +tname + ".png");
	FileHandler.copy(source, destination);
	}
	catch(Exception e) {
	e.printStackTrace();
	System.out.println("Screenshot is capture");
	}
	  
  }

}
	


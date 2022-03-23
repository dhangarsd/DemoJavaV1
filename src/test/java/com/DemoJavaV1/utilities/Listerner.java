package com.DemoJavaV1.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listerner extends TestListenerAdapter {
	ExtentReports extent;
	ExtentTest test;
	ExtentSparkReporter htmlreporter;
	File resource;
	File destination;
	

	public void onTestStart(ITestResult tr) {
		System.out.println("Method started Succesufuuluyyyyy");
		test=extent.createTest(tr.getName());
		
		Assert.assertTrue(true,"Test is gonna kill");
		test.log(Status.INFO, "test is start");
	//	resource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		/*destination=new File("/DemoJavaV1/Screenshots/AllScreenshot/"+tr.getTestName()+".png");
		try {
			FileHandler.copy(resource, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		*/
		
	}
	
	public void onTestFailure(ITestResult tr) {
		test=extent.createTest(tr.getName());
		Assert.assertTrue(false,"test is fail");
	  test.log(Status.INFO, tr.getThrowable());
	  
	
	
	}
	
	public void onTestSuccess(ITestResult tr) {
	test=extent.createTest(tr.getName());
	test.log(Status.INFO,"test is success");
		
	}

public void onTestSkipped(ITestResult tr) {
	System.out.println("Test is skipped");
}
}

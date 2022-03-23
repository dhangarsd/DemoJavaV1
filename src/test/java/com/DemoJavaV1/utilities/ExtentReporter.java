package com.DemoJavaV1.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter extends TestListenerAdapter{
 ExtentSparkReporter htmlreporter;
	ExtentReports extent;
	ExtentTest test;
	
	
	public void onTestStart(ITestResult tr) {
		extent=new ExtentReports();
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());  //TIME STAMP
		String rpname="FirstReport"+timestamp+".html";
htmlreporter=new ExtentSparkReporter( "C:\\Users\\Shri\\eclipse-workspace\\DemoJavaV1\\test-output/ "+ rpname);
		
	  extent.attachReporter(htmlreporter);
	  extent.setSystemInfo("Host ","Local host");
	  extent.setSystemInfo("user", "Saurabh");
	  extent.setSystemInfo("Envirement","QA");
	  try {
		htmlreporter.loadXMLConfig("C:\\Users\\Shri\\eclipse-workspace\\DemoJavaV1/extent-config.xml");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	 String screenshot="C:\\Users\\Shri\\eclipse-workspace\\DemoJavaV1\\Screenshots"+tr.getName()+".png";
	 File f=new File(screenshot);
	 if(f.exists()) {
		 
		 test.addScreenCaptureFromBase64String("Screenshot is save at below"+test.addScreenCaptureFromPath(screenshot));
	 }
	  
	}
		public void onTestFailure(ITestResult tr) {
		test=extent.createTest(tr.getTestName());
		Assert.assertTrue(true);
		test.log(Status.PASS,"Status is pass");
		 String screenshot="C:\\Users\\Shri\\eclipse-workspace\\DemoJavaV1\\Screenshots/"+tr.getName()+".png";
		 File f=new File(screenshot);
		 if(f.exists()) {
			try { 
				test.fail("screenshot is below" + test.addScreenCaptureFromPath(screenshot));
			// test.fail("Screenshot is place at below object" + test.addScreenCaptureFromPath(screenshot));
			}	
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 } }
		 
	public void onTestSuccess(ITestResult tr) 
	{
		test=extent.createTest(tr.getTestName());
		Assert.assertTrue(false);
		test.log(Status.FAIL,"Test is fail");
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getThrowable());
		}
	}}	
		
		
	
	
	
	
	


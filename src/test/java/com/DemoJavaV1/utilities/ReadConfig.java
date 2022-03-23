package com.DemoJavaV1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public  ReadConfig(){
		File src=new File("C:\\Users\\Shri\\eclipse-workspace\\DemoJavaV1/Configuration/config.properties");
		try {
			FileInputStream fin=new FileInputStream(src);
			Properties pro=new Properties();
			pro.load(fin);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
	
	public String getbaseeurl() {
	String baseurl=	pro.getProperty("url");
			
		return baseurl;
	
	}
	
	public String getusername() {
	String username=	pro.getProperty("username");
	
	return username;
	}
	public String getpassword() {
		 String password= pro.getProperty("password");
	return password;
	}
	public String getChromePath() {
		String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
}
	


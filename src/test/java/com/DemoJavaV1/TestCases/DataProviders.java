package com.DemoJavaV1.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders extends BaseClass {

	@Test(dataProvider="LoginData")
	public void get(String user,String mam) {
		System.out.println(user + mam);
	}

@DataProvider(name="LoginData")
public String[][] getdata() {
	
	String data[][]= {{"dhangarsaurabh2@gmail.com",		"xyzaahskhsh"	},
			{"saurabhdada14@gmail.com	","xyxx"}};

return data;
}

}

package com.DemoJavaV1.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.testng.annotations.Test;


import com.sun.tools.sjavac.Log;




public class Tc_005_SampelTest {
Logger logger= LogManager.getLogger("DemoJavaV1");

@Test
public void just() {
	Logger logger= LogManager.getLogger(Tc_005_SampelTest.class);
	logger.info("i am logger");
	
}

}

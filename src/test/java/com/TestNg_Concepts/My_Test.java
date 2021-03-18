package com.TestNg_Concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {
	
	@Test(retryAnalyzer=RetryAnalyser.class)
	private void credentials() {
		
		String actual = "smith";
		String expected = "starc";
		
	
		Assert.assertEquals(actual, expected);

	}
	
	@Test(retryAnalyzer=RetryAnalyser.class)
	private void credentials1() {
		
		String actual = "smith";
		String expected = "starc";
		
	
		Assert.assertEquals(actual, expected);
	}
}

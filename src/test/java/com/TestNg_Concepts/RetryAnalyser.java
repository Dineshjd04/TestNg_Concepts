package com.TestNg_Concepts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	
	int count = 0, limit = 5;

	public boolean retry(ITestResult result) {
		
		if (count < limit) {
			
			count++;
			
			return true;
			
		}
		return false;
	}

}

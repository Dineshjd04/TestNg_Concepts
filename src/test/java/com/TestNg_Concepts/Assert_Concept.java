package com.TestNg_Concepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	
	@Test
	private void credentials() {

		String actual = "smith";
		String expected = "starc";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		
		
		
		
	}

}

package com.TestNg_Concepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameter_Test {
	
	
	@Test
    @Parameters({"username","password"})
	private void credential(@Optional("starc")String username,int Password) {
		
		System.out.println("username : "+username);
		System.out.println("password : "+Password);

		
	}
}

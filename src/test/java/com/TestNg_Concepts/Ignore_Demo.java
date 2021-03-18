package com.TestNg_Concepts;

import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class Ignore_Demo {

	@BeforeSuite
	private void setproperty() {
		System.out.println("Set Property");

	}
	
	@BeforeTest
	private void browserlaunch() {
		System.out.println("Browser Launch");
     

	}
	
	@BeforeClass
	private void url() {
		System.out.println("url");

	}
	
	@BeforeMethod
	private void login() {
		System.out.println("Login");

	}
	
	@Ignore
	@Test
	private void Booksearch() {
		System.out.println("Book Search");

	}
	
	@Test
	private void Laptopsearch() {
		System.out.println("Laptop Search");

	}
	
	
	@Test
	private void Earphonessearch() {
		System.out.println("Ear phones search");

	}
	
	@Test 
	private void Mobilesearch() {
		System.out.println("Mobile Search");

	}
	
	@AfterMethod
	private void logout() {
		System.out.println("Logout");

	}
	
	@AfterClass
	private void VerifyHomePage() {
		System.out.println("Home Page");

	}
	
	@AfterTest
	private void close() {
		System.out.println("Browser Close");

	}
	
	@AfterSuite
	private void deleteallcookies() {
		System.out.println("Delete All Cookies");

	}

}



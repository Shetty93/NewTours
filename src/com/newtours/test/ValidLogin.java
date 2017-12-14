package com.newtours.test;

import org.testng.annotations.Test;

import com.newtours.page.HomePage;



import generic.BaseTest;

public class ValidLogin extends BaseTest{
	
	@Test(priority=1)
	public void testValidLogin() throws InterruptedException
	{
		HomePage hp= new HomePage(driver);
		hp.setUserName("manager");
		hp.setPassword("manager");
		hp.clickLogin();
		hp.verifyTitle("Find a Flight: Mercury Tours:");
		hp.clickSignOff();
	}

}

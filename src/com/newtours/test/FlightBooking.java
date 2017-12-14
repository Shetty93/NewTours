package com.newtours.test;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import com.newtours.page.FlightFinder;
import com.newtours.page.HomePage;

public class FlightBooking extends BaseTest{

	@Test(priority=2)
	public void testFlightBooking() throws Exception
	{
//		HomePage hp= new HomePage(driver);
//		hp.setUserName("manager");
//		hp.setPassword("manager");
//		hp.clickLogin();
//		Thread.sleep(1000);
//		FlightFinder f = new FlightFinder(driver);
//		f.selectTripType("oneway");
//		Thread.sleep(1000);
//		f.selectPaasengerCount("3");
//		Thread.sleep(1000);
//		f.selectFromPort("London");
//		Thread.sleep(1000);
//		f.selectFromDate("4","7");
//		Thread.sleep(1000);
//		f.selectToPort("Paris");
//		f.selectToDate("6","10");
//		f.selectServiceClass("Business class");	
//		f.selectAirline("Unified Airlines");
//		f.continueToFindFlights();
//		Thread.sleep(1000);
//		f.selectDepartFlight("Blue Skies Airlines$361");
//		f.selectReturnFlight("Blue Skies Airlines$631");
//		f.continueToReserveFlights();
//		f.securePurchase();
//		f.verifyTitle("Flight Confirmation: Mercury Tours");
		
		HomePage hp= new HomePage(driver);
		hp.setUserName(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 0));
		hp.setPassword(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 1));
		hp.clickLogin();
		FlightFinder f = new FlightFinder(driver);
		f.selectTripType(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 2));
		f.selectPaasengerCount(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 3));
		f.selectFromPort(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 4));
		f.selectFromDate(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 5),Excel.getCellVaue(XLPATH, "FlightBooking", 1, 6));
		f.selectToPort(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 7));
		f.selectToDate(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 8),Excel.getCellVaue(XLPATH, "FlightBooking", 1, 9));
		f.selectServiceClass(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 10));	
		f.selectAirline(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 11));
		f.continueToFindFlights();
		f.selectDepartFlight(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 12));
		f.selectReturnFlight(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 13));
		f.continueToReserveFlights();
		f.securePurchase();
		f.verifyTitle(Excel.getCellVaue(XLPATH, "FlightBooking", 1, 14));
	}
}

package com.newtours.page;

import java.util.List;

import generic.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class FlightFinder extends BasePage{
	int i;

	@FindBy(xpath="//input[@value='roundtrip']")
	private WebElement roundTrip;
	
	@FindBy(xpath="//input[@value='oneway']")
	private WebElement oneWay;
	
	@FindBy(xpath="//select[@name='passCount']")
	private WebElement passengerCount;
	
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement fromPort;
	
	@FindBy(xpath="//select[@name='fromMonth']")
	private WebElement fromMonth;
	
	@FindBy(xpath="//select[@name='fromDay']")
	private WebElement fromDay;
	
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement toPort;
	
	@FindBy(xpath="//select[@name='toMonth']")
	private WebElement toMonth;
	
	@FindBy(xpath="//select[@name='toDay']")
	private WebElement toDay; 
	
	@FindBy(xpath="//input[@value='Coach']")
	private WebElement Economy; 
	
	@FindBy(xpath="//input[@value='Business']")
	private WebElement Business; 
	
	@FindBy(xpath="//input[@value='First']")
	private WebElement First; 
	
	@FindBy(xpath="//select[@name='airline']")
	private WebElement airline; 
	
	@FindBy(xpath="//input[@name='findFlights']")
	private WebElement continueToFindFlights; 
	
	@FindBy(xpath="//input[@name='reserveFlights']")
	private WebElement continueToReserveFlights; 
	
	@FindBy(xpath="//input[@name='buyFlights']")
	private WebElement securePurchase; 
//	
//	@FindBy(xpath="//input[@name='findFlights']")
//	private WebElement continueto; 
	
	@FindBy(linkText="PROFILE")
	private WebElement profile;	
	
	
	public FlightFinder(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
	}
	
	public void selectTripType(String triptype) throws InterruptedException
	{
		if(triptype.equals("roundtrip"))
		{
			while(!roundTrip.isSelected())
			{
				oneWay.click();
			}
				Reporter.log("RoundTrip is selected", true);
		}
		else if(triptype.equals("oneway"))
		{
			while(!oneWay.isSelected())
			{
				oneWay.click();
			}
			Reporter.log("Oneway is selected", true);
		}
				
	}
	
	public void selectPaasengerCount(String count) throws InterruptedException
	{
		Select dropdown=new Select(passengerCount);
		dropdown.selectByValue(count);		
		Reporter.log(count+" passengers", true);
	}	
	public void selectFromPort(String fromPort)
	{
		Select dropdown=new Select(this.fromPort);
		dropdown.selectByValue(fromPort);
		Reporter.log("Depart From "+fromPort, true);
	}

	public void selectFromDate(String fromMonth, String fromDay)
	{		
		Select month=new Select(this.fromMonth);
		month.selectByValue(fromMonth);
		
		Select day=new Select(this.fromDay);
		day.selectByValue(fromDay);
				
		Reporter.log("From Date : "+fromDay+" "+fromMonth);
	}
	
	public void selectToPort(String toPort)
	{
		Select dropdown=new Select(this.toPort);
		dropdown.selectByValue(toPort);
		Reporter.log("Depart To "+toPort, true);
	}
	
	public void selectToDate(String toMonth, String toDay)
	{		
		Select month=new Select(this.toMonth);
		month.selectByValue(toMonth);
		
		Select day=new Select(this.toDay);
		day.selectByValue(toDay);
				
		Reporter.log("Till Date : "+toDay+" "+toMonth);
	}
	
	
	public void selectServiceClass(String serviceClass)
	{
		if(serviceClass.equals("Economy class"))
		{
			while(!Economy.isSelected())
			{
				Economy.click();
			}
				Reporter.log("Economy class is selected", true);
		}
		else if(serviceClass.equals("Business class"))
		{
			while(!Business.isSelected())
			{
				Business.click();
			}
			Reporter.log("Business is selected", true);
		}
		else if(serviceClass.equals("First class"))
		{
			while(!First.isSelected())
			{
				First.click();
			}
			Reporter.log("First class is selected", true);
		}
	}
	
	public void selectAirline(String airline)
	{
		Select dropdown=new Select(this.airline);
		dropdown.selectByVisibleText(airline);
		Reporter.log("Selected airline is "+airline, true);
	}
	
	public void continueToFindFlights()
	{
		continueToFindFlights.click();
	}
	
	public void selectDepartFlight(String departflight)
	{
		WebElement departFlight = driver.findElement(By.xpath("//input[contains(@value,'"+departflight+"')]"));
		while(!departFlight.isSelected())
		{
			departFlight.click();
		}
		Reporter.log(departflight+" is selected for departing", true);
	}
	
	public void selectReturnFlight(String returnflight)
	{
		WebElement returnFlight = driver.findElement(By.xpath("//input[contains(@value,'"+returnflight+"')]"));
		while(!returnFlight.isSelected())
		{
			returnFlight.click();
		}
		Reporter.log(returnflight+" is selected for returning", true);
	}
	
	public void continueToReserveFlights()
	{
		continueToReserveFlights.click();
	}
	public void securePurchase()
	{
		securePurchase.click();
	}
	
}

package com.newtours.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import generic.BasePage;

public class HomePage extends BasePage{
	
	@FindBy(name="userName")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(linkText="SIGN-OFF")
	private WebElement signOFF;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String name)
	{
		userName.sendKeys(name);
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
		
	public void clickLogin() throws InterruptedException
	{
		login.click();
		Thread.sleep(1000);
	}
		
	public void clickSignOff()
	{
		signOFF.click();
	}
}

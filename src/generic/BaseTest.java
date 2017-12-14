package generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConst{
	
	public WebDriver driver;
	
//	@Parameters({"node","browser"})
	
//	public void preCondition(String node, String browserName) throws Exception
	@BeforeMethod
	public void preCondition() throws Exception
	{
//		System.setProperty(GECKO_KEY, GECKO_VALUE);
//		driver=new FirefoxDriver();		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		
//		URL system=new URL(node);
//		DesiredCapabilities browser=new DesiredCapabilities();
//		browser.setBrowserName(browserName);
//		driver=new RemoteWebDriver(system, browser);		
		driver.get("http://newtours.demoaut.com/");
//		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}

}

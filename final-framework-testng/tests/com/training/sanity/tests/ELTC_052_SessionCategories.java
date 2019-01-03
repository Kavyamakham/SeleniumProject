//To verify whether application allows admin to create training session based on the created sessions categories list
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.SessionscategoriesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_052_SessionCategories 
{
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private SessionscategoriesPOM SessionCatePOM;
	private String Wait;

	@BeforeClass
	public void setUpBeforeClass() throws IOException, InterruptedException 
	{
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		Wait = properties.getProperty("implicitWait");	

	}

	@AfterTest
	public void tearDown() 
	{
		driver.close();
	}
	@Test (priority=1)
	public void validLoginTest()  
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		screenShot.captureScreenShot("7");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("8");
	}

	@Test (priority=2)
	public void SessionCategoriesTest() 
	{
		//Create object for SessionscategoriesPOM
		SessionscategoriesPOM SessionCatePOM = new  SessionscategoriesPOM(driver);	
		SessionCatePOM.clickSessioncategories();
		Wait = properties.getProperty("implicitWait");		
		screenShot.captureScreenShot("9");
		SessionCatePOM.clickAddcategory();		
		screenShot.captureScreenShot("10");
		//Category name is Entered text box
		SessionCatePOM.category("Testing");
		SessionCatePOM.clickAddtoCategory();
		screenShot.captureScreenShot("11");
		SessionCatePOM.clicktrainingSession(); 
		SessionCatePOM.clickAddtrainingSession();
		// Session name entered in text box
		SessionCatePOM.Sessionname("selenium training session02");
		SessionCatePOM.clickAdvanceSetting();
		screenShot.captureScreenShot("12");
		SessionCatePOM.ClickSession();
		SessionCatePOM.ClickNextStep();
		SessionCatePOM.clicktesting();
		screenShot.captureScreenShot("13");
		SessionCatePOM.clickbutton();
		SessionCatePOM.clickNextbutton();
		//student name is Entered in Portal users lists
		SessionCatePOM.portal("sunil");
		SessionCatePOM.clickstudentlink();
		screenShot.captureScreenShot("14");
		SessionCatePOM.clickFinishcreation();
		screenShot.captureScreenShot("15");
	}
}

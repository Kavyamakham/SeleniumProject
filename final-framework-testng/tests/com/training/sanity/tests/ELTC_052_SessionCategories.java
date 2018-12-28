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
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearDown() throws Exception 
	{
		Thread.sleep(1000);
		driver.close();
	}
	@Test (priority=1)
	public void validLoginTest() throws InterruptedException 
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		Thread.sleep(5000);
		screenShot.captureScreenShot("7");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(5000);
		screenShot.captureScreenShot("8");
	}

	@Test (priority=2)
	public void SessionCategoriesTest() throws InterruptedException 
	{
		SessionscategoriesPOM SessionCatePOM = new  SessionscategoriesPOM(driver);	//Object created for SessionscategoriesPOM
		SessionCatePOM.clickSessioncategories();
		Thread.sleep(5000);
		screenShot.captureScreenShot("9");
		SessionCatePOM.clickAddcategory();
		Thread.sleep(5000);
		screenShot.captureScreenShot("10");
		SessionCatePOM.category("Testing");//Category name is Entered text box
		SessionCatePOM.clickAddtoCategory();
		Thread.sleep(5000);
		screenShot.captureScreenShot("11");
		SessionCatePOM.clicktrainingSession(); 
		SessionCatePOM.clickAddtrainingSession();
		SessionCatePOM.Sessionname("selenium training session");// Session name entered in text box
		SessionCatePOM.clickAdvanceSetting();
		Thread.sleep(5000);
		screenShot.captureScreenShot("12");
		SessionCatePOM.ClickSession();
		SessionCatePOM.ClickNextStep();
		SessionCatePOM.clicktesting();
		Thread.sleep(5000);
		screenShot.captureScreenShot("13");
		SessionCatePOM.clickbutton();
		SessionCatePOM.clickNextbutton();
		SessionCatePOM.portal("sunil");//student name is Entered in Portal users list
		SessionCatePOM.clickstudentlink();
		Thread.sleep(5000);
		screenShot.captureScreenShot("14");
		SessionCatePOM.clickFinishcreation();
		Thread.sleep(5000);
		screenShot.captureScreenShot("15");
	}
}

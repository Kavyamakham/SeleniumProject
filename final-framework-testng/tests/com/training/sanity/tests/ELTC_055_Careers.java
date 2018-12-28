package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CareersPromotPOM;
import com.training.pom.LoginPOM;
import com.training.pom.ReportingPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_055_Careers {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private CareersPromotPOM CareersPOM;

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
		screenShot.captureScreenShot("32");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(5000);
		screenShot.captureScreenShot("33");
	}

	@Test (priority=2)
	public void ReportingTest() throws InterruptedException 
	{
		CareersPromotPOM CareersPOM = new  CareersPromotPOM(driver);	//object created for CareersPromotPOM
		CareersPOM.clickcareersandpromotion();
		Thread.sleep(5000);
		screenShot.captureScreenShot("34");
		CareersPOM.clickcareers();
		Thread.sleep(5000);
		screenShot.captureScreenShot("35");
		CareersPOM.clickAdd();
		Thread.sleep(5000);
		screenShot.captureScreenShot("36");
		CareersPOM.Name("QA");//send the text box
		CareersPOM.clickAddcareers();
		Thread.sleep(5000);
		screenShot.captureScreenShot("37");		
		CareersPOM.ClickCareersandpromotions();
		Thread.sleep(5000);
		screenShot.captureScreenShot("38");
		CareersPOM.Clickpromotion();
		CareersPOM.ClickAddIcon();
		CareersPOM.SendPromotionName("QA for Tester");//Send to PromotionName
		Thread.sleep(5000);
		CareersPOM.ClickPromotionSubmit();
		Thread.sleep(5000);
		screenShot.captureScreenShot("39");
		CareersPOM.clicksubscriber();
		CareersPOM.selectSession();
		CareersPOM.arrow();
		CareersPOM.ClickSessionbutton();
		Thread.sleep(5000);
		screenShot.captureScreenShot("40");
	}
}

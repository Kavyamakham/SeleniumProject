//To verify whether application allows admin to create career, promotion & subscribe session to promotion
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
		screenShot.captureScreenShot("33");
		loginPOM.clickLoginBtn(); 		
		screenShot.captureScreenShot("34");
	}

	@Test (priority=2)
	public void ReportingTest()  
	{
		//Create object for CareersPromotPOM
		CareersPromotPOM CareersPOM = new  CareersPromotPOM(driver);	
		CareersPOM.clickcareersandpromotion();	
		Wait = properties.getProperty("implicitWait");
		screenShot.captureScreenShot("35");
		CareersPOM.clickcareers();		
		screenShot.captureScreenShot("36");
		CareersPOM.clickAdd();
		screenShot.captureScreenShot("37");
		CareersPOM.Name("QA");//send the text box
		CareersPOM.clickAddcareers();	
		screenShot.captureScreenShot("38");		
		CareersPOM.ClickCareersandpromotions();	
		screenShot.captureScreenShot("39");
		CareersPOM.Clickpromotion();
		CareersPOM.ClickAddIcon();
		CareersPOM.SendPromotionName("QA for Tester");//Send to PromotionName
		CareersPOM.ClickPromotionSubmit();		
		screenShot.captureScreenShot("40");
		CareersPOM.clicksubscriber();
		CareersPOM.selectSession();
		CareersPOM.arrow();
		CareersPOM.ClickSessionbutton();
		screenShot.captureScreenShot("41");
	}
}

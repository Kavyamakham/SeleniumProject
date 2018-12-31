// TO verify whether application allows admin to generate report based on the student

package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ReportingPOM;
import com.training.pom.SessionscategoriesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_053_Reporting {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ReportingPOM ReportPOM;
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
		Thread.sleep(5000);
	}
	@AfterTest
	public void tearDown() throws Exception 
	{
		Thread.sleep(1000);
		driver.close();
	}
	@Test (priority=1)
	public void validLoginTest()
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		screenShot.captureScreenShot("15");
		loginPOM.clickLoginBtn(); 	
		screenShot.captureScreenShot("16");
	}

	@Test (priority=2)
	public void ReportingTest()
	{
		//Create object for ReportingPOM
		ReportingPOM ReportPOM = new  ReportingPOM(driver);	
		ReportPOM.clickReporting();
		Wait = properties.getProperty("implicitWait");
		ReportPOM.clickFollowedStudents();
		screenShot.captureScreenShot("17");	
		ReportPOM.keyword("sunil");//Enter student name in keyword
		ReportPOM.optionbutton();
		ReportPOM.clicksearchbutton();	
		screenShot.captureScreenShot("18");
		ReportPOM.ClickArrow(); 	
		screenShot.captureScreenShot("19");
		ReportPOM.Clickcoursearrow();
		screenShot.captureScreenShot("20");	
		ReportPOM.Clickquizicon();
		screenShot.captureScreenShot("21");
		ReportPOM.Clicknotification();
		ReportPOM.Clickcorrecttest();
		screenShot.captureScreenShot("22");
		ReportPOM.ClickCourseName();    
		screenShot.captureScreenShot("23");

	}
}

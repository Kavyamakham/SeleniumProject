package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CourseCategoriesPOM;
import com.training.pom.CreateCoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_024_Courses_Categories 
{
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private CourseCategoriesPOM coursecategoryPOM;
	
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
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.close();
	}
	@Test (priority=1)
	public void validLoginTest() throws InterruptedException 
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		Thread.sleep(5000);
		screenShot.captureScreenShot("16");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(5000);
		screenShot.captureScreenShot("17");
		Thread.sleep(5000);
	}

	@Test (priority=2)
	public void coursecategoriesTest() throws InterruptedException 
	{
		//Create object for CourseCategoriesPOM
		CourseCategoriesPOM  coursecategoryPOM= new CourseCategoriesPOM(driver);
		coursecategoryPOM.clickcoursecategories();
		Thread.sleep(5000);
		screenShot.captureScreenShot("18");
		//Click on Add category
		coursecategoryPOM.clickAddcategory();
		Thread.sleep(5000);
		screenShot.captureScreenShot("19");
		//Enter the text in code
		coursecategoryPOM.sendCode("BL");
		//Enter the Name in Category Name
		coursecategoryPOM.sendName("Blended Learning");
		coursecategoryPOM.clickRadiobutton();
		//click on category
		coursecategoryPOM.clickcategory();
		Thread.sleep(5000);
		screenShot.captureScreenShot("20");
		Thread.sleep(5000);
	}

}

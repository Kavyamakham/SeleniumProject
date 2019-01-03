package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddCoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_023_Add_users_course {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private AddCoursePOM addcoursePOM;

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
	@Test(priority =1)
	public void validLoginTest() throws InterruptedException
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		Thread.sleep(5000);
		screenShot.captureScreenShot("12");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(5000);
		screenShot.captureScreenShot("13");
	}

	@Test(priority =2)
	public void AddcourseTest() throws InterruptedException 
	{
		//Create object for AddCoursePOM
		AddCoursePOM addcoursePOM = new AddCoursePOM(driver);
		addcoursePOM.clickAddcourse();
		Thread.sleep(5000);
		screenShot.captureScreenShot("14");
		//Click on user list 
		addcoursePOM.userlist();
		//click on course list
		addcoursePOM.courselist();
		//click on add to course
		addcoursePOM.addtocourse();
		Thread.sleep(5000);
		screenShot.captureScreenShot("15");		
		Thread.sleep(5000);
	}
}

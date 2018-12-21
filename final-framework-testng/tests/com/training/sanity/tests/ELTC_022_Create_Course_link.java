package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CreateCoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_022_Create_Course_link 
{

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private CreateCoursePOM createcoursePOM;

	@BeforeClass
	public void setUpBeforeClass() throws IOException, InterruptedException {
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
		screenShot.captureScreenShot("7");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(5000);
		screenShot.captureScreenShot("8");
	}

	@Test (priority=2)
	public void createcourseTest() throws InterruptedException 
	{
		CreateCoursePOM createcoursePOM = new CreateCoursePOM(driver);
		createcoursePOM.clickcreatecourse();
		Thread.sleep(5000);
		screenShot.captureScreenShot("9");
		createcoursePOM.sendTitle("testing");
		createcoursePOM.sendCode("tes");
		createcoursePOM.clickbutton();
		createcoursePOM.clickbutton1();
		createcoursePOM.selectcategory();
		createcoursePOM.selectlanguage();
		Thread.sleep(5000);
		screenShot.captureScreenShot("10");
		createcoursePOM.clickcreateacourse();
		Thread.sleep(5000);
		screenShot.captureScreenShot("11");
		Thread.sleep(5000);
	}


}




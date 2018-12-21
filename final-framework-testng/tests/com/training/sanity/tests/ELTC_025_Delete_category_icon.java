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
import com.training.pom.DeleteIconPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_025_Delete_category_icon {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private DeleteIconPOM deleteiconPOM;

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
		loginPOM.clickLoginBtn(); 
		Thread.sleep(5000);
		screenShot.captureScreenShot("21");
	}

	@Test (priority=2)
	public void createcourseTest() throws InterruptedException 
	{
		DeleteIconPOM  deleteiconPOM= new DeleteIconPOM(driver);
		deleteiconPOM.clickcoursecategories();
		Thread.sleep(5000);
		screenShot.captureScreenShot("22");
		deleteiconPOM.clickdeleteIcon();
		Thread.sleep(5000);
		screenShot.captureScreenShot("23");
	}
}

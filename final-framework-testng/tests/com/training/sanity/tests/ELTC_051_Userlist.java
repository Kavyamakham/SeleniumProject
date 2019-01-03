//TO verify whether application allows admin to modify details of user

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
import com.training.pom.UserlistPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_051_Userlist {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private UserlistPOM userlistPOM;
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
		Wait = properties.getProperty("implicitWait");
		// open the browser 
		driver.get(baseUrl);
		Wait = properties.getProperty("implicitWait");
		
	}

	@AfterTest
	public void tearDown() throws Exception 
	{
		driver.close(); //closes the chrome driver
	}
	@Test (priority=1)
	public void validLoginTest() 
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		screenShot.captureScreenShot("1");
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot("2");
	}

	@Test (priority=2)
	public void userlistTest()
	{
		//Create object for UserlistPOM
		UserlistPOM userlistPOM = new  UserlistPOM(driver);	
		userlistPOM.clickuserlist();
		Wait = properties.getProperty("implicitWait");
		//give the user name in search box	
		userlistPOM.search("sunil"); 
		//perform clicking on search button
		userlistPOM.clicksearchbutton(); 
		screenShot.captureScreenShot("3");
		//Click on Edit ICon button
		userlistPOM.clickEditIcon();
		screenShot.captureScreenShot("4");
		//clearing and Give the Email id  
		userlistPOM.SendEmailid("sunil@gmail.com"); 
		//perform clicking on inactive
		userlistPOM.ClickAccount(); 	
		screenShot.captureScreenShot("5");	
		//perform click on save
		userlistPOM.Clicksave();
		screenShot.captureScreenShot("6");

	}
}

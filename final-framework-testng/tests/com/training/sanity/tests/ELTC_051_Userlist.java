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
		driver.close(); //closes the chrome driver
	}
	@Test (priority=1)
	public void validLoginTest() throws InterruptedException 
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");//
		Thread.sleep(5000);
		screenShot.captureScreenShot("1");
		loginPOM.clickLoginBtn();
		Thread.sleep(5000);
		screenShot.captureScreenShot("2");
	}

	@Test (priority=2)
	public void userlistTest() throws InterruptedException 
	{
		UserlistPOM userlistPOM = new  UserlistPOM(driver);	//object created for the class UserlistPOM
		userlistPOM.clickuserlist();
		userlistPOM.search("sunil"); //Enter the user name in search box as sunil
		userlistPOM.clicksearchbutton(); 
		Thread.sleep(5000);
		screenShot.captureScreenShot("3");
		userlistPOM.clickEditIcon();
		screenShot.captureScreenShot("4");
		userlistPOM.SendEmailid("sunil@gmail.com"); //Enter the Email id
		userlistPOM.ClickAccount(); 
		Thread.sleep(5000);
		screenShot.captureScreenShot("5");
		userlistPOM.Clicksave();
		Thread.sleep(5000);
		screenShot.captureScreenShot("6");
		
	}
}

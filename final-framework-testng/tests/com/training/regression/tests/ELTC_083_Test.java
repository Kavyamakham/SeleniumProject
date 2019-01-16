//To verify whether application displays error message upon entering invalid details while creating user
package com.training.regression.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.dataproviders.Dataproviders083;
import com.training.generics.ScreenShot;
import com.training.pom.ELTC_083_POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_083_Test {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ELTC_083_POM UserPOM;
	private String Wait;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);	
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
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

	@Test(priority=2 , dataProviderClass = Dataproviders083.class,dataProvider = "Sheet1")
	public void loginTest(String FirstName, String LastName,String email,String number, String login, String password , String Profile) throws InterruptedException, AWTException {

		Wait = properties.getProperty("implicitWait");
		System.out.println("Test");
		ELTC_083_POM UserPOM = new ELTC_083_POM(driver);
		//Click on Adminstration
		UserPOM.ClickAdminstration();
		//Click on Add user
		UserPOM.ClickAdduser();
		//User Enter the values in firstname textbox
		UserPOM.sendfirstname(FirstName);
		//user Entered the values in lastname textbox
		UserPOM.sendlastname(LastName);
		//user Entered the Email id in textbox
		UserPOM.sendEmail(email);
		//User Enter the phone number in textbox
		UserPOM.sendPhone(number);	
		//User Enter the login values in textbox
		UserPOM.sendlogin(login);
		//User Enter the password values in textbox
		UserPOM.sendpassword(password);		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//User Enter the profile values in textbox
		UserPOM.sendProfile(Profile);
		//Click on Add
		UserPOM.ClickAdd();
	}

}

//TO verify whether application allows admin to create multiple user with different roles & register them to the course
package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.dataproviders.UserDataProviders081;
import com.training.generics.ScreenShot;
import com.training.pom.ELTC_081_POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_081_Test {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ELTC_081_POM CoursePOM;
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
		//screenShot.captureScreenShot("15");
		loginPOM.clickLoginBtn(); 	
		//screenShot.captureScreenShot("16");
	}

	@Test(priority=2 , dataProvider = "ELTD_072", dataProviderClass = UserDataProviders081.class)
	public void loginTest(String FirstName, String LastName,String email,String number, String login, String password , String Profile) 
	{

		
		System.out.println("Test");
		Wait = properties.getProperty("implicitWait");
		ELTC_081_POM CoursePOM = new ELTC_081_POM(driver); //object created for ELTC_081_POM
		CoursePOM.ClickAdminstration();  //Click on Adminstration
		CoursePOM.ClickAdduser();        // Click on Add user
		CoursePOM.sendfirstname(FirstName);  //Enter the firstname in textbox  from excel
		CoursePOM.sendlastname(LastName);    //ENter the lastname in textbox from excel
		CoursePOM.sendEmail(email);       //Enter the Email id in textbox from excel
		CoursePOM.sendPhone(number);      //Enter the phone number in textbox from Excel
		CoursePOM.ClickEnterpassword();   //Enter the password in textbox from excel
		CoursePOM.sendlogin(login);       //Enter the login in textbox from excel
		CoursePOM.sendpassword(password);  //Enter the password in textbox from excel
		CoursePOM.sendProfile(Profile);    //Enter the profile in textbox from excel
		CoursePOM.ClickAdd();     //Click on Add
		CoursePOM.ClickAdminstration1();  //Click on Adminstration
		CoursePOM.ClickAddCourse();     //Click on Add  course
		CoursePOM.senduserlist(login);	 //select user  from user list
		CoursePOM.SelectCourse();	  // select course from the course list
		CoursePOM.ClickAddtoCourse();  //Click on Add to Course
	}	
}

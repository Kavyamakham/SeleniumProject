//TO verify whether application allows admin to generate report based on the student
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TeachersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_054_Teachers {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private TeachersPOM TeacherPOM;
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
		screenShot.captureScreenShot("24");
		loginPOM.clickLoginBtn(); 	
		screenShot.captureScreenShot("25");
	}

	@Test (priority=2)
	public void ReportingTest() 
	{
		//Create object for TeacherPOM
		TeachersPOM TeacherPOM = new  TeachersPOM(driver);	
		TeacherPOM.ClickReportingtab();
		Wait = properties.getProperty("implicitWait");
		TeacherPOM.Clickteacherlink();
		screenShot.captureScreenShot("26");
		TeacherPOM.sendKeyword("emily");//keyword name is Entered in text box
		TeacherPOM.Clicksearchbutton();	
		screenShot.captureScreenShot("27");
		TeacherPOM.Clickarrowlink();
		screenShot.captureScreenShot("28");
		TeacherPOM.Clickcourselink();
		screenShot.captureScreenShot("29");
		TeacherPOM.Clickquizicon(); 	
		screenShot.captureScreenShot("30");
		TeacherPOM.ClickEmail();
		TeacherPOM.ClickCorrecttest();	
		screenShot.captureScreenShot("31");
		TeacherPOM.ClickCourseName();	
		screenShot.captureScreenShot("32");
	}
}

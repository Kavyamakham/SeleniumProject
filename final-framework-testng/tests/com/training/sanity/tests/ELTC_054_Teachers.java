//TO verify whether application allows admin to generate report based on the teachers
package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
		Wait = properties.getProperty("implicitWait");
	}
	@AfterTest
	public void tearDown() throws Exception 
	{
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
	public void ReportingTest() throws AWTException, InterruptedException 
	{
		//Create object for TeacherPOM
		TeachersPOM TeacherPOM = new  TeachersPOM(driver);	
		TeacherPOM.ClickReportingtab();
		Robot robot = new Robot();
		Wait = properties.getProperty("implicitWait");
		TeacherPOM.Clickteacherlink();
		screenShot.captureScreenShot("26");
		TeacherPOM.sendKeyword("kavya");//keyword name is Entered in text box
		TeacherPOM.Clicksearchbutton();	
		screenShot.captureScreenShot("27");
		TeacherPOM.Clickarrowlink();
		screenShot.captureScreenShot("28");
		/*robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);*/
		TeacherPOM.Clickcourselink();
		screenShot.captureScreenShot("29");
		TeacherPOM.Clickquizicon(); 		
		screenShot.captureScreenShot("30");		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		TeacherPOM.ClickEmail();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		TeacherPOM.ClickCorrecttest();	
		screenShot.captureScreenShot("31");
		TeacherPOM.ClickCourseName();	
		screenShot.captureScreenShot("32");
	}
}

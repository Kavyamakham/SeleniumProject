//To verify whether application allows teacher to author a test for a course, student to take the test & teacher to generate report
package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ELTC_082_1_POM;
import com.training.pom.ELTC_082_2_POM;
import com.training.pom.ELTC_082_POM;
import com.training.pom.LoginPOM;
import com.training.pom.StudentLoginPOM;
import com.training.pom.TeacherloginPOM;
import com.training.pom.TeachersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.trianing.waits.WaitTypes;

public class ELTC_082 
{
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private TeacherloginPOM loginPOM;
	private ELTC_082_POM TeachPOM;
	private String Wait;
	private Robot robot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException, InterruptedException, AWTException 
	{
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new TeacherloginPOM(driver);		
		baseUrl = properties.getProperty("baseURL");
		Wait = properties.getProperty("implicitWait"); 
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	@AfterTest
	public void tearDown() throws Exception 
	{
		driver.close();
	}

	@Test(priority=1)
	public void LoginTest() 
	{
		loginPOM.sendusername("Kavya");
		loginPOM.sendpassword("kavya@123");
		//screenShot.captureScreenShot("33");
		loginPOM.Clicklogin();
		//screenShot.captureScreenShot("34");
	}
	@Test(priority=2)
	public void CreateTest() throws AWTException, InterruptedException
	{
		//object created for ELTC_082_POM
		ELTC_082_POM TeachPOM = new  ELTC_082_POM(driver);	//object created for ELTC_082
		//Click on course
		TeachPOM.ClickCourse();	
		TeachPOM.ClickICON();                //Click on Test icon
		TeachPOM.ClickNewTest();             //Click on New Test
		TeachPOM.sendTestname("online quiz"); //Entered credentials in Test name textbox
		Thread.sleep(2000);
		TeachPOM.ClickAdvance(); //Click on Advance Setting
		Thread.sleep(5000);
		TeachPOM.sendtestbox("quiz"); // Enter values in Give a context to the test
		TeachPOM.Clickradiobutton(); // Click on radio button on feedback section
		TeachPOM.ClickEnable();      //Click Checkbox on Enable 
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		TeachPOM.Clickdate();   //Click on date
		TeachPOM.Setdate();  // Set the time
		TeachPOM.SetTime();   // Set Time
		TeachPOM.ClickDone();  //Click done
		TeachPOM.sendPasspercentage("50"); //Enter the pass percentage in the percentage box
		Thread.sleep(5000);
		TeachPOM.Clickproceed();  //Click on proceed to Enter into other page
		TeachPOM.ClickMCICON();    // Click on Mulitple choice icon for question.No 1
		TeachPOM.sendQuestion1("which course your learning"); //Enter the question in textbox
		TeachPOM.firstoption("selenium");  //Enter the firstoption in frame textbox
		TeachPOM.secondoption("java");    //Enter the second option in frame textbox
		TeachPOM.Thirdoption("c");       //Enter the third option in frame textbox
		TeachPOM.Fouroption("c#");       //Enter the fourth option in frame textbox
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		TeachPOM.radiobutton1();       //Click on radio button
		TeachPOM.ClickTest();    // Click on test
		Thread.sleep(10000);
		TeachPOM.ClickMCICON2();   //Click on multiple choice icon for question 2
		TeachPOM.sendQuestion2("which language are you using in selenium");//Enter the question in textbox
		TeachPOM.firstoption1("java");  //Enter the firstoption in frame textbox
		TeachPOM.secondoption1("python");  //Enter the second option in frame textbox
		TeachPOM.Thirdoption1("c");     //Enter the third option in frame textbox
		TeachPOM.Fouroption1("c#");    // Enter the fourth option in frame textbox
		TeachPOM.selectradiobutton2();  //Click on radiobutton
		TeachPOM.ClickAddQuestion();    //Click on Add question 
		TeachPOM.ClickPreviewIcon();   //Click on Preview Icon
		TeachPOM.Clicklogout();
		TeachPOM.Clicklogout1();

	}

	@Test(priority=3)
	public void StudentTest() 
	{
		StudentLoginPOM StudentPOM = new StudentLoginPOM(driver);
		StudentPOM.sendUserName1("Manzoor12");
		StudentPOM.sendPassword1("manzoor");
		//screenShot.captureScreenShot("33");
		StudentPOM.clickLoginBtn();
		//screenShot.captureScreenShot("34");
	}

	@Test(priority=4)
	public void StudentReportTest() 
	{
		ELTC_082_1_POM ReportPOM = new ELTC_082_1_POM(driver);
		ReportPOM.ClickCatalog();
		ReportPOM.sendSearch("selenium112");  //Click on course
		ReportPOM.ClickSearch();           //Click on search 
		ReportPOM.ClickSubscriber();       //Click on subscriber
		ReportPOM.sendSearch("selenium112"); //Click on course
		ReportPOM.ClickSearch();      //Click on search
		ReportPOM.Clickselenium();     //Click on project
		ReportPOM.ClickTestIcon();     //Click on Test Icon
		ReportPOM.ClickQuiz();        //Click on quiz
		ReportPOM.ClickStart();       //Click on start
		ReportPOM.ClickAnswer();      //Click on Answer
		ReportPOM.Clicktest();       //Click on second test
		ReportPOM.ClickAnswer1();     //Click on Answer1
		ReportPOM.ClickEnd();        //Click EndTest
		ReportPOM.Clicklogout();     //Click logout
		ReportPOM.Clicklogout1();
	}
	@Test(priority=5)
	public void LoginTest1() 
	{
		loginPOM.sendusername("Kavya");
		loginPOM.sendpassword("kavya@123");
		//screenShot.captureScreenShot("33");
		loginPOM.Clicklogin();
		//screenShot.captureScreenShot("34");
	}
	@Test(priority=6)
	public void Test1()
	{
		ELTC_082_2_POM StudentReportPOM = new ELTC_082_2_POM(driver);
		StudentReportPOM.ClickReporting();      //Click  on Reporting
		StudentReportPOM.ClickStudents();       //Click on Student
		StudentReportPOM.sendKeyword("Manzoor1");  //Click on Paticular student
		StudentReportPOM.Clicksearch();     //Click on search
		StudentReportPOM.ClickIcon();		 //Click on ICon
		StudentReportPOM.ClickCourse();       
		StudentReportPOM.ClickQuiz();
		StudentReportPOM.Clicksend();         //Click on send Email
		StudentReportPOM.ClickcorrectTest();  //Click on Correct Test
		StudentReportPOM.ClickCourse1();  //Click on Course
	}

}

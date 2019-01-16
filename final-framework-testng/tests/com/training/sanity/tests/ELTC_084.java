//To verify whether application allows teacher to create course with project, student to comment on the task & teacher to generate the report
package com.training.sanity.tests;

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

import com.training.generics.ScreenShot;
import com.training.pom.ELTC_084_1_POM;
import com.training.pom.ELTC_084_2_POM;
import com.training.pom.ELTC_084_POM;
import com.training.pom.StudentLoginPOM;
import com.training.pom.TeacherloginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_084 
{
	private WebDriver driver;
	private String baseUrl;
	private TeacherloginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;	
	private String Wait;

	@BeforeClass
	public void setUpBeforeClass() throws IOException, InterruptedException 
	{
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new TeacherloginPOM(driver); 
		baseUrl = properties.getProperty("baseURL"); 
		screenShot = new ScreenShot(driver); 
		Wait = properties.getProperty("implicitWait");
		// open the browser 
		driver.get(baseUrl);
	}

	@AfterTest
	public void tearDown() throws Exception 
	{
		driver.close(); //closes the chrome driver
	}
	@Test(priority=1)
	public void LoginTest() 
	{
		loginPOM.sendusername("Kavya");
		loginPOM.sendpassword("kavya@123");		
		loginPOM.Clicklogin();
	}
	@Test(priority=2)
	public void CreateCourseTest() throws InterruptedException 
	{
		System.out.println("print");
		ELTC_084_POM CreatePOM = new ELTC_084_POM(driver);
		Wait = properties.getProperty("implicitWait");
		CreatePOM.ClickCourse();
		CreatePOM.sendCourseName("selenium112");//Enter the selenium course name into textbox
		CreatePOM.ClickAdvance();
		CreatePOM.ClickCategory();
		CreatePOM.sendcode("sel112");//Enter the code 
		CreatePOM.Clicklanguage();
		CreatePOM.Clickcreatecourse();
		CreatePOM.ClickIntroduct();
		Thread.sleep(2000);
		CreatePOM.textbox("this is an selenium course");//Enter the course name in text box
		CreatePOM.ClickSave();
		CreatePOM.ClickCourseDescription();
		CreatePOM.ClickDescription();		
		CreatePOM.sendtitle("selenium course for beginners"); //Enter the course name in text box
		CreatePOM.sendContent("selenium course for beginners");//Enter the Content in frame
		CreatePOM.ClickSavebutton();
		CreatePOM.Clickobjective();
		CreatePOM.sendTitlebox("selenium course for beginners");//Enter the course name in text box
		CreatePOM.sendContentbox("selenium course for beginners");//Enter the Content in frame
		CreatePOM.Clicksavebutton1();
		CreatePOM.ClickTopicsIcon();
		CreatePOM.sendTitle1("selenium course for beginners");//Enter the course name in text box
		CreatePOM.sendContent1("selenium course for beginners");//Enter the Content in frame
		CreatePOM.Clicksavebutton2();

	}
	@Test(priority=3)
	public void ProjectTest() throws AWTException 
	{
		System.out.println("test");
		ELTC_084_1_POM projectPOM = new ELTC_084_1_POM(driver);
		Wait = properties.getProperty("implicitWait");
		projectPOM.Clickcourselink();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		projectPOM.Clickproject();
		projectPOM.ClickProjectIcon();
		projectPOM.sendTitle("e learning");//Enter the project name 
		projectPOM.sendsubtitle("e learning project");//Enter the subtitle in textbox
		projectPOM.Clicksave();
		projectPOM.ClickProjectlink();
		projectPOM.ClickNewtask();
		projectPOM.sendTitle1("design");//Enter the Title name 
		projectPOM.ClickSave1();
		projectPOM.ClickRolesIcon();
		projectPOM.ClickNewRole();
		projectPOM.sendTitle2("developer");
		projectPOM.ClickSave2();
		projectPOM.ClickAssignRole();
		projectPOM.Clickuser();
		projectPOM.ClickValidate();
		projectPOM.Clicklogout();
		projectPOM.Clicklogout1();
	}

	@Test(priority=4)
	public void StudentTest() 
	{
		StudentLoginPOM StudentPOM = new StudentLoginPOM(driver);
		Wait = properties.getProperty("implicitWait");
		StudentPOM.sendUserName1("Manzoor12");
		StudentPOM.sendPassword1("manzoor");
		StudentPOM.clickLoginBtn();
	}
	@Test(priority=5)
	public void CourseTest() throws InterruptedException
	{    
		ELTC_084_2_POM TaskPOM = new ELTC_084_2_POM(driver);
		Wait = properties.getProperty("implicitWait");
		TaskPOM.ClickCatalog();
		TaskPOM.sendSearch("selenium112");
		Thread.sleep(2000);
		TaskPOM.ClickSearch();
		TaskPOM.ClickSubscriber();
		TaskPOM.Clicklogout();
		TaskPOM.Clicklogout1();
	}
	@Test(priority=6)
	public void LoginTest1() 
	{
		Wait = properties.getProperty("implicitWait");
		loginPOM.sendusername("Kavya");
		loginPOM.sendpassword("kavya@123");
		loginPOM.Clicklogin();
		loginPOM.ClickCourse();
		loginPOM.Clicklink();
		loginPOM.ClickUser();
		loginPOM.ClickCheck();
		loginPOM.ClickRegister();
		loginPOM.Clicklogout();
		loginPOM.Clicklogout1();
	}
	@Test(priority=7)
	public void StudentTest1() 
	{
		StudentLoginPOM StudentPOM = new StudentLoginPOM(driver);
		StudentPOM.sendUserName1("Manzoor12");
		StudentPOM.sendPassword1("manzoor");
		StudentPOM.clickLoginBtn();
	}

	@Test(priority=8)
	public void CourseTest1() throws InterruptedException
	{    
		ELTC_084_2_POM TaskPOM = new ELTC_084_2_POM(driver);
		System.out.println("Test1");
		Thread.sleep(2000);
		TaskPOM.ClickCatalog();
		TaskPOM.sendSearch("selenium112");
		TaskPOM.Clicksearch1();
		TaskPOM.Clickselenium();
		TaskPOM.ClickProject();
		TaskPOM.Clicklink();
		TaskPOM.ClickHome();
		TaskPOM.Clickdesign();
		TaskPOM.sendTitle("task status");
		TaskPOM.comment("done");
		TaskPOM.Clicksave1();
		TaskPOM.Clicklogout();
		TaskPOM.Clicklogout1();			
	}
	@Test(priority=9)
	public void LoginTest2() throws AWTException, InterruptedException 
	{
		Wait = properties.getProperty("implicitWait");
		loginPOM.sendusername("Kavya");
		loginPOM.sendpassword("kavya@123");
		loginPOM.Clicklogin();
		loginPOM.ClickCourse();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		loginPOM.ClickReport();
		Thread.sleep(2000);
		loginPOM.ClickStudent();
		loginPOM.Clicklogout();
		loginPOM.Clicklogout1();
	}
}



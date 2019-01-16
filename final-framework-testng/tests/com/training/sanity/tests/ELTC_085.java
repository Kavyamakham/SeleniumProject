//To verify whether registered user details for the course get stored in database
package com.training.sanity.tests;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.dataproviders.Dataproviders085;
import com.training.generics.ScreenShot;
import com.training.pom.ELTC_085_POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_085 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ELTC_085_POM AdduserPOM;
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
	@Test(priority = 2, dataProvider = "db-inputs", dataProviderClass = Dataproviders085.class)
	public void AdduserTest(String firstname,String lastname,String Emailid,String phone, String login,String Password,String Profile) throws InterruptedException {
		ELTC_085_POM AdduserPOM = new  ELTC_085_POM(driver);	
		Wait = properties.getProperty("implicitWait");
		AdduserPOM.ClickAdduser();
		//User enters text in firstname textbox
		AdduserPOM.sendfirstname("manzoor");
		// To Verify the firstname entered in application is same as in DB
		String Expected = AdduserPOM.getfirstname();
		String Actfirstname = firstname;
		Assert.assertEquals(Actfirstname, Expected);
		System.out.println("The firstname is " + Actfirstname + " " + Expected);
		//User enters text in lastname textbox
		AdduserPOM.sendlastname("mehadi");
		// To Verify the lastname entered in application is same as in DB
		String Explastname = AdduserPOM.getlastname();
		String Actlastname = lastname;
		Assert.assertEquals(Actlastname, Explastname);
		System.out.println("The lastname is " + Actlastname + " " + Explastname);
		//User enters text in Emaiid textbox
		AdduserPOM.sendEmailid("manzoor@gmail.com");
		// To Verify the Email entered in application is same as in DB
		String ExpEmailid = AdduserPOM.getEmailid();
		String ActEmailid = Emailid;
		Assert.assertEquals(ActEmailid, ExpEmailid);
		System.out.println("The Email is " + ActEmailid + " " + ExpEmailid);
		//User enters text in phone number textbox
		AdduserPOM.sendphone("9876543210");
		// To Verify the lastname entered in application is same as in DB
		String Expphone = AdduserPOM.getphone();
		String Actphone = phone;
		Assert.assertEquals(Actphone, Expphone);
		System.out.println("The phone is " + Actphone + " " + Expphone);
		AdduserPOM.sendlogin("manzoor");
		// To Verify the lastname entered in application is same as in DB
		String Explogin = AdduserPOM.getlogin();
		String Actlogin = login;
		Assert.assertEquals(Actlogin, Explogin);
		System.out.println("The login is " + Actlogin + " " + Explogin);
		AdduserPOM.Clickradiobutton();
		AdduserPOM.sendpassword("manzoor");
		// To Verify the lastname entered in application is same as in DB
		String ExpPassword = AdduserPOM.getPassword();
		String ActPassword = Password;
		Assert.assertEquals(ActPassword, ExpPassword);
		System.out.println("The Passowrd is " + ActPassword + " " + ExpPassword);
		////User enters text in profile textbox
		AdduserPOM.ClickProfile();
		Thread.sleep(5000);
		// To Verify the lastname entered in application is same as in DB
		String ExpProfile = AdduserPOM.getProfile();
		String ActProfile = Profile;
		assertTrue(ExpProfile.contains(ActProfile));
		System.out.println("The Profile is " + ActProfile + " " + ExpProfile);
		AdduserPOM.ClickAdd();
		AdduserPOM.ClickAdmin();
		AdduserPOM.Clickcourse();
		AdduserPOM.Clickuserlist();
		AdduserPOM.Clickcourselist();
		AdduserPOM.ClickAddtocourse();
		Thread.sleep(5000);
		
	}

}

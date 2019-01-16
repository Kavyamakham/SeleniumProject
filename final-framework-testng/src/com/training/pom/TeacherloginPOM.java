/**
 * 
 */
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author kavya
 *
 */
//To verify whether application allows teacher to author a test for a course, student to take the test & teacher to generate report
public class TeacherloginPOM {

	private WebDriver driver; 

	public TeacherloginPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	//Enter the username
	@FindBy(id="login")
	private WebElement username;
	//Enter the password
	@FindBy(id="password")
	private WebElement password;
	//click on loginbutton
	@FindBy(id="formLogin_submitAuth")
	private WebElement login;
	//Click on Course link
	@FindBy(xpath="//*[@id=\"page\"]/div/div[2]/div/div/div[2]/h4/a")
	private WebElement Course;
	//Click on project link
	@FindBy(linkText="e learning")
	private WebElement link; 
	//click on user management icon
	@FindBy(xpath="//*[@id=\"toolbar\"]/div/div/a[4]")
	private WebElement UserManagement;
	//click on checkbox beside the user
	@FindBy(name="user[]")
	private WebElement Checkbox;
	//click on register button
	@FindBy(linkText="Register")
	private WebElement Register;
	//Click on logout
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[2]/li[2]/a")
	private WebElement logout;
	//Click on logout1
	@FindBy(xpath="//*[@id=\"logout_button\"]")
	private WebElement logout1;
	//Click on Reporting icon
	@FindBy(xpath="//*[@id=\"course_tools\"]/div[8]/div[2]/div[2]/h4")
	private WebElement  Report;
	//click on >> icon in details section of particular student
	@FindBy(xpath="//*[contains(@title,'2rightarrow.png')]")
	private WebElement Student;
	//Method for Enter the username
	public void sendusername(String username)
	{
		this.username.clear();
		this.username.sendKeys(username);
	}
	//Method for Enter the password
	public void sendpassword(String password)
	{
		this.password.clear();
		this.password.sendKeys(password);
	}
	//Method for clicking login button
	public void Clicklogin()
	{
		this.login.click();
	}
	//Method for Click on Course link
	public void ClickCourse()
	{
		this.Course.click();
	}
    //Method for Click on project link
	public void Clicklink()
	{
		this.link.click();
	}
	//Method for click on user management icon
	public void ClickUser()
	{
		this.UserManagement.click();
	}
	//Method for click on checkbox beside the user
	public void ClickCheck()
	{
		this.Checkbox.click();
	}
	//Method for click on register button
	public void ClickRegister()
	{
		this.Register.click();
	}
    //Method for click on logout
	public void Clicklogout()
	{
		this.logout.click();
	}
	//Method for Click on logout1
	public void Clicklogout1()
	{
		this.logout1.click();
	}
	//Method for Click on Reporting icon
	public void ClickReport()
	{
		this.Report.click();
	}
	//Method for click on >> icon in details section of particular student
	public void ClickStudent()
	{
		this.Student.click();
	}
}

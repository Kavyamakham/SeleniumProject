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
//TO verify whether application allows admin to create multiple user with different roles & register them to the course
public class ELTC_081_POM 
{
	private WebDriver driver; 

	public ELTC_081_POM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//Click on Administration tab
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[1]/li[7]/a")
	private WebElement Adminstration;

	//Click on Add a user link
	@FindBy(xpath="//*[@id=\"tabs-1\"]/div/div[2]/div[2]/ul/li[2]/a")
	private WebElement Adduser;

	//Enter credential in First name textbox
	@FindBy(id="firstname")
	private WebElement FirstName;

	//Enter credential in Last name textbox
	@FindBy(xpath="//*[@id=\"lastname\"]") 
	private WebElement LastName;

	//Enter credential in e-mail textbox
	@FindBy(xpath="//*[@id=\"email\"]")
	private WebElement Email;

	//Enter credential in phone textbox
	@FindBy(id="phone")
	private WebElement PhoneNumber;

	//Enter credential in Login textbox
	@FindBy(id="username")
	private WebElement login;

	//Click on Enter password radio button
	@FindBy(name="password[password_auto]")
	private WebElement Enterpassword;  

	//Enter credential in password textbox
	@FindBy(name="password[password]")
	private WebElement Password;

	//Select credentials from profile list box
	@FindBy(id="status_select")
	private WebElement Profile;

	//Click on Add button
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[35]/div[1]/button[1]")
	private WebElement Add;

	//Click on Administration tab
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[1]/li[7]/a")
	private WebElement Adminstration1;

	//Click on Add users to course link
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div/div[2]/div[2]/ul/li[6]/a")
	private WebElement AddCourse;

	//Enter credential in Login textbox
	@FindBy(name="UserList[]")
	private WebElement userlist;
	
	//select course from the course list
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form[2]/table/tbody/tr[2]/td[3]/select/option[3]")
	private WebElement Courselist;
	
	//click on Add to the course button
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form[2]/table/tbody/tr[2]/td[2]/button")
	private WebElement AddtoCourse;


	//Method for Click on Administration tab
	public void ClickAdminstration()
	{
		this.Adminstration.click();
	}
	//Method for Click on Add a user link
	public void ClickAdduser()
	{
		this.Adduser.click();
	}
	//Method for Enter credential in First name textbox
	public void sendfirstname(String FirstName)
	{
		this.FirstName.sendKeys(FirstName);
	}
	//Method for Enter credential in Last name textbox
	public void sendlastname(String LastName)
	{
		this.LastName.sendKeys(LastName);
	}
	//Method for Enter credential in e-mail textbox
	public void sendEmail(String Email)
	{
		this.Email.sendKeys(Email);
	}
	//Method for Enter credential in phone textbox
	public void sendPhone(String number)
	{
		this.PhoneNumber.sendKeys(number);
	}
	//Method for Enter credential in Login textbox
	public void sendlogin(String login)
	{
		this.login.sendKeys(login);
	}
	//Method for Click on Enter password radio button
	public void ClickEnterpassword()
	{
		this.Enterpassword.click();
	}
	//Method for Enter credential in password textbox
	public void sendpassword(String Password)
	{
		this.Password.sendKeys(Password);
	}
	//Method for Select credentials from profile list box
	public void sendProfile(String Profile)
	{
		this.Profile.sendKeys(Profile);
	}
	//Method for Click on Add button
	public void ClickAdd()
	{
		this.Add.click();
	}
	//Method for Click on Administration tab
	public void ClickAdminstration1()
	{
		this.Adminstration1.click();
	}
	//Method for Click on Add users to course link
	public void ClickAddCourse()
	{
		this.AddCourse.click();
	}
	//Method for Enter credential in Login textbox
	public void senduserlist(String login)
	{
		this.userlist.sendKeys(login);
	}
	//Method for select course from the course list
	public void SelectCourse()
	{
		this.Courselist.click();
	}
	//Method for click on Add to the course button
	public void ClickAddtoCourse()
	{
		this.AddtoCourse.click();
	}

}

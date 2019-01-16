/**
 * 
 */
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author kavya
 *
 */
//To verify whether registered user details for the course get stored in database
public class ELTC_085_POM
{

	private WebDriver driver; 

	public ELTC_085_POM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//Click on Add a user link
	@FindBy(linkText="Add a user")
	private WebElement Adduser;
	//Enter credential in First name textbox
	@FindBy(id="firstname")
	private WebElement firstname;
	//Enter credential in Last name textbox
	@FindBy(id="lastname")
	private WebElement lastname;
	//Enter credential in e-mail textbox
	@FindBy(id="email")
	private WebElement Emailid;
	//Enter credential in phone textbox
	@FindBy(id="phone")
	private WebElement phone;
	// Enter credential in Login textbox
	@FindBy(id="username")
	private WebElement login;
	//Click on Enter password radio button
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[9]/div[1]/div[2]/label")
	private WebElement radiobutton;
	// Enter credential in password textbox
	@FindBy(id="password")
	private WebElement Password;
	//Select Valid credentials from profile list box
	@FindBy(id="status_select")
	private WebElement Profile;
	//Click on Add button
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[35]/div[1]/button[1]")
	private WebElement Add;
	//Click on Administration link
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[1]/li[7]/a")
	private WebElement Administration;
	//Click on Add users to course link
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div/div[2]/div[2]/ul/li[6]/a")
	private WebElement course;
	//select user from the user list
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form[2]/table/tbody/tr[2]/td[1]/select/option[45]")
	private WebElement userlist;
	//select course from the course list
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form[2]/table/tbody/tr[2]/td[3]/select/option[3]")
	private WebElement courselist;
	//click on Add to the course button
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form[2]/table/tbody/tr[2]/td[2]/button")
	private WebElement Addtocourse;
	//Method for Click on Add a user link
	public void ClickAdduser()
	{
		this.Adduser.click();
	}
	//Method for Enter credential in First name textbox 
	public void sendfirstname(String Name)
	{
		this.firstname.sendKeys(Name);
	}
	public String getfirstname() 
	{
		String expected = firstname.getAttribute("value");
		return expected;
	}
	//Method for Enter credential in Last name textbox
	public void sendlastname(String Name)
	{
		this.lastname.sendKeys(Name);
	}
	public String getlastname() 
	{
		String expected = lastname.getAttribute("value");
		return expected;
	}
	//Method for Enter credential in e-mail textbox
	public void sendEmailid(String email)
	{
		this.Emailid.sendKeys(email);
	}
	public String getEmailid() 
	{
		String expected = Emailid.getAttribute("value");
		return expected;
	}
	//Method for Enter credential in phone textbox
	public String getphone() 
	{
		String expected = phone.getAttribute("value");
		return expected;
	}
	public void sendphone(String number)
	{
		this.phone.sendKeys(number);
	}
	//Method for  Enter credential in Login textbox
	public String getlogin() 
	{
		String expected = login.getAttribute("value");
		return expected;
	}
	public void sendlogin(String user)
	{
		this.login.sendKeys(user);
	}
	//Method for Click on Enter password radio button
	public void Clickradiobutton()
	{
		this.radiobutton.click();
	}
	//Method for  Enter credential in password textbox
	public String getPassword() 
	{
		String expected = Password.getAttribute("value");
		return expected;
	}
	public void sendpassword(String password)
	{
		this.Password.sendKeys(password);
	}
	//Method for Select Valid credentials from profile list box
	public String getProfile() 
	{
		String expected = Profile.getText();
		return expected;
	}
	public void ClickProfile()
	{
		Select dropdown = new Select(Profile);
		dropdown.selectByIndex(0);
		
	}
	//Method for Click on Add button
	public void ClickAdd()
	{
		this.Add.click();
	}
	//Method for Click on Administration link
	public void ClickAdmin()
	{
		this.Administration.click();
	}
	//Method for Click on Add users to course link
	public void Clickcourse()
	{
		this.course.click();
	}
	//Method for select user from the user list
	public void Clickuserlist()
	{
		this.userlist.click();
	}
	//Method for select course from the course list
	public void Clickcourselist()
	{
		this.courselist.click();
	}
	//Method for click on Add to the course button
	public void ClickAddtocourse()
	{
		this.Addtocourse.click();
	}
}

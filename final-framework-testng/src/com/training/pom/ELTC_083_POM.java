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
//To verify whether application displays error message upon entering invalid details while creating user
public class ELTC_083_POM {
	
	
private WebDriver driver; 
	
	public ELTC_083_POM(WebDriver driver) 
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
    @FindBy(xpath="//*[@id=\"phone\"]")
    private WebElement PhoneNumber;
	
    //Enter credential in Login textbox
    @FindBy(xpath="//*[@id=\"username\"]")
    private WebElement login;
	
    //Click on Enter password radio button
    @FindBy(xpath="//*[@id=\"qf_767989\"]")
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

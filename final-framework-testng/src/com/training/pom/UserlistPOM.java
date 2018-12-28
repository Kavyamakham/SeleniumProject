package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserlistPOM {

	private WebDriver driver; 

	public UserlistPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
    //Click on User list link
	@FindBy(xpath="//*[@id=\"tabs-1\"]/div/div[2]/div[2]/ul/li[1]/a")
	private WebElement userlist;

    //Enter user name in search box
	@FindBy(name="keyword")
	private WebElement search;

	//Click on search button
	@FindBy(name="submit")
	private WebElement searchbutton;

   //click on Edit icon of the sunil user
	@FindBy(xpath="//*[contains(@href,'edit.php?user_id=20')]")
	private WebElement EditIcon;

	//Clear e-Mail box and enter the email id 
	@FindBy(id="user_edit_email")
	private WebElement Email;

	//Click on inactive radio button of Account section
	@FindBy(xpath="//*[@id=\"user_edit\"]/fieldset/div[20]/div[1]/div/label")
	private WebElement Account;
    
	//Click on Save button
	@FindBy(id="user_edit_submit")
	private WebElement save;

	//Method for clicking on User list link
	public void clickuserlist()
	{
		this.userlist.click();
	}
	//Method for Enter user name in search box
	public void search(String name)
	{
		this.search.sendKeys(name);
	}
	//Method for Clicking on search button
	public void clicksearchbutton()
	{
		this.searchbutton.click();
	}
	//Method for Clicking Edit icon of the sunil user
	public void clickEditIcon()
	{
		this.EditIcon.click();	
	}
	//Method for clearing and Enter the mail id
	public void SendEmailid(String email2) 
	{
		this.Email.clear();
		this.Email.sendKeys(email2);	
	}
	//Method for clicking inactive radio button of Account section
	public void ClickAccount()
	{
		this.Account.click();
	}
	//Method for clicking save
	public void Clicksave() 
	{
		this.save.click();
	}
}


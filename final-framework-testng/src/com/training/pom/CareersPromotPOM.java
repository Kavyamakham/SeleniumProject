//To verify whether application allows admin to create career, promotion & subscribe session to promotion
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPromotPOM 
{
	private WebDriver driver; 
	public CareersPromotPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
    //click on Careers and promotions link
	@FindBy(xpath="//*[@id=\"tabs-4\"]/div/div[2]/div[2]/ul/li[8]/a")
	private WebElement careersandpromotion;
	
	//click on careers icon
	@FindBy(xpath="//*[@id=\"toolbar-career\"]/div/div/a[2]")
	private WebElement careers;
	
	//click on Add icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/a[2]")
	private WebElement Add;
	
	//Enter credentials in Name textbox
	@FindBy(id="career_name")
	private WebElement Name;
	
	//Click on Add button
	@FindBy(id="career_submit")
	private WebElement Addcareers;
	
	//Click on Careers and promotions link
	@FindBy(xpath="//*[@id=\"page-breadcrumb\"]/ul/li[2]/a")
	private WebElement ClickCareersandpromotions;
	
	// Click on Promotions icon
	@FindBy(xpath="//*[@id=\"toolbar-career\"]/div/div/a[3]")
	private WebElement Clickpromotion;
	
	//Click on Add icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/a[2]")
	private WebElement AddIcon;
	
	// Enter credentials in Name textbox
	@FindBy(id="name")
	private WebElement PromotionName;
	
	//Click on Add button
	@FindBy(id="promotion_submit")
	private WebElement PromotionSubmit;
	
	//Click on subscribe sessions to promotion icon
	@FindBy(xpath="//*[@id=\"43\"]/td[4]/a[1]")
	private WebElement clicksubscriber;
	
	//Select session in Sessions not subscribed
	@FindBy(xpath="//*[@id=\"session_not_in_promotion\"]/option[4]")
	private WebElement Session;
	
	//click on -> arrow
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form/table/tbody/tr[3]/td[2]/button[1]")
	private WebElement arrow;
	
	//click on subscribe sessions in promotion window button
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form/table/tbody/tr[4]/td/button")
	private WebElement Sessionbutton;
	
	//Method for Clicking on Careers and promotions link
	public void clickcareersandpromotion()
	{
		this.careersandpromotion.click();
	}
	//Method for clicking on careers icon
    public void clickcareers()
    {
    	this.careers.click();
    }
    //Method for clicking on Add icon
    public void clickAdd()
    {
    	this.Add.click();
    }
    //Method for Enter credentials in Name textbox
    public void Name(String name)
    {
    	this.Name.sendKeys(name);
    }
    //Method for Clicking on Add button
    public void clickAddcareers()
    {
    	this.Addcareers.click();
    }
    //Method for Clicking on Careers and promotions link
    public void ClickCareersandpromotions()
    {
    	this.ClickCareersandpromotions.click();
    }
    //Method for Clicking on Promotions icon
    public void Clickpromotion()
    {
    	this.Clickpromotion.click();
    }
    //Method for Clicking on Add icon
    public void ClickAddIcon()
    {
    	this.AddIcon.click();
    }
    //Method for Enter credentials in Name text box
    public void SendPromotionName(String Name)
    {
    	this.PromotionName.sendKeys(Name);
    }
    //Method for Clicking on Add button
    public void ClickPromotionSubmit()
    {
    	this.PromotionSubmit.click();
    }
    //Method for Clicking on subscribe sessions to promotion icon
    public void clicksubscriber()
    {
    	this.clicksubscriber.click();
    }
    //Method for Select session in Sessions not subscribed
    public void selectSession()
    {
    	this.Session.click();
    }
    //Method for clicking on -> arrow
    public void arrow()
    {
    	this.arrow.click();
    }
    //Method for clicking on subscribe sessions in promotion window button
    public void ClickSessionbutton()
    {
    	this.Sessionbutton.click();
    }
}

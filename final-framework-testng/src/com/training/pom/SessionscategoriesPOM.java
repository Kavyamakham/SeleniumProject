//To verify whether application allows admin to create training session based on the created sessions categories list
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SessionscategoriesPOM 
{
	private WebDriver driver; 

	public SessionscategoriesPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	//Click on sessions categories list
	@FindBy(xpath="//*[@id=\"tabs-4\"]/div/div[2]/div[2]/ul/li[3]/a")
	private WebElement Sessioncategories;

	//Click on Add category icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div/div[1]/a[1]")
	private WebElement Addcategory;

	//Enter credential in Category name text box
	@FindBy(name="name")
	private WebElement Category;

	//Click on Add category button
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div/form/div[4]/div[1]/button")
	private WebElement AddtoCategory;

	//Click on  Training Session List link
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[3]/div/div[1]/a[2]")
	private WebElement trainingSession;

	//Click on Add a training session icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/a[1]")
	private WebElement AddtrainingSession;

	//Enter credentials in Session name text box
	@FindBy(name="name")
	private WebElement Sessionname;

	//Click on advanced settings button
	@FindBy(xpath="//*[@id=\"advanced_params\"]")
	private WebElement AdvanceSetting;

	//Select created in sessions category list box
	@FindBy(xpath="//*[@id=\"session_category\"]/option[9]")
	private WebElement Session;

	//Click on Next step button
	@FindBy(xpath="//*[@id=\"add_session_submit\"]")
	private WebElement NextStep;

	//Select course in course list window
	@FindBy(xpath="//*[@id=\"origin\"]/option[3]")
	private WebElement testing;

	//Click on > button
	@FindBy(xpath="//*[@id=\"multiple-add-session\"]/div[2]/div[2]/div[1]/button")
	private WebElement button;

	//Click on Next step button
	@FindBy(xpath="//*[@id=\"multiple-add-session\"]/div[2]/div[2]/div[4]/button")
	private WebElement Nextbutton;

	//Enter student name in Portal users list
	@FindBy(id="user_to_add")
	private WebElement portal;

	//click on the student name link
	@FindBy(xpath="//*[@id=\"ajax_list_users_single\"]/a")
	private WebElement studentlink;

	//click on Finish session creation button
	@FindBy(xpath="//*[@id=\"multiple-add-session\"]/div[2]/div/button")
	private WebElement Finishcreation;

	//Method for Clicking on sessions categories list
	public void clickSessioncategories()
	{
		this.Sessioncategories.click();		
	}
	//Method for Clicking on Add category icon
	public void clickAddcategory()
	{
		this.Addcategory.click();
	}
	//Method for Enter credential in Category name text box
	public void category(String name)
	{
		this.Category.sendKeys(name);
	}
	//Method for Clicking on Add category button
	public void clickAddtoCategory()
	{
		this.AddtoCategory.click();
	}
	//Method for Clicking on  Training Session List link
	public void clicktrainingSession()
	{
		this.trainingSession.click();
	}
	//Method for  Clicking on Add a training session icon
	public void clickAddtrainingSession()
	{
		this.AddtrainingSession.click();
	}
	//Method for Enter credentials in Session name text box
	public void Sessionname(String name)
	{
		this.Sessionname.sendKeys(name);
	}
	//Method for Clicking on advanced settings button
	public void clickAdvanceSetting() 
	{
		this.AdvanceSetting.click();
	}
	//Method for Select created in sessions category list box
	public void ClickSession()
	{
		this.Session.click();
	}
	//Method for Clicking on Next step button
	public void ClickNextStep()
	{
		this.NextStep.click();
	}
	//Method for Select course in course list window
	public void clicktesting()
	{
		this.testing.click();
	}
	//Method for Clicking on > button
	public void clickbutton()
	{
		this.button.click();
	}
	//Method for Clicking on Next step button
	public void clickNextbutton()
	{
		this.Nextbutton.click();
	}
	//Method for Enter student name in Portal users list
	public void portal(String name) 
	{
		this.portal.sendKeys(name);		
	}
	//Method for clicking on the student name link
	public void clickstudentlink()
	{
		this.studentlink.click();
	}
	//Method for clicking on Finish session creation button
	public void clickFinishcreation()
	{
		this.Finishcreation.click();
	}
}


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
//To verify whether application allows teacher to create course with project, student to comment on the task & teacher to generate the report
public class ELTC_084_1_POM 
{
	public ELTC_084_1_POM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Click on courselink name
	@FindBy(xpath="//*[@id=\"page-breadcrumb\"]/ul/li[1]/a")
	private WebElement courselink;
	//Click on Project icon
	@FindBy(linkText ="Projects")
	private WebElement project;
	//click on create a new project icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/a")
	private WebElement ProjectIcon;
	//Enter valid credential in title text box
	@FindBy(id="add_blog_blog_name")
	private WebElement Title;
	//enter valid credential in sub title text box
	@FindBy(id="add_blog_blog_subtitle")
	private WebElement SubTitle;
	//Click on save blog button
	@FindBy(name="submit")
	private WebElement Save;
	//click on project link
	@FindBy(linkText="e learning")
	private WebElement Projectlink;
	//click on new task icon
	@FindBy(xpath="//*[@id=\"toolbar\"]/div/div/a[2]")
	private WebElement Newtask;
	//enter valid credential in title text box
	@FindBy(id="add_post_title")
	private WebElement Title1;
	//click on save button
	@FindBy(id="add_post_save")
	private WebElement Save1;
	//click on Role management icon
	@FindBy(xpath="//*[@id=\"toolbar\"]/div/div/a[3]")
	private WebElement Roles;
	// click on add a new role icon
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/div/a[1]")
	private WebElement NewRole;
	//enter valid credential in title text box
	@FindBy(name="task_name")
	private WebElement Title2;
	// click on save button
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/form/div[5]/div/button")
	private WebElement Save2;
	//click on Assign role icon
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/div/a[2]")
	private WebElement AssignRole;
	//select student / teacher name in user list box
	@FindBy(xpath="//*[@id=\"assign_task\"]/fieldset/div[1]/div[1]/div/button")
	private WebElement user;
	//click on validate button
	@FindBy(id="assign_task_submit")
	private WebElement validate;
	//Click on logout
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[2]/li[2]/a/img")
	private WebElement logout;
	//Click on logout
	@FindBy(xpath="//*[@id=\"logout_button\"]")
	private WebElement logout1;

	//Method for click on Courselink name
	public void Clickcourselink()
	{
		this.courselink.click();
	}
	//Method for Click on Project icon
	public void Clickproject()
	{
		this.project.click();
	}
	//Method for click on create a new project icon
	public void ClickProjectIcon()
	{
		this.ProjectIcon.click();
	}
	//Method for enter valid credential in title text box
	public void sendTitle(String name)
	{
		this.Title.sendKeys(name);
	}
	//Method for enter valid credential in sub title text box
	public void sendsubtitle(String name)
	{
		this.SubTitle.sendKeys(name);
	}
	//Method for Click on save blog button
	public void Clicksave()
	{
		this.Save.click();
	}
	//Method for click on project link
	public void ClickProjectlink()
	{
		this.Projectlink.click();
	}
	//Method for click on new task icon
	public void ClickNewtask()
	{
		this.Newtask.click();
	}
	//Method for enter valid credential in title text box
	public void sendTitle1(String name)
	{
		this.Title1.sendKeys(name);
	}
	//Method for click on save button
	public void ClickSave1()
	{
		this.Save1.click();
	}	
	//Method for click on Role management icon
	public void ClickRolesIcon()
	{
		this.Roles.click();
	}
	//Method for  click on add a new role icon
	public void ClickNewRole()
	{
		this.NewRole.click();
	}
	//Method for enter valid credential in title text box
	public void sendTitle2(String name)
	{
		this.Title2.sendKeys(name);
	}
	//Method for  click on save button
	public void ClickSave2()
	{
		this.Save2.click();
	}
	//Method for click on Assign role icon
	public void ClickAssignRole()
	{
		this.AssignRole.click();
	}
	//Method for select student / teacher name in user list box
	public void Clickuser()
	{
		this.user.click();
	}
	//Method for click on validate button
	public void ClickValidate()
	{
		this.validate.click();
	}
	//Method for Click on logout
	public void Clicklogout()
	{
		this.logout.click();
	}
	//Method for Click on logout
	public void Clicklogout1()
	{
		this.logout1.click();
	}
}

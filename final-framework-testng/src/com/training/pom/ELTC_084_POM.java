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
public class ELTC_084_POM 
{
	private WebDriver driver; 

	public ELTC_084_POM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}	

	//Click on Create a Course link
	@FindBy(xpath="//*[@id=\"courseCollapse\"]/div/ul/li[1]/a")
	private WebElement CreateCourse;

	//Enter valid credential in Course name textbox
	@FindBy(id="title")
	private WebElement Coursename;

	//Click on Advanced Settings button
	@FindBy(id="advanced_params")
	private WebElement Advance;

	// Select Valid credentials from Category list box
	@FindBy(xpath="//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/button")
	private WebElement Category;

	//Enter valid credential in Course code textbox
	@FindBy(id="add_course_wanted_code")
	private WebElement Code;

	// Select Valid credentials from Language list box
	@FindBy(xpath="//*[@id=\"advanced_params_options\"]/div[3]/div[1]/div/button")
	private WebElement language;

	//Click on Create this course button
	@FindBy(id="add_course_submit")
	private WebElement Clickcourse;

	//click on Add an introduction icon
	@FindBy(xpath="//*[@id=\"course_tools\"]/div[1]/div/div[1]/a")
	private WebElement Introduction;

	//Enter valid credentials in textbox
	@FindBy(xpath="//*[@id=\"cke_1_contents\"]/iframe")
	private WebElement textbox;

	//Click on Save intro text
	@FindBy(xpath="//*[@id=\"introduction_text_intro_cmdUpdate\"]")
	private WebElement Save;

	//Click on Course description icon
	@FindBy(linkText="Course description")
	private WebElement Coursedescription;

	//Click on Description icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/a[1]")
	private WebElement description;

	// Enter valid credentials in Title textbox
	@FindBy(id="course_description_title")
	private WebElement Title;

	//Enter valid credentials in Content text box
	@FindBy(xpath="//*[@id=\"cke_1_contents\"]/iframe")
	private WebElement Content;

	//Click on Save button
	@FindBy(xpath="//*[@id=\"course_description_submit\"]")
	private WebElement savebutton;

	//Click on Objectives icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[3]/a[2]")
	private WebElement objectives;

	//Enter valid credentials in Title textbox
	@FindBy(id="course_description_title")
	private WebElement Entertitle;

	//Enter valid credentials in Content text box
	@FindBy(xpath="//*[@id=\"cke_1_contents\"]/iframe")
	private WebElement Contenttextbox;

	//Click on Save button
	@FindBy(id="course_description_submit")
	private WebElement Savebutton1;

	//Click on Topics icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[3]/a[3]")
	private WebElement Topic;

	//Enter valid credentials in Title textbox
	@FindBy(id="course_description_title")
	private WebElement Title1;

	//Enter valid credentials in Content text box
	@FindBy(xpath="//*[@id=\"cke_1_contents\"]/iframe")
	private WebElement Content1;

	//Click on Save button
	@FindBy(id="course_description_submit")
	private WebElement savebutton2;


	//Method for Click on Create a Course link
	public void ClickCourse()
	{
		this.CreateCourse.click();
	}
	//Method for Enter valid credential in Course name textbox
	public void sendCourseName(String name)
	{
		this.Coursename.sendKeys(name);
	}
	//Method for Click on Advanced Settings button
	public void ClickAdvance()
	{
		this.Advance.click();
	}
	//Method for  Select Valid credentials from Category list box
	public void ClickCategory()
	{
		this.Category.click();
	}
	//Method for Enter valid credential in Course code textbox
	public void sendcode(String code)
	{
		this.Code.sendKeys(code);
	}
	//Method for  Select Valid credentials from Language list box
	public void Clicklanguage()
	{
		this.language.click();
	}
	//Method for Click on Create this course button
	public void Clickcreatecourse()
	{
		this.Clickcourse.click();
	}
	//Method for click on Add an introduction icon
	public void ClickIntroduct()
	{
		this.Introduction.click();	
	}
	//Method for Enter valid credentials in textbox
	public void textbox(String body)
	{
		driver.switchTo().frame(textbox);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(body);
		driver.switchTo().defaultContent(); 

	}
	//Method for Click on Save intro text
	public void ClickSave()
	{
		this.Save.click();
	}
	//Method for Click on Course description icon
	public void ClickCourseDescription()
	{
		this.Coursedescription.click();
	}
	//Method for Click on Description icon
	public void ClickDescription()
	{
		this.description.click();
	}
	//Method for Enter valid credentials in Title textbox
	public void sendtitle(String name)
	{
		this.Title.sendKeys(name);
	}
	//Method for Enter valid credentials in Content text box
	public void sendContent(String body)
	{
		driver.switchTo().frame(Content);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(body);
		driver.switchTo().defaultContent(); 
	}
	//Method for Click on Save button
	public void ClickSavebutton()
	{
		this.savebutton.click();
	}
	//Method for Click on Objectives icon
	public void Clickobjective()
	{
		this.objectives.click();
	}
	//Method for Enter valid credentials in Title textbox
	public void sendTitlebox(String name)
	{
		this.Entertitle.sendKeys(name);
	}
	//Method for  Enter valid credentials in Content text box
	public void sendContentbox(String body)
	{
		driver.switchTo().frame(Contenttextbox);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(body);
		driver.switchTo().defaultContent(); 
	}
	//Method for Click on Save button
	public void Clicksavebutton1()
	{
		this.Savebutton1.click();
	}
	//Method for Click on Topics icon
	public void ClickTopicsIcon()
	{
		this.Topic.click();
	}
	//Method for Enter valid credentials in Title textbox
	public void sendTitle1(String name)
	{
		this.Title1.sendKeys(name);
	}
	//Method for Enter valid credentials in Content text box
	public void sendContent1(String body)
	{
		driver.switchTo().frame(Content1);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(body);
		driver.switchTo().defaultContent(); 

	}
	//Method for Click on Save button
	public void Clicksavebutton2()
	{
		this.savebutton2.click();
	}

}

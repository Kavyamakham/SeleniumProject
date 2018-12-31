//TO verify whether application allows admin to generate report based on the student
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeachersPOM 
{
	private WebDriver driver; 
	public TeachersPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}	
	//Click on reporting tab 
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[1]/li[4]/a")
	private WebElement Reporting;
	
    //Click on Followed teachers link
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[3]/table/tbody/tr[3]/td[1]/a")
	private WebElement teacherlink;

	//Enter student name in keyword textbox
	@FindBy(id="search_user_keyword")
	private WebElement Name;

	//click on search button
	@FindBy(id="search_user_submit")
	private WebElement search;
    
	//click on >> icon of the Manzoor
	@FindBy(xpath="//*[contains(@href,'myStudents.php?student=6')]")
	private WebElement arrowlink;
	
	//Click on >> icon of the course
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[4]/table/tbody/tr[1]/td[7]/a")
	private WebElement courselink;
	
	//click on quiz icon of the test section
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[4]/table/tbody/tr[2]/td[5]/a")
	private WebElement quizicon;
    
	//Click on Send Email checkbox
	@FindBy(name="send_notification")
	private WebElement SendEmail;
	
	//Click on correct test button
	@FindBy(id="myform_submit")
	private WebElement Correcttest;
	
	//Click on Course Name link
	@FindBy(xpath="//*[@id=\"page-breadcrumb\"]/ul/li[1]/a")
	private WebElement CourseName;
	
	//Method for clicking on reporting tab
	public void ClickReportingtab()
	{
		this.Reporting.click();
	}
	// Method for clicking on Followed teacher link
	public void Clickteacherlink()
	{
		this.teacherlink.click();
	}
	//Method for Enter student name in keyword textbox
	public void sendKeyword(String Name)
	{
		this.Name.sendKeys(Name);
	}
	//Method for Clicking on search
	public void Clicksearchbutton()
	{
		this.search.click();
	}
	//Method for clicking on >> icon of the emily
	public void Clickarrowlink()
	{
		this.arrowlink.click();
	}
	//Method for clicking on >> icon of the course
	public void Clickcourselink()
	{
		this.courselink.click();
	}
	//Method for clicking on quiz icon of the test section
   public void Clickquizicon()
   {
	   this.quizicon.click();
   }
   //Method for Clicking on Send Email checkbox
   public void ClickEmail()
   {
	   this.SendEmail.click();
   }
   //Method for clicking on correct test button
   public void ClickCorrecttest()
   {
	   this.Correcttest.click();
   }
   //Method for Clicking on Course Name link
   public void ClickCourseName()
   {
	   this.CourseName.click();
   }
}

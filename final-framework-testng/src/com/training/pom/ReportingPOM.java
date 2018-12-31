// TO verify whether application allows admin to generate report based on the student
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportingPOM 
{
	private WebDriver driver; 

	public ReportingPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//click on Reporting tab
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[1]/li[4]/a")
    private WebElement Reporting;
	
	//click on Followed students link
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[3]/table/tbody/tr[1]/td[1]/a")
	private WebElement FollowedStudents;
	
	//Enter student name in keyword textbox
	@FindBy(name="keyword")
	private WebElement keyword;
	
	//Click on inactive button
	@FindBy(xpath="//*[@id=\"search_user_active\"]/option[2]") 
	private WebElement option;
	
	//click on search button
	@FindBy(id="search_user_submit")
	private WebElement search;
	
	//click on >> icon of the student
	@FindBy(xpath="//*[contains(@href,'myStudents.php?student=20')]")
	private WebElement Arrow;
	
	//click on >> icon of the course
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[4]/table/tbody/tr/td[7]/a")
	private WebElement coursearrow;
	
	//click on quiz icon of the test section
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[4]/table/tbody/tr[1]/td[5]/a")
	private WebElement quizicon;
	
	//Click on Send Email checkbox
	@FindBy(name="send_notification")
	private WebElement Notification;
	
	//click on correct test button
	@FindBy(id="myform_submit")
	private WebElement correcttest;
	
	//Click on Course Name link
	@FindBy(xpath="//*[@id=\"page-breadcrumb\"]/ul/li[1]/a")
	private WebElement CourseName;
	
	//Method for clicking on Reporting tab
	public void clickReporting()
	{
		this.Reporting.click();
	}
	//Method for clicking on Followed students link
	public void clickFollowedStudents()
	{
		this.FollowedStudents.click();
	}
	//Method for Enter student name in keyword textbox
	public void keyword(String name)
	{
		this.keyword.sendKeys(name);
	}
	//method for Clicking on inactive button
	public void optionbutton()
	{
		this.option.click();
	}
	//Method for clicking on search button
	public void clicksearchbutton()
	{
		this.search.click();
	}
	//Method for clicking on >> icon of the student
	public void ClickArrow()
	{
		this.Arrow.click();
	}
	//Method for clicking on >> icon of the course
	public void Clickcoursearrow()
	{
		this.coursearrow.click();
	}
	//Method for clicking on quiz icon of the test section
	public void Clickquizicon()
	{
		this.quizicon.click();
	}
	//Method for Clicking on Send Email checkbox
	public void Clicknotification()
	{
		this.Notification.click();
	}
	//Method for clicking  on correct test button
	public void Clickcorrecttest()
	{
		this.correcttest.click();
	}
	//Method for Clicking on Course Name link
	public void ClickCourseName()
	{
		this.CourseName.click();
	}
	
}

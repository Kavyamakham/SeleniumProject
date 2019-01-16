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
//To verify whether application allows teacher to author a test for a course, student to take the test & teacher to generate report
public class ELTC_082_2_POM {


	private WebDriver driver; 

	public ELTC_082_2_POM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	//Click on Reporting icon
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[1]/li[4]/a")
	private WebElement Reporting;

	//Click on followed student
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[3]/table/tbody/tr[1]/td[1]/a")
	private WebElement Students;

	//Enter the Keyword in textbox
	@FindBy(name="keyword")
	private WebElement Keyword;

	//Click on search
	@FindBy(id="search_user_submit")
	private WebElement search;

	//click on >> icon in details section of particular student
	@FindBy(xpath="//*[contains(@href,'myStudents.php?student=184')]")
	private WebElement Icon;


	//click on >> icon in details section of particular course
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[4]/table/tbody/tr/td[7]/a")
	private WebElement Course;

	//click on quiz icon of the test section
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[4]/table/tbody/tr[20]/td[5]/a")
	private WebElement quiz;

	//Click on Send Email checkbox
	@FindBy(name="send_notification")
	private WebElement Email;

	//click on correct test button
	@FindBy(id="myform_submit")
	private WebElement CorrectTest;
	
	//Click on Course Name link
	@FindBy(xpath="//*[@id=\"page-breadcrumb\"]/ul/li[1]/a")
	private WebElement Course1;


	//Method for Click on Reporting icon
	public void ClickReporting()
	{
		this.Reporting.click();
	}
	//Method for Click on followed student
	public void ClickStudents()
	{
		this.Students.click();
	}
	//Metod for Enter the keyword in textbox
	public void sendKeyword(String name)
	{
		this.Keyword.sendKeys(name);
	}
	//Method for Click on search
	public void Clicksearch()
	{
		this.search.click();
	}
	//Method for click on >> icon in details section of particular Student
	public void ClickIcon()
	{
		this.Icon.click();
	}
	//Method for click on >> icon in details section of particular course
	public void ClickCourse()
	{
		this.Course.click();
	}
	//Method for click on quiz icon of the test section
	public void ClickQuiz()
	{
		this.quiz.click();
	}
	//Method for Click on Send Email checkbox
	public void Clicksend()
	{
		this.Email.click();
	}
	//Method for click on correct test button
	public void ClickcorrectTest()
	{
		this.CorrectTest.click();
	}
	//Method for Click on Course Name link
	public void ClickCourse1()
	{
		this.Course1.click();
	}
}

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
public class ELTC_082_1_POM
{
	private WebDriver driver; 

	public ELTC_082_1_POM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	//Click on the Catalog link
	@FindBy(xpath="//*[@id=\"courseCollapse\"]/div/ul/li[3]/a")
	private WebElement Catalog;
	//Enter course name to register in search textbox
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/input")
	private WebElement search;
	//click on search button
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/div/button")
	private WebElement ClickSearch;
	//Click on Subscribe button of the course to get registered
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[2]/div/div/div/div[2]/div[4]/div[2]/div/a")
	private WebElement Subscriber;
	//Click on Project Icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/h4/a")
	private WebElement selenium;
	//Click on Tests icon
	@FindBy(linkText="Tests")
	private WebElement TestIcon;
	//Click on Test name link
	@FindBy(xpath="//*[@id=\"exercise_list_134\"]/td[1]/a")
	private WebElement Quiz;
	//click on Start Test button
	@FindBy(linkText="Start test")
	private WebElement Start;
	// Click on Answer the questions
	@FindBy(id="choice-174-1")
	private WebElement Answer;
	//Click on Next question
	@FindBy(name="save_now")
	private WebElement Test;
	
	//Click on Answer the questions
	@FindBy(id="choice-175-1")
	private WebElement Answer1;
	
	//Click on End Test button
	@FindBy(name="save_now")
	private WebElement ENDTest;
	
	//Click on logout
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[2]/li[2]/a/img")
	private WebElement logout;
	
	//Click on logout1
	@FindBy(xpath="//*[@id=\"logout_button\"]")
	private WebElement logout1;
	
	//Method for click on Course catalog
	public void ClickCatalog()
	{
		this.Catalog.click();
	}
	//Method for Enter course name to register in search textbox
	public void sendSearch(String name)
	{
		this.search.sendKeys(name);
	}
	//Method for click on search button
	public void ClickSearch()
	{
		this.ClickSearch.click();
	}
	//Method for Click on Subscribe button of the course to get registered
	public void ClickSubscriber()
	{
		this.Subscriber.click();
	}
	//Method for Click on Project Icon
	public void Clickselenium()
	{
		this.selenium.click();
	}
   //Method for Click on Tests icon
	public void ClickTestIcon()
	{
		this.TestIcon.click();
	}
	//Methid for Click on Test name link
	public void ClickQuiz()
	{
		this.Quiz.click();
	}
	//Method for click on Start Test button
	public void ClickStart()
	{
		this.Start.click();
	}
	//Method for Answer the questions
	public void ClickAnswer()
	{
		this.Answer.click();
	}
	//Method for Click on Next question
	public void Clicktest()
	{
		this.Test.click();
	}
	//Method for Answer the questions
	public void ClickAnswer1()
	{
		this.Answer1.click();
	}
	//Method for Click on End Test button
	public void ClickEnd()
	{
		this.ENDTest.click();
	}
	//Method for click on logout
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

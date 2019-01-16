/**
 * 
 */
package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author kavya
 *
 */
//To verify whether application allows teacher to author a test for a course, student to take the test & teacher to generate report
public class ELTC_082_POM 
{	
	private WebDriver driver; 

	public ELTC_082_POM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	//Click on the course link
	@FindBy(xpath="//*[@id=\"page\"]/div/div[2]/div/div/div[2]/h4/a")
	private WebElement courselink;

	//Click on Test Icon
	@FindBy(xpath="//*[@id=\"course_tools\"]/div[4]/div[5]/div[2]/h4")
	private WebElement TestICON;

	//Click on Create a new test button
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/a[1]")
	private WebElement NewTest;

	//Enter credentials in Test name textbox
	@FindBy(name="exerciseTitle")
	private WebElement Testname;

	//Click on advanced setting button
	@FindBy(xpath="//*[@id=\"advanced_params\"]")
	private WebElement Advance;

	//Enter context to the test textbox
	@FindBy(xpath="//*[@id=\"cke_1_contents\"]/iframe")
	private WebElement testbox;

	//click on At end of test radio button in Feedback section
	@FindBy(name="exerciseFeedbackType")
	private WebElement radiobutton;

	//click on Enable start time checkbox
	@FindBy(name="activate_start_date_check")
	private WebElement Enable;

	//Click on Date
	@FindBy(xpath="//*[@id=\"start_date_div\"]/div/div[1]/div")
	private WebElement date;

	//Click to set date
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]")
	private WebElement SetDate;

	//Click to set time
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[2]")
	private WebElement SetTime;

	//Click on DOne
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[3]/button[2]")
	private WebElement Done;

	//Enter valid credentials in Pass percentage textbox
	@FindBy(xpath="//*[@id=\"pass_percentage\"]")
	private WebElement PassPercentage;

	//Click on proceed to Questions
	@FindBy(id="exercise_admin_submitExercise")
	private WebElement proceed;

	//Click on Multiple Choice icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[5]/ul/li[1]/div/a")
	private WebElement MCICON;

	//Enter valid credentials in Questions textbox
	@FindBy(id="question_admin_form_questionName")
	private WebElement Question1;

	//enter valid credentials in first option textbox
	@FindBy(xpath="//*[@id=\"cke_2_contents\"]/iframe")
	private WebElement firstoption;

	//enter valid credentials in second option textbox
	@FindBy(xpath="//*[@id=\"cke_4_contents\"]/iframe")
	private WebElement secondoption;

	//enter valid credentials in third option textbox
	@FindBy(xpath="//*[@id=\"cke_6_contents\"]/iframe")
	private WebElement Thirdoption;

	//enter valid credentials in forth option textbox
	@FindBy(xpath="//*[@id=\"cke_8_contents\"]/iframe")
	private WebElement Fouroption;

	//click first option radio button
	@FindBy(xpath="//*[@id=\"question_admin_form\"]/fieldset/table/tbody/tr[1]/td[2]")
	private WebElement radiobutton1;

	//click on Add this question to the test
	@FindBy(id="submit-question")
	private WebElement Addtotest;

	//Click on Multiple Choice icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[5]/ul/li[1]/div/a")
	private WebElement MCICON2;

	// Enter valid credentials in Questions textbox
	@FindBy(id="question_admin_form_questionName")
	private WebElement Question2;

	//enter valid credentials in first option textbox
	@FindBy(xpath="//*[@id=\"cke_2_contents\"]/iframe")
	private WebElement firstoption1;

	//enter valid credentials in second option textbox
	@FindBy(xpath="//*[@id=\"cke_4_contents\"]/iframe")
	private WebElement secondoption1;

	//enter valid credentials in third option textbox
	@FindBy(xpath="//*[@id=\"cke_6_contents\"]/iframe")
	private WebElement Thirdoption1;

	//enter valid credentials in forth option textbox
	@FindBy(xpath="//*[@id=\"cke_8_contents\"]/iframe")
	private WebElement Fouroption1;

	//click second option radio button
	@FindBy(xpath="//*[@id=\"question_admin_form\"]/fieldset/table/tbody/tr[1]/td[2]")
	private WebElement radiobutton2;

	//click on Add this question to the test
	@FindBy(xpath="//*[@id=\"submit-question\"]")
	private WebElement AddQuestion;

	//click on preview icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[3]/a[2]")
	private WebElement preview;

	//Click on logout
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[2]/li[2]/a/img")
	private WebElement logout;

	//Click on logout1
	@FindBy(xpath="//*[@id=\"logout_button\"]")
	private WebElement logout1;

	//Method for clicking courselink
	public void ClickCourse()
	{
		this.courselink.click();
	}
	//Method for click on Test ICON
	public void ClickICON()
	{
		this.TestICON.click();
	}
	//Method for Clicking on Create a new test button
	public void ClickNewTest()
	{
		this.NewTest.click();
	}
	//Method for Enter credentials in Test name textbox
	public void sendTestname(String Testname)
	{
		this.Testname.sendKeys(Testname);
	}
	//Method for Click on advanced setting button
	public void ClickAdvance()
	{
		this.Advance.click();
	}
	//Method for Enter context to the test textbox
	public void sendtestbox(String body) 
	{
		driver.switchTo().frame(testbox);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(body);
		driver.switchTo().defaultContent(); 	 
	}
	//Method for click on At end of test radio button in Feedback section
	public void Clickradiobutton()
	{
		this.radiobutton.click();
	}
	//Method for click on Enable start time checkbox
	public void ClickEnable()
	{
		this.Enable.click();
	}
	//Method for click on date
	public void Clickdate()
	{
		this.date.click();
	}
	//Method for click to set date
	public void Setdate()
	{
		this.SetDate.click();
	}
	//Method for click to set time
	public void SetTime()
	{
		this.SetTime.click();
	}
	//Method for click on Done
	public void ClickDone()
	{
		this.Done.click();
	}
	//Method 
	public void sendPasspercentage(String number)
	{
		this.PassPercentage.sendKeys(number);
	}
	//Method for clicking on proceed to questions
	public void Clickproceed()
	{
		this.proceed.click();
	}
	//Method for Clicking on Multiple Choice icon
	public void ClickMCICON()
	{
		this.MCICON.click();
	}
	//Method for Enter valid credentials in Questions textbox
	public void sendQuestion1(String Question1)
	{
		this.Question1.sendKeys(Question1);
	}
	//Method for enter valid credentials in first option textbox
	public void firstoption(String option)
	{
		driver.switchTo().frame(firstoption);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(option);
		driver.switchTo().defaultContent(); 
	}
	//Method for enter valid credentials in second option textbox
	public void secondoption(String secoption)
	{
		driver.switchTo().frame(secondoption);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(secoption);
		driver.switchTo().defaultContent(); 
	}
	//Method for enter valid credentials in third option textbox
	public void Thirdoption(String thiroption)
	{
		driver.switchTo().frame(Thirdoption);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(thiroption);
		driver.switchTo().defaultContent(); 
	}
	//Method for enter valid credentials in forth option textbox
	public void Fouroption(String four)
	{
		driver.switchTo().frame(Fouroption);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(four);
		driver.switchTo().defaultContent(); 

	}
	//Method for click first option radio button
	public void radiobutton1()
	{
		this.radiobutton1.click();
	}
	//Method for click on Add this question to the test
	public void ClickTest()
	{
		this.Addtotest.click();
	}
	//Method for Click on Multiple Choice icon
	public void ClickMCICON2()
	{
		this.MCICON2.click();
	}
	//Method for Enter valid credentials in Questions textbox
	public void sendQuestion2(String question)
	{
		this.Question2.sendKeys(question);
	}
	//Method for enter valid credentials in first option textbox
	public void firstoption1(String option1)
	{
		driver.switchTo().frame(firstoption1);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(option1);
		driver.switchTo().defaultContent(); 
	}
	//Method for enter valid credentials in second option textbox
	public void secondoption1(String option2)
	{
		driver.switchTo().frame(secondoption1);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(option2);
		driver.switchTo().defaultContent(); 
	}
	//Method for enter valid credentials in Third option textbox
	public void Thirdoption1(String option3)
	{
		driver.switchTo().frame(Thirdoption1);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(option3);
		driver.switchTo().defaultContent(); 
	}
	//Method for enter valid credentials in four option textbox
	public void Fouroption1(String option4)
	{
		driver.switchTo().frame(Fouroption1);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(option4);
		driver.switchTo().defaultContent(); 
	}
	//Method for click second option radio button
	public void selectradiobutton2()
	{
		this.radiobutton2.click();

	}
	//Method for click on Add this question to the test
	public void ClickAddQuestion()
	{
		this.AddQuestion.click();
	}
	//Method for click on preview icon
	public void ClickPreviewIcon()
	{
		this.preview.click();
	}
	//Method for Click on logout
	public void Clicklogout()
	{
		this.logout.click();
	}
	//Method for Click on logout1
	public void Clicklogout1()
	{
		this.logout1.click();
	}
}

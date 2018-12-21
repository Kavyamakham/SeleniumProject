package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCoursePOM {
	
private WebDriver driver; 
	
	public CreateCoursePOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	// click on Create a Course
	@FindBy(linkText = "Create a course")
	private WebElement createcourse;
	
	//Enter the value for Title
	@FindBy(xpath="//*[@id=\"update_course_title\"]")
	private WebElement Title;
	
	//Enter the value for code
	@FindBy(xpath="//*[@id=\"visual_code\"]")
	private WebElement Code;
	
	//Select Manzoor from  teachers drop down
	@FindBy(xpath="//*[@id=\"course_teachers\"]/option[3]")
	private WebElement button;
	
	
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[4]/div[1]/div")
	private WebElement button1;
	
	//select category from the drop down
	@FindBy(xpath="//*[@id=\"update_course_category_code\"]/option[4]")
	private WebElement category;
	
	//Select language from the dropdown
	@FindBy(xpath="//*[@id=\"update_course_course_language\"]/option[6]")
	private WebElement language;
	
	//Click on submit
	@FindBy(name="submit")
	private WebElement createacourse;
	
	//Method to click Create a course
	public void clickcreatecourse() 
	{
		this.createcourse.click();
	}

	//Method to send title
	public void sendTitle(String Title) 
	{
		this.Title.sendKeys(Title);
	}
	
	//Method to send code
	public void sendCode(String Code) 
	{
		this.Code.sendKeys(Code);
	}
	
	//Method to select teacher from drop down
	public void clickbutton()
		{
		this.button.click();
	}
	
	public void clickbutton1() 
	{
		this.button1.click();
	}
	
	//Method to select category from drop down
	public void selectcategory()
	{
	    this.category.click();	
	}
	
	//Method to select language from drop down
	public void selectlanguage()
	{
		this.language.click();
	}
	
	//Method to submit Crate a Course
	public void clickcreateacourse()
	{
		this.createacourse.click();
	}
}

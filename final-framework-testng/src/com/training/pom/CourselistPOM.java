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
public class CourselistPOM 
{
	public WebDriver driver;
	public CourselistPOM(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	//click on course list
	@FindBy(linkText="Course list")
	private WebElement courselist;

	//click on select all
	@FindBy(xpath="//*[@id=\"form_courses_id\"]/table[2]/tbody/tr/td[1]/div/div[1]/a[1]")
	private WebElement selectall;

	//click on details
	@FindBy(xpath="//*[@id=\"form_courses_id\"]/table[2]/tbody/tr/td[1]/div/div[2]/button[2]")
	private WebElement details;

	// click on delete all course
	@FindBy(xpath="//*[@id=\"form_courses_id\"]/table[2]/tbody/tr/td[1]/div/div[2]/ul/li/a")
	private WebElement delete;

	//Method to click on course list
	public void clickcourselist()
	{
		this.courselist.click();
	}
	
	//Method to click on select all for selecting course
	public void clickselectall()
	{
		this.selectall.click();
	}
	
	//Method to click on details
	public void clickdetails()
	{
		this.details.click();
	}
	
	//Method to click on delete all course
	public void clickdelete()
	{
		this.delete.click();
	}
}

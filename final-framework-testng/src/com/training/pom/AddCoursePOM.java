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
public class AddCoursePOM {
	
private WebDriver driver; 
	
	public AddCoursePOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//click on Add course
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div/div[2]/div[2]/ul/li[6]/a")
	private WebElement Addcourse;
	
	//select Manzoor from the user list
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form[2]/table/tbody/tr[2]/td[1]/select/option[5]")
	private WebElement userlist;
	
	//Select Testing from the course list
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form[2]/table/tbody/tr[2]/td[3]/select/option[4]")
	private WebElement courselist;
	
	//click on add to a course
	@FindBy(xpath = "//*[@id=\"content-section\"]/div/form[2]/table/tbody/tr[2]/td[2]/button")
	private WebElement addtocourse;
	
	//method for Add course
	public void clickAddcourse()
	{
		this.Addcourse.click();
	}
	//Method to select from user list
	public void userlist()
	{
		this.userlist.click();
	}
	//Method to select from course list
	public void courselist()
	{
		this.courselist.click();
	}
	//Method to click on add to a course
	public void addtocourse()
	{
		this.addtocourse.click();
	}
}

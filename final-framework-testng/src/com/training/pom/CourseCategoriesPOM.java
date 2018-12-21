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
public class CourseCategoriesPOM {

	private WebDriver driver; 

	public CourseCategoriesPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	//click on course categories
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div/div[2]/div[2]/ul/li[5]/a")
	private WebElement coursecategories;

	//click on Add category
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/a")
	private WebElement Addcategory;

	//send category code 
	@FindBy(name="code")
	private WebElement Code;
	
	//send category name
	@FindBy(name="name")
	private WebElement Name;
	
	//click on yes Radio button 
	@FindBy(xpath="//*[@id=\"course_category\"]/fieldset/div[3]/div[1]/div[1]/label")
	private WebElement Radiobutton;

	//Click on Add to category
	@FindBy(name="submit")
	private WebElement category;
	
	//Method to click on course categories
	public void clickcoursecategories()
	{
        this.coursecategories.click();
	}
	
	//Method to click on Add category
	public void clickAddcategory()
	{
		this.Addcategory.click();
	}
	
	//Method to send category code
	public void sendCode(String Code)
	{
		this.Code.sendKeys(Code);
	}
	
	//Method to send category name
	public void sendName(String Name)
	{
		this.Name.sendKeys(Name);
	}
	
	//Method to select yes Radio button
	public void clickRadiobutton() 
	{
		this.Radiobutton.click();
	}
	
	//Method to click Add to category
	public void clickcategory()
	{
		this.category.click();
	}
}
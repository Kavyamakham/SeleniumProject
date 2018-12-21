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
public class DeleteIconPOM {
	
	private WebDriver driver; 

	public DeleteIconPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
  
	//click on course categories
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div/div[2]/div[2]/ul/li[5]/a")
	private WebElement coursecategories;
	
	
	//click on delete icon
	@FindBy(xpath="//*[@id=\"content-section\"]/div/table/tbody/tr[6]/td[4]/a[3]")
	private WebElement deleteIcon;
	
	//Method to click courser categories
	public void clickcoursecategories()
	{
		this.coursecategories.click();
	}
	
	//Method to click on delete icon for Blended Learning
	public void clickdeleteIcon()
	{
		this.deleteIcon.click();
	}
}

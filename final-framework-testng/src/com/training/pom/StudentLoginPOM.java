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
//To verify whether application allows teacher to create course with project, student to comment on the task & teacher to generate the report
public class StudentLoginPOM {
	
private WebDriver driver; 
	
	public StudentLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id=\"page\"]/div/div[2]/div/div/div[2]/h4/a")
	private WebElement Course;
	
	@FindBy(linkText="e learning")
	private WebElement link; 
	
	public void sendUserName1(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword1(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	//
	public void ClickCourse()
	{
		this.Course.click();
	}
    //
	public void Clicklink()
	{
		this.link.click();
	}
}

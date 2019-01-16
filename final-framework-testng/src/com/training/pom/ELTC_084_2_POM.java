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
public class ELTC_084_2_POM 
{
	private WebDriver driver; 

	public ELTC_084_2_POM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Click on the Catalog link
	@FindBy(xpath="//*[@id=\"courseCollapse\"]/div/ul/li[3]/a/img")
	private WebElement Catalog;
    // Enter course name to register in search textbox
	@FindBy(name="search_term")
	private WebElement search;
	// click on search button
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/div/button")
	private WebElement ClickSearch;
	//Click on Subscribe button of the course to get registered
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[2]/div/div/div/div[2]/div[4]/div[2]/div/a")
	private WebElement Subscriber;
	//Enter course name to register in search textbox
	@FindBy(name="search_term")
	private WebElement selenium;
	// click on search button
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/div/button")
	private WebElement Search1;	
	//Click on the icon named as the project name
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/h4/a")
	private WebElement projectlink;
	// click on the name of the task assigned in My Task section
	@FindBy(linkText="e learning")
	private WebElement elearninglink;
	//click on Home icon
	@FindBy(xpath="//*[@id=\"toolbar\"]/div/div/a/img")
	private WebElement Home;
	// click on the link of task
	@FindBy(linkText="design")
	private WebElement test1;
	//Click on logout
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[2]/li[2]/a")
	private WebElement logout;
	//Click on logout1
	@FindBy(xpath="//*[@id=\"logout_button\"]")
	private WebElement logout1;
	// enter valid credential in title text box of Add a new comment
	@FindBy(id="add_post_title")
	private WebElement Title;
	// enter valid credential in description text box of Add a new comment
	@FindBy(xpath="//*[@id=\"cke_1_contents\"]/iframe")
	private WebElement comment;
	//Click on save button
	@FindBy(id="add_post_save")
	private WebElement save1;
	//Method for Clicking on the Catalog link
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
	//Method for Enter course name to register in search textbox
	public void Clickselenium()
	{
		this.selenium.click();
	}
	//Method for click on search button
	public void Clicksearch1()
	{
		this.Search1.click();
	}
	//Method for Click on the icon named as the project name
	public void ClickProject()
	{
		this.projectlink.click();
	}
	//Method for click on the name of the task assigned in My Task section
	public void Clicklink()
	{
		this.elearninglink.click();
	}
	//Method for Click on home
	public void ClickHome()
	{
		this.Home.click();
	}
	//Method for click on the link of task
	public void Clickdesign()
	{
		this.test1.click();
	}
	//Method for Click on logout
	public void Clicklogout()
	{
		this.logout.click();
	}
	//Method for Clicking on logout1
	public void Clicklogout1()
	{
		this.logout1.click();
	}
	//Method for enter valid credential in title text box of Add a new comment
	public void sendTitle(String name)
	{
		this.Title.sendKeys(name);
	}
	//Method for enter valid credential in description text box of Add a new comment
	public void comment(String body)
	{
		driver.switchTo().frame(comment);
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys(body);//enter body
		driver.switchTo().defaultContent(); 
	}
	//Method for Click on save button
	public void Clicksave1()
	{
		this.save1.click();
	}

}

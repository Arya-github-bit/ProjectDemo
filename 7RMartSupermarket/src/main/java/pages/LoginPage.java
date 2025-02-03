package pages;

import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy( xpath ="//input[@placeholder='Username']")WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']") WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy(xpath = "//div[@class='inner']//child::p[text ()='Dashboard']")WebElement dashBoardTile;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']") WebElement alert;

	
	public void enterUseNameonUserNameField(String userName)
	{
		userNameField.sendKeys(userName);
	}
	public void enterPasswordOnPasswordField(String password)
	{
		passwordField.sendKeys(password);
	}
	public void clickOnSigninButton()
	{
		signInButton.click();
	}
	public void whetherUserisLoggedInSuccessfully()
	{
	 boolean dashBoardTileDisplay =dashBoardTile.isDisplayed();
	 assertTrue(dashBoardTileDisplay, "User is not able to login successfully");
	}
	public void whethetUserIsNotAbleToLoginSuccessfully()
	{
		boolean isAlertDisplayed = alert.isDisplayed();
		assertTrue(isAlertDisplayed, "User is able to login successfully");
	}
	
	
	

	
}

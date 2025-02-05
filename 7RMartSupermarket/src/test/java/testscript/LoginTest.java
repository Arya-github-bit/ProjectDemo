package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	@Test(description = "Verify Whether User is able to Login Successfully with Valid Username and Valid Password")
	public void verifyWhetherUserIsAbleLoginSuccessfullywithValidUsernameandValidPassword()
	{
		String userName = "admin";
		String Password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUseNameonUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnSigninButton();
		boolean isNavigatedToDashboard = loginpage.whetherDashboardTileIsDisplayed();
		assertTrue(isNavigatedToDashboard, "User is not able to login successfully with valid username and valid password");
	}
	@Test(description = " Verify Whether User  is not able to Login successfully  with Valid Username and Invalid  Password")
	public void verifyWhetherUserisNotAbleToLoginSuccessfullywithValidUsernameAndInvalidPassword()
	{
		String userName = "admin";
		String Password = "admin876";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUseNameonUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnSigninButton();
		boolean isNavigatedToDashboard= loginpage.whetherAlertIsDisplayed();
		assertTrue(isNavigatedToDashboard, "User is able to login successfully with valid username and invalid password");
	}
	@Test(description = "Verify Whether User  is not able to Login successfully  with Invalid Username and Valid  Password")
	public void verifyWhetherUserisNotAbleToLoginSuccessfullywithInvalidUsernameAndValidPassword()
	{
		String userName = "admin876";
		String Password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUseNameonUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnSigninButton();
		boolean isNavigatedToDashboard= loginpage.whetherAlertIsDisplayed();
		assertTrue(isNavigatedToDashboard, "User is able to login successfully  with invalid username and valid password");
	}
	@Test(description = "Verify Whether  User is not able to Login successfully  with Invalid Username and Invalid Password")
	public void verifyWhetherUserisNotAbleToLoginSuccessfullywithInvalidUsernameAndInvalidPassword()
	{
		String userName = "admin876";
		String Password = "admin876";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUseNameonUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnSigninButton();
		boolean isNavigatedToDashboard= loginpage.whetherAlertIsDisplayed();
		assertTrue(isNavigatedToDashboard, "User is able to login successfully with invalid username and invalid password");
	}

}

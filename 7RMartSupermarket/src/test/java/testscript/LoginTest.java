package testscript;

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
		loginpage.whetherUserisLoggedInSuccessfully();
}
	@Test(description = " Verify User not is able to Login successfully  with Valid Username and Invalid  Password")
	public void verifyWhetherUserisNotAbleToLoginSuccessfullywithValidUsernameAndInvalidPassword()
	{
		String userName = "admin";
		String Password = "admin876";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUseNameonUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnSigninButton();
		loginpage.whethetUserIsNotAbleToLoginSuccessfully();
	}
	@Test(description = "Verify User not is able to Login successfully  with Invalid Username and Valid  Password")
	public void verifyWhetherUserisNotAbleToLoginSuccessfullywithInvalidUsernameAndValidPassword()
	{
		String userName = "admin876";
		String Password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUseNameonUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnSigninButton();
		loginpage.whethetUserIsNotAbleToLoginSuccessfully();
	}
	@Test(description = "Verify User not is able to Login successfully  with Invalid Username and Invalid Password")
	public void verifyWhetherUserisNotAbleToLoginSuccessfullywithInvalidUsernameAndInvalidPassword()
	{
		String userName = "admin876";
		String Password = "admin876";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUseNameonUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnSigninButton();
		loginpage.whethetUserIsNotAbleToLoginSuccessfully();
	}

}

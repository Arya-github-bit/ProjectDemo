package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base {
		
		@Test(description = " Verify User is able to Login successfully  with Valid Username and Valid  Password")
		public void verifyWhetherUserisAbleToLoginSuccessfullywithValidUsernameandVallidPassword()
		{
			String userNameText ="admin";
		    String passwordText = "admin";
			WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			userName.sendKeys(userNameText);
			WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			password.sendKeys(passwordText);
			WebElement signIn = driver.findElement(By.xpath("//button[@type='submit']"));
			signIn.click();
			WebElement dashBoardTile = driver.findElement(By.xpath("//div[@class='inner']//child::p[text ()='Dashboard']"));
			boolean dashBoardTileDisplay = dashBoardTile.isDisplayed();
			assertTrue(dashBoardTileDisplay, "User is not able to Login successfully");
			
		}
		
		@Test(description = " Verify User not is able to Login successfully  with Valid Username and Invalid  Password")
		public void verifyWhetherUserisNotAbleToLoginSuccessfullywithValidUsernameAndInvalidPassword()
		{
			
			String userNameText ="admin";
		    String passwordText = "admin876";
			WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			userName.sendKeys(userNameText);
			WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			password.sendKeys(passwordText);
			WebElement signIn = driver.findElement(By.xpath("//button[@type='submit']"));
			signIn.click();
			WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			boolean alertDisplay = alert.isDisplayed();
			assertTrue(alertDisplay, "User is able to Login Successfully");
		}
		
		@Test(description = "Verify User not is able to Login successfully  with Invalid Username and Valid  Password")
		public void verifyWhetherUserisNotAbleToLoginSuccessfullywithInvalidUsernameAndValidPassword()
		{
			String userNameText ="test";
		    String passwordText = "admin";
			WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			userName.sendKeys(userNameText);
			WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			password.sendKeys(passwordText);
			WebElement signIn = driver.findElement(By.xpath("//button[@type='submit']"));
			signIn.click();
			WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			boolean alertDisplay = alert.isDisplayed();
			assertTrue(alertDisplay, "User is able to Login Successfully");
		}
		
		@Test(description = "Verify User not is able to Login successfully  with Invalid Username and Invalid Password")
		public void verifyWhetherUserisNotAbleToLoginSuccessfullywithInvalidUsernameAndInvalidPassword()
		{ 
			String userNameText ="test";
		    String passwordText = "admin876";
			WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			userName.sendKeys(userNameText);
			WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			password.sendKeys(passwordText);
			WebElement signIn = driver.findElement(By.xpath("//button[@type='submit']"));
			signIn.click();
			WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			boolean alertDisplay = alert.isDisplayed();
			assertTrue(alertDisplay, "User is able to Login Successfully");
		}


}

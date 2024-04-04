package com.ninja.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ninja.qa.base.Base;
import com.ninja.qa.pages.AccountPage;
import com.ninja.qa.pages.HomePage;
import com.ninja.qa.pages.LoginPage;
import com.ninja.qa.utils.Utilities;

public class LoginTest extends Base  {
	
	LoginPage loginPage;
	
	public LoginTest() {
		super();
	}
 	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
		
		HomePage homePage = new HomePage(driver);
		loginPage = homePage.navigateToLoginPage();
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1,dataProvider="validCredentialsSupplier")
	public void verifyLoginWithValidCredentials(String email,String password)	{
		
//		loginPage.enterEmailAddress(email);
//		loginPage.enterPassword(password);
//		loginPage.clickOnLoginButton();
		
		
		
		loginPage.login(email, password);
		AccountPage accountPage = new AccountPage(driver);
		Assert.assertTrue(accountPage.getDisplayedStatusOfEditYourInformaationOption(), (dataProp.getProperty("accountSuccessMessage")));
		
	}
	
	@DataProvider(name="validCredentialsSupplier")
	public 	Object[][] supplyTestData() {
		
		Object[][] data = Utilities.getTestDataFromExcel("Login");
		return data;
	}
	
	@Test(priority=2)
	public void verifyLoginWithInvalidCredentials()	{
		
		loginPage.login(Utilities.generateEmailWithTimeStamp(), dataProp.getProperty("invalidPassword"));
		
//		loginPage.enterEmailAddress(Utilities.generateEmailWithTimeStamp());
//		loginPage.enterPassword(dataProp.getProperty("invalidPassword"));
//		loginPage.clickOnLoginButton();
		
		Assert.assertTrue(loginPage.retriveEmailPasswordNotMatchingWarningMessage(),(dataProp.getProperty("warningWithoutCredential")));
	}
	
	
	@Test(priority=3)
	public void verifyLoginWithInvalidEmailAndValidPassword() {
		
		loginPage.login(Utilities.generateEmailWithTimeStamp(), dataProp.getProperty("invalidEmailWithvalidPassword"));
		
//		loginPage.enterEmailAddress(Utilities.generateEmailWithTimeStamp());
//		loginPage.enterPassword(dataProp.getProperty("invalidEmailWithvalidPassword"));
//		loginPage.clickOnLoginButton();
		
		Assert.assertTrue(loginPage.warningWithValidPassword(),(dataProp.getProperty("warningWithoutCredential")));
	
	}
	
	@Test(priority=4)
	public void verifyLoginWithValidEmailAndInvalidPassword() {
		
		loginPage.login(Utilities.generateEmailWithTimeStamp(), dataProp.getProperty("invalidEmailWithvalidPassword"));
		
		
//		loginPage.enterEmailAddress(Utilities.generateEmailWithTimeStamp());
//		loginPage.enterPassword(dataProp.getProperty("invalidEmailWithvalidPassword"));
//		loginPage.clickOnLoginButton();
//		
	
		Assert.assertTrue(loginPage.wariningMessageWithValidEmailWithInvalidP(),(dataProp.getProperty("warningWithoutCredential")));
		
	}
	@Test(priority=5)
	public void verifyLoginWithoutCredentials() {
		
		loginPage.login("", "");
		
//		
//		loginPage.enterEmailAddress("");
//		loginPage.enterPassword("");
//		loginPage.clickOnLoginButton();
//		
		
		Assert.assertTrue(loginPage.warningmessageWithoutCredentials(),dataProp.getProperty("warningWithoutCredential"));
	}
	
}

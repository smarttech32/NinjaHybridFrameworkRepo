 package com.ninja.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninja.qa.base.Base;
import com.ninja.qa.pages.AccountSuccessPage;
import com.ninja.qa.pages.HomePage;
import com.ninja.qa.pages.RegisterPage;
import com.ninja.qa.utils.Utilities;

public class RegisterTest extends Base {
	
	RegisterPage registerPage ;
	
	
	public WebDriver driver;
	
	public RegisterTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
		HomePage homePage = new HomePage(driver);
		
		registerPage =homePage.navigateToRegisterPage();
		
		
		
//		homePage.clickOnMyAccount();
//		homePage.selectRegisterOption();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

	@Test(priority=1)
	public void verifyRegisteringAccountWithMandatoryFields() {
		
		
//		registerPage.enterFirstName(dataProp.getProperty("firstName"));
//		registerPage.enterLastName(dataProp.getProperty("lastName"));
//		registerPage.enterEmailField(Utilities.generateTimeStamp());
//		registerPage.enterTelephoneField(dataProp.getProperty("telephoneNumber"));
//		registerPage.enterPasswordField(prop.getProperty("validPassword"));
//		registerPage.conformPasswordField(prop.getProperty("validPassword"));
//		registerPage.agrementButtonField();
//		registerPage.continueButtonField();
		
		
		registerPage.RegisteringAccountWithMandatoryFields(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"), Utilities.generateTimeStamp(), dataProp.getProperty("telephoneNumber"), prop.getProperty("validPassword"), prop.getProperty("validPassword"));
		
		
		AccountSuccessPage accountsuccesspage= new AccountSuccessPage(driver);
		
		Assert.assertTrue(accountsuccesspage.assetionForAccountCreation(), dataProp.getProperty("accountSuccessfullyCreatedHeading"));
		
	
//		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(dataProp.getProperty("firstName"));
//		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(dataProp.getProperty("lastName"));
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Utilities.generateTimeStamp());
//		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(dataProp.getProperty("telephoneNumber"));
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(prop.getProperty("validPassword"));
//		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(prop.getProperty("validPassword"));
//		driver.findElement(By.xpath("//input[@name='agree']")).click();
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
//		String ActualSuccessHeading =driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']")).getText();
//		String ExpectedSuccessHeading = dataProp.getProperty("accountSuccessfullyCreatedHeading");
//		Assert.assertTrue(ActualSuccessHeading.contains(ExpectedSuccessHeading));
//		
		
	}
		@Test(priority=2)
		public void verifyRegisteringAccountByProvidingAllFields() {
			
			
			
//			registerPage .enterFirstName(dataProp.getProperty("firstName"));
//			registerPage.enterLastName(dataProp.getProperty("lastName"));
//			registerPage.enterEmailField(Utilities.generateTimeStamp());
//			registerPage.enterTelephoneField(dataProp.getProperty("telephoneNumber"));
//			registerPage.enterPasswordField(prop.getProperty("validPassword"));
//			registerPage.conformPasswordField(prop.getProperty("validPassword"));
//			registerPage.yesNesLetterOption();
//			registerPage.agrementButtonField();
//			registerPage.continueButtonField();
			
			
			registerPage.RegisteringAccountByProvidingAllFields(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"), Utilities.generateTimeStamp(), dataProp.getProperty("telephoneNumber"), prop.getProperty("validPassword"), prop.getProperty("validPassword"));
			
			AccountSuccessPage accountsuccesspage= new AccountSuccessPage(driver);
			Assert.assertTrue(accountsuccesspage.assetionForAccountCreation(), dataProp.getProperty("accountSuccessfullyCreatedHeading"));
			
	
//			driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(dataProp.getProperty("firstName"));
//			driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(dataProp.getProperty("lastName"));
//			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Utilities.generateTimeStamp());
			
//			driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(dataProp.getProperty("telephoneNumber"));
//			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(prop.getProperty("validPassword"));
//			driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(prop.getProperty("validPassword"));
//			driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
			
//			driver.findElement(By.xpath("//input[@name='agree']")).click();
//			driver.findElement(By.xpath("//input[@value='Continue']")).click();
//			
//			String ActualSuccessHeading =driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']")).getText();
//			String ExpectedSuccessHeading = dataProp.getProperty("accountSuccessfullyCreatedHeading");
//			Assert.assertTrue(ActualSuccessHeading.contains(ExpectedSuccessHeading));
//			Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']")).isDisplayed(), dataProp.getProperty("accountSuccessfullyCreatedHeading"));
		}
		
			@Test(priority=3)
		public void verifyingRegisteringWithExsistingEmailAddress() {
				
//				registerPage .enterFirstName(dataProp.getProperty("firstName"));
//				registerPage.enterLastName(dataProp.getProperty("lastName"));
//				registerPage.enterEmailField(prop.getProperty("validEamil"));
//				registerPage.enterTelephoneField(dataProp.getProperty("telephoneNumber"));
//				registerPage.enterPasswordField(prop.getProperty("validPassword"));
//				registerPage.conformPasswordField(prop.getProperty("validPassword"));
//				registerPage.agrementButtonField();
//				registerPage.continueButtonField();
				
				
				registerPage.RegisteringWithExsistingEmailAddress(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"), prop.getProperty("validEamil"), dataProp.getProperty("telephoneNumber"), prop.getProperty("validPassword"), prop.getProperty("validPassword"));
				
				Assert.assertTrue(registerPage.alertForExistingAccount(), dataProp.getProperty("existingEmailWarning"));
			
		
//			driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(dataProp.getProperty("firstName"));
//			driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(dataProp.getProperty("lastName"));
//			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(prop.getProperty("validEamil"));
//			
//			driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(dataProp.getProperty("telephoneNumber"));
//			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(prop.getProperty("validPassword"));
//			driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(prop.getProperty("validPassword"));
//			driver.findElement(By.xpath("//input[@name='agree']")).click();
//			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			
//			String ActualSuccessHeading =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
//			String ExpectedSuccessHeading = dataProp.getProperty("existingEmailWarning");
//			Assert.assertTrue(ActualSuccessHeading.contains(ExpectedSuccessHeading));
//			
			
			
			
			
		}
			@Test(priority=4)
			public void VerifyingRegistrationWithoutAnyCredentials() {
				
//				registerPage.firstNameWithoutCredential();
//				registerPage.lastNameWithoutCredential();
//				registerPage.emailNameWithoutCredential();
//				registerPage.telephoneNameWithoutCredential();
//				registerPage.passwordNameWithoutCredential();
//				registerPage.conformpasswordNameWithoutCredential();
//				registerPage.agrementButtonField();
//				registerPage.continueButtonField();
				
				
				registerPage.RegistrationWithoutAnyCredentials();
				
				Assert.assertTrue(registerPage.warningWithoutCredential(), dataProp.getProperty("waringWithoutAnyCredential"));
				
				
			
//				driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("");
				
//				driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@name='agree']")).click();
//				driver.findElement(By.xpath("//input[@value='Continue']")).click();
				
//				String ActualSuccessHeading =driver.findElement(By.xpath("//p[contains(text(),'If you already have an account with us, please log')]")).getText();
//				String ExpectedSuccessHeading = dataProp.getProperty("waringWithoutAnyCredential");
//				Assert.assertTrue(ActualSuccessHeading.contains(ExpectedSuccessHeading));
				
			}
				
			@Test(priority=5)
			public void VerifyRegistrationWithoutCredential2()	{
				
//				registerPage.firstNameWithoutCredential();
//				registerPage.lastNameWithoutCredential();
//				registerPage.emailNameWithoutCredential();
//				registerPage.telephoneNameWithoutCredential();
//				registerPage.passwordNameWithoutCredential();
//				registerPage.conformpasswordNameWithoutCredential();
//				registerPage.agrementButtonField();
//				registerPage.continueButtonField();
				
				
				
				registerPage.RegistrationWithoutCredential2();
				
				Assert.assertTrue(registerPage.loginPageAssertion(), "login page");
	
//				driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("");
//				
//				driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@name='agree']")).click();
//				driver.findElement(By.xpath("//input[@value='Continue']")).click();
//				
//				String ActualSuccessHeading =driver.findElement(By.xpath("//a[normalize-space()='login page']")).getText();
//				String ExpectedSuccessHeading = "login page";
//				Assert.assertTrue(ActualSuccessHeading.contains(ExpectedSuccessHeading));
//				
				
			}
			@Test(priority=6)
			public void VerifyRegistrationWithoutAnyField() {
				
//				registerPage.firstNameWithoutCredential();
//				registerPage.lastNameWithoutCredential();
//				registerPage.emailNameWithoutCredential();
//				registerPage.telephoneNameWithoutCredential();
//				registerPage.passwordNameWithoutCredential();
//				registerPage.conformpasswordNameWithoutCredential();
//				registerPage.continueButtonField();
				
				
				registerPage.RegistrationWithoutAnyField();
				
				Assert.assertTrue(registerPage.privacyPolicyWariningMessage(), dataProp.getProperty("privacyPolicyWarning"));
				
	
//				driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("");
//				
//				driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("");
//				driver.findElement(By.xpath("//input[@value='Continue']")).click();
//				
//				String ActualSuccessHeading =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
//				String ExpectedSuccessHeading = dataProp.getProperty("privacyPolicyWarning");
//				Assert.assertTrue(ActualSuccessHeading.contains(ExpectedSuccessHeading));
				
				
			}
				@Test(priority=7)	
				public void verifyRegistrationWithoutFillingAnyDetails() {
					
					
					registerPage.continueButtonField();
				
					Assert.assertTrue(registerPage.privacyPolicyWarning(), dataProp.getProperty("privacyPolicyWarning"));
					Assert.assertTrue(registerPage.FirstNameWarningMessage(), dataProp.getProperty("firstNameWarnig"));
					Assert.assertTrue(registerPage.lastNameWarningMessage(), dataProp.getProperty("lastNameWarning"));
					Assert.assertTrue(registerPage.emailWarningMessage(), dataProp.getProperty("emailWarning"));
					Assert.assertTrue(registerPage.telephoneWarningMessage(), dataProp.getProperty("telephoneWarning"));
					Assert.assertTrue(registerPage.passwordWarningMessage(), dataProp.getProperty("passwordWarning"));
					
					
					
					
//					driver.findElement(By.xpath("//input[@value='Continue']")).click();
//
//					String ActualSuccessHeading =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
//					String ExpectedSuccessHeading = dataProp.getProperty("privacyPolicyWarning");
//					Assert.assertTrue(ActualSuccessHeading.contains(ExpectedSuccessHeading));
					
//
//					String ActualFirstNameWarning =driver.findElement(By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]")).getText();
//					String ExpectedFirstNameWarning = dataProp.getProperty("firstNameWarnig");
//					Assert.assertTrue(ActualFirstNameWarning.contains(ExpectedFirstNameWarning));
					
//					String ActualLastNameWarning =driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")).getText();
//					String ExpectedLastNameWarning = dataProp.getProperty("lastNameWarning");
//					Assert.assertTrue(ActualLastNameWarning.contains(ExpectedLastNameWarning));
					
//					String ActualEmailWarning = driver.findElement(By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]")).getText();
//					String ExpectedEmailWarning = dataProp.getProperty("emailWarning");
//					Assert.assertTrue(ActualEmailWarning.contains(ExpectedEmailWarning));
//					
//					String ActualTelephoneWarning =driver.findElement(By.xpath("//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")).getText();
//					String ExpectedTelephoneWarning = dataProp.getProperty("telephoneWarning");
//					Assert.assertTrue(ActualTelephoneWarning.contains(ExpectedTelephoneWarning));
					
//					String ActualPasswordWarning =driver.findElement(By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]")).getText();
//					String ExpectedPasswordWarning = dataProp.getProperty("passwordWarning");
//					Assert.assertTrue(ActualPasswordWarning.contains(ExpectedPasswordWarning));
//					
					
				}
		}




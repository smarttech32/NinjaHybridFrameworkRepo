package com.ninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstNameField;
	
	public void enterFirstName(String firstNameText) {
		firstNameField.sendKeys(firstNameText);
	}
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastNameField;
	
	public void enterLastName(String lastNameText) {
		lastNameField.sendKeys(lastNameText);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailField;
	
	public void enterEmailField(String emailText) {
		
		emailField.sendKeys(emailText);
	}
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement telephoneField;
	
	public void enterTelephoneField(String telephonenumber) {
		telephoneField.sendKeys(telephonenumber);
	
	}
	
	@FindBy(xpath="//div[contains(text(),'Password must be between 4 and 20 characters!')]")
	private WebElement passwordObject;
	
	public boolean passwordWarningMessage() {
		return passwordObject.isDisplayed();
	}
	
	
	@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	private WebElement telephoneObject;
	
	public boolean telephoneWarningMessage() {
		return telephoneObject.isDisplayed();
	}
	
	
	@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	private WebElement emailwarningObject;
	
	public boolean emailWarningMessage() {
		return emailwarningObject.isDisplayed();
	}
	
	@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	private WebElement lastNameObject;
	public boolean lastNameWarningMessage() {
		return lastNameObject.isDisplayed();
	}
	
	@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	private WebElement firstnameObject;
	
	public boolean FirstNameWarningMessage() {
		return firstnameObject.isDisplayed();
	}
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement privacyPolicyobject;
	
	public boolean privacyPolicyWarning() {
		return privacyPolicyobject.isDisplayed();
	}
			
			
			
			
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement alertAssertion;
	
	public boolean alertForExistingAccount() {
		return alertAssertion.isDisplayed();
		
	}
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordField;
	
	public void enterPasswordField(String passwordText) {
		passwordField.sendKeys(passwordText);
		
	}
	@FindBy(xpath="//label[normalize-space()='Yes']")
	private WebElement newsletterobject;
	
	public void yesNesLetterOption() {
		newsletterobject.click();
	}
	
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement conformPassword;		
	
	public void conformPasswordField(String comformPassword) {
		conformPassword.sendKeys(comformPassword);
	}
	@FindBy(xpath="//input[@name='agree']")
	private WebElement agrementbutton;
	
	public void agrementButtonField() {
		agrementbutton.click();
	}
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continuebutton;
	
	public void continueButtonField() {
		continuebutton.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement privacywoc;
	
	public boolean privacyPolicyWariningMessage() {
		return privacywoc.isDisplayed();
	}
	
	
	
	@FindBy(xpath="//a[normalize-space()='login page']")
	private WebElement loginpagewoc;
	
	public boolean loginPageAssertion() {
		return loginpagewoc.isDisplayed();
	}
	
	@FindBy(xpath="//p[contains(text(),'If you already have an account with us, please log')]")
	private WebElement warningwoc;
	
	public boolean warningWithoutCredential() {
		return warningwoc.isDisplayed();
	}
	
	
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement conformpasswordnameobjectwoc;
	
	public void conformpasswordNameWithoutCredential() {
		conformpasswordnameobjectwoc.sendKeys("");
	}
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordnameobjectwoc;
	
	public void passwordNameWithoutCredential() {
		passwordnameobjectwoc.sendKeys("");
	}
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement telephonenameobjectwoc;
	
	public void telephoneNameWithoutCredential() {
		telephonenameobjectwoc.sendKeys("");
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailnameobjectwoc;
	
	public void emailNameWithoutCredential() {
		emailnameobjectwoc.sendKeys("");
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstnameobjectwoc;
	
	public void firstNameWithoutCredential() {
		firstnameobjectwoc.sendKeys("");
	}
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastnameobjectwoc;
	
	public void lastNameWithoutCredential() {
		lastnameobjectwoc.sendKeys("");
	}
	
	public void RegisteringAccountWithMandatoryFields(String firstNameText,String lastNameText,String emailText,String telephonenumber,String passwordText,String comformPassword) {
		firstNameField.sendKeys(firstNameText);
		lastNameField.sendKeys(lastNameText);
		emailField.sendKeys(emailText);
		telephoneField.sendKeys(telephonenumber);
		passwordField.sendKeys(passwordText);
		conformPassword.sendKeys(comformPassword);
		agrementbutton.click();
		continuebutton.click();
	}
	
	public void RegisteringAccountByProvidingAllFields(String firstNameText,String lastNameText,String emailText,String telephonenumber,String passwordText,String comformPassword) {
		firstNameField.sendKeys(firstNameText);
		lastNameField.sendKeys(lastNameText);
		emailField.sendKeys(emailText);
		telephoneField.sendKeys(telephonenumber);
		passwordField.sendKeys(passwordText);
		conformPassword.sendKeys(comformPassword);
		newsletterobject.click();
		
		agrementbutton.click();
		continuebutton.click();
	}
	
	public void RegisteringWithExsistingEmailAddress(String firstNameText,String lastNameText,String emailText,String telephonenumber,String passwordText,String comformPassword) {
		firstNameField.sendKeys(firstNameText);
		lastNameField.sendKeys(lastNameText);
		emailField.sendKeys(emailText);
		telephoneField.sendKeys(telephonenumber);
		passwordField.sendKeys(passwordText);
		conformPassword.sendKeys(comformPassword);
		
		agrementbutton.click();
		continuebutton.click();
		
	}
	public void RegistrationWithoutAnyCredentials() {
		
		firstNameField.sendKeys("");
		lastNameField.sendKeys("");
		emailField.sendKeys("");
		telephoneField.sendKeys("");
		passwordField.sendKeys("");
		conformPassword.sendKeys("");
		
		agrementbutton.click();
		continuebutton.click();
		
	}
	
	public void RegistrationWithoutCredential2() {
		firstNameField.sendKeys("");
		lastNameField.sendKeys("");
		emailField.sendKeys("");
		telephoneField.sendKeys("");
		passwordField.sendKeys("");
		conformPassword.sendKeys("");
		
		agrementbutton.click();
		continuebutton.click();
		 
	}
	public void RegistrationWithoutAnyField() {
		firstNameField.sendKeys("");
		lastNameField.sendKeys("");
		emailField.sendKeys("");
		telephoneField.sendKeys("");
		passwordField.sendKeys("");
		conformPassword.sendKeys("");
		
		continuebutton.click();
		
	}
	
	
	
	
	
	
	

	
}

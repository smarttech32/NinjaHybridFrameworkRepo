package com.ninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="input-email")
	private WebElement emailAddressField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement wariningobj;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement wariningobjwithvp;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement objectofivp;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warningobjWOC;
	
	
//	public void enterEmailAddress(String emailText) {
//		emailAddressField.sendKeys(emailText);
//	}
//	
//	public void enterPassword(String passwordTest) {
//		passwordField.sendKeys(passwordTest);
//	}
//	
//	public void clickOnLoginButton() {
//		loginButton.click();
//	}
	
	public void login(String emailText,String passwordTest) {
		emailAddressField.sendKeys(emailText);
		passwordField.sendKeys(passwordTest);
		loginButton.click();
	}
	
	public boolean wariningMessageWithValidEmailWithInvalidP() {
		return objectofivp.isDisplayed();
	}
	
	public boolean retriveEmailPasswordNotMatchingWarningMessage() {
		return wariningobj.isDisplayed();
	}
	
	public boolean warningWithValidPassword() {
		return wariningobjwithvp.isDisplayed();
	}
	
	public boolean warningmessageWithoutCredentials() {
		return warningobjWOC.isDisplayed();
	}
	
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	
	
	
	
}

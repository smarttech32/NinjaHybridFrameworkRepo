package com.ninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	private WebElement registerOption;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButtonFinal;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchObject;
	
	public void SearchMethod(String searchText) {
		searchObject.sendKeys(searchText);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchobj3;
	
	public void searchWithoutField() {
		searchobj3.sendKeys("");
	}
	
	@FindBy(xpath="//a[normalize-space()='HP LP3065']")
	private WebElement searchObject2;
	
	public boolean searchAssertionMethod() {
		return searchObject2.isDisplayed();
	}
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchbuttonobj;
	
	public void searchButtonMethod() {
		searchbuttonobj.click();
	}
	
	
	
	public HomePage(WebDriver driver) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	public RegisterPage selectRegisterOption() {
		registerOption.click();
		return new RegisterPage(driver);
	}

	public void clickOnMyAccount() {
		myAccountDropMenu.click();
		
	}
	
	public RegisterPage navigateToRegisterPage() {
		myAccountDropMenu.click();
		registerOption.click();
		return new RegisterPage(driver);
	}
	
	
	
	public LoginPage selectLoginOptoin() {
		loginOption.click();
		return new LoginPage(driver);
	}
	
	public LoginPage navigateToLoginPage() {
		myAccountDropMenu.click();
		loginOption.click();
		return new LoginPage(driver);
		
	}
	
	public void clickOnLoginBtn() {
		loginButtonFinal.click();
	}
}

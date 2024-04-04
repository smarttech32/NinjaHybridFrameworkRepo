package com.ninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='Edit your account information']")
	private WebElement editYourInformationOption;
	
	
	
	public boolean getDisplayedStatusOfEditYourInformaationOption() {
		 return editYourInformationOption.isDisplayed();
		
	}
	
	
	public AccountPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	

}

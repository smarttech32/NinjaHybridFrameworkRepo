package com.ninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='HP LP3065']")
	private WebElement searchobj;
	
	public boolean searchButtonMethod (){
		
		return searchobj.isDisplayed();
	}
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	private WebElement searchobj3;
	
	public boolean searchButtonMethod2() {
		return searchobj3.isDisplayed();
	}
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	private WebElement search4;
	
	public boolean assertionWithoutAnyText() {
		return search4.isDisplayed();
	}
	
	
	public SearchPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	

}

package com.ninja.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninja.qa.base.Base;
import com.ninja.qa.pages.HomePage;
import com.ninja.qa.pages.SearchPage;

public class SearchTest extends Base{
	
	
	public WebDriver driver;
	
	public SearchTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void verifySearchWithValidProduct() {
		
		HomePage homePage = new HomePage(driver);
		homePage.SearchMethod(dataProp.getProperty("searchValidProduct"));
	    homePage.searchButtonMethod();
	    
	    SearchPage searchPage= new SearchPage(driver);
	    Assert.assertTrue(homePage.searchAssertionMethod(), dataProp.getProperty("expectedSearchProduct"));
	 
	    
	    
//		Assert.assertTrue(homePage.searchAssertionMethod(), dataProp.getProperty("expectedSearchProduct")); 
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(dataProp.getProperty("searchValidProduct"));
////		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//		String ActualSearchProduct = driver.findElement(By.xpath("//a[normalize-space()='HP LP3065']")).getText();
//		String expectedSearchProduct =dataProp.getProperty("expectedSearchProduct");
//		Assert.assertTrue(ActualSearchProduct.contains(expectedSearchProduct));
		
	}
	@Test(priority = 2)
	public void verifySearchInvalidProduct() {
		
		HomePage homePage = new HomePage(driver);
		homePage.SearchMethod(dataProp.getProperty("searchInvalidProduct"));
	    homePage.searchButtonMethod();
	    
	    SearchPage searchPage = new SearchPage(driver);
	    Assert.assertTrue(searchPage.searchButtonMethod2(),dataProp.getProperty("searchInvalidProduct"));
	    
	    
	    
//	    
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(dataProp.getProperty("searchInvalidProduct"));
//		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//		String ActualSearchProduct = driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]")).getText();
//		String expectedSearchProduct =dataProp.getProperty("expectedInvalidSearchProduct");
//		Assert.assertTrue(ActualSearchProduct.contains(expectedSearchProduct));
//		
	}
	@Test(priority = 3, dependsOnMethods= {"verifySearchWithValidProduct"})
	public void verifySearchWithoutAnyText() {
		
		HomePage homePage = new HomePage(driver);
		homePage.searchWithoutField();
	    homePage.searchButtonMethod();
	    
	    
	    SearchPage searchPage = new SearchPage(driver);
	    Assert.assertTrue(searchPage.assertionWithoutAnyText(), dataProp.getProperty("expectedInvalidSearchProduct"));
		
		
		
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("");
//		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//		String ActualSearchProduct = driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]")).getText();
//		String expectedSearchProduct =dataProp.getProperty("expectedInvalidSearchProduct");
//		Assert.assertTrue(ActualSearchProduct.contains(expectedSearchProduct));
//		
		
	}
	

}

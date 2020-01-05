package com.karros.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.Constants;
import commons.PageGeneratorManager;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;

public class Count_Request extends AbstractTest{
	WebDriver driver;
	LoginPageObject loginPage;
	HomePageObject homePage;
	
	@BeforeTest
	public void beforeTest() {
		driver = openBrowser();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void LoginToSystem() {
		driver.get(Constants.URL);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		
		loginPage.inputToEmailTextbox(Constants.EMAIL);
		loginPage.inputToPasswordTextbox(Constants.PASSWORD);
		loginPage.clickToLoginButton();
		
		homePage = PageGeneratorManager.getHomePage(driver);
	}

	@Test
	public void countRequest() {
		log.info("The number of requests are submitted and approved in 2019 is: "+ homePage.countApprovedRequest());
	}

	@AfterTest
	public void afterTest() {
		closeBrowserAndDriver(driver);
	}

}

package com.flipcart.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.flipcart.module.LoginModal;
import com.flipcart.page.HomePage;

public class LoginTestForExistingUser {
	private final String url="https://www.flipkart.com/";
	
	
	@Test
	public void loginExistingUserTest(){
		// get instance of home page 
		HomePage homePage = new HomePage(url);
		homePage.openLoginModal();
		WebDriver driver= homePage.getFireFoxDriver();
		// title Login
		assert (LoginModal.loginModalDisplayed(driver, "Login"));
			LoginModal.enterMobleNumber(driver, "8800440987");
			LoginModal.enterPassword(driver, "ons@12345");
			LoginModal.login(driver);
		//Hi Sudhanshu!
		assert (homePage.verifyLogin("Hi Sudhanshu!"));
		driver.quit();
		
	}
	
	
}

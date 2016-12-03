package com.flipcart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.flipcart.util.Browsers;

public class HomePage {
	// webDriver instance
	private WebDriver driver;
	
	// locator for login link 
	private By linkLogin = By.cssSelector("a._2k0gmP[href='/account/login?ret=/']");
	
	// locator for user name after login
	private By textUserName = By.cssSelector(
			"div#fk-mainhead-id div.navLinksWrap ul.fk-text-center li.greeting-link a.no-border");

	public HomePage(String url) {
		this.driver = Browsers.getFirefoxDriver(url);
	}
	
	public  WebDriver getFireFoxDriver(){
		return this.driver;
	}

	public void openLoginModal() {
		driver.findElement(linkLogin).click();
	}
	
	public boolean verifyLogin(String userName){
		return driver.findElement(textUserName).getText().equals(userName);
	}
	
	

}

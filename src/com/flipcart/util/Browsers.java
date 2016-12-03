package com.flipcart.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	
	public static WebDriver getFirefoxDriver(String url){
		System.setProperty("webdriver.gecko.driver","E:/selenium/jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}

}

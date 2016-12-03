package com.flipcart.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModal {
	private static By enterMobileNo	= 	By.cssSelector("div._39M2dM input._2zrpKA[type='text']");
	private static By password 		= 	By.cssSelector("div._39M2dM input._2zrpKA[type='password']");
	private By forgetPassword	=	By.cssSelector("div._39M2dM a._21JmK0");
	private static By buttonLogin	= 	By.cssSelector("div._1avdGP button._2AkmmA");
	private static By title			= 	By.cssSelector("div._1XBjg-.row div.Og_iib.col-2-5 span._1hgiYz");
	private By textModeule 		= 	By.cssSelector("div._1XBjg-.row div.Og_iib.col.col-2-5 p._1NJjZd span span");
	private By textValidEmailId	= 	By.cssSelector("div._39M2dM span.ZAtlA- span span");
	private By textForgotPass	=  	By.cssSelector("div._39M2dM span.ZAtlA- span span");
	private By button_X			=	By.cssSelector("div._3Njdz7 button._2AkmmA._29YdH8");
	
	
	
	public static boolean  loginModalDisplayed(WebDriver driver,String titleExpected){
		WebElement mTitle= driver.findElement(title);
		return mTitle.getText().equals(titleExpected);		
	}
	
	
	public static void enterMobleNumber(WebDriver driver,String mobile){
			driver.findElement(enterMobileNo).sendKeys(mobile);
	} 
	
	public static void enterPassword(WebDriver driver,String pass){
		driver.findElement(password).sendKeys(pass);
	} 
	
	public static void login(WebDriver driver){
		driver.findElement(buttonLogin).click();
	} 
	
	
}

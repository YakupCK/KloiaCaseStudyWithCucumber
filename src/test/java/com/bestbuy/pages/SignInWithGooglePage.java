package com.bestbuy.pages;

import com.bestbuy.utils.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInWithGooglePage extends BasePage {

	//--present Google account on the page--
	@FindBy(css = "div.WBW9sf")
	private WebElement googleAccount;

	public void login(){
		UtilityMethods.waitClickability(googleAccount,3);
		UtilityMethods.clickWithJSExe(googleAccount);
//		googleAccount.click();
		UtilityMethods.switchToWindow(0);
	}



}

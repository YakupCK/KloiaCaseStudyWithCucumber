package com.bestbuy.pages;

import com.bestbuy.utils.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

	//--username field--
	@FindBy(id = "fld-e")
	private WebElement usernameField;

	//--password field--
	@FindBy(id = "fld-p1")
	private WebElement passwordField;

	//--sign in with Google--
	@FindBy(xpath = "//button[text()='Sign In with Google']")
	private WebElement signInWithGoogle;

	//login with given credentials and hit thr ENTER ket from keyboard
	public void loginWithCredentials(String username, String password){
		UtilityMethods.waitClickability(usernameField,2);
		usernameField.sendKeys(username);
		passwordField.sendKeys(password, Keys.ENTER);
	}

		//login with Google account
	public void loginWithGoogle(){
		UtilityMethods.waitClickability(signInWithGoogle,1);
		signInWithGoogle.click();
		UtilityMethods.switchToWindow(1);
	}

}
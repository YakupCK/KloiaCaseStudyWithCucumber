package com.bestbuy.pages;

import com.bestbuy.utils.PropertyReader;
import com.bestbuy.utils.UtilityMethods;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	//--sign in btn after clicking account menu--
	@FindBy(linkText = "Sign In")
	private WebElement signInBtn;

	//--username displayed after login--
	@FindBy(css = "span.plButton-label.v-ellipsis")
	private WebElement username;

	//*****************************************

	//--navigate to homepage:'bestBuy.com'--
	public void goToHomePage(){
		driver.get(PropertyReader.getProperty("url"));
	}

	//--navigate to homepage:with Parameter--
	public void goToHomePage(String URL){
		driver.get(PropertyReader.getProperty("url"));
	}

	//close pop up at the beginning
	public void closePopUp(){
		try {
			String locator = "button[class='c-close-icon c-modal-close-icon']";
			UtilityMethods.waitClickability(By.cssSelector(locator),5);
			WebElement closeBtn = driver.findElement(By.cssSelector(locator));
			closeBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//verify page title
	public void verifyPageTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	//go to sign in page
	public void goToSignInPage() {
		navigateToRightTopMenus("Account");
		UtilityMethods.waitClickability(signInBtn,5);
		signInBtn.click();
	}

	//verify if login is successful
	public void verifyLogin(){
		UtilityMethods.waitForVisibility(username,7);
		Assert.assertEquals(PropertyReader.getProperty("username"),username.getText());
	}

	//open a new tab
	public void openNewTab(){
		UtilityMethods.openNewTab();
	}









	}




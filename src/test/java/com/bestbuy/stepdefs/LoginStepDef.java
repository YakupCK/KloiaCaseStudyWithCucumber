package com.bestbuy.stepdefs;

import com.bestbuy.pages.*;
import com.bestbuy.utils.PageManager;
import com.bestbuy.utils.UtilityMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class LoginStepDef {

	private PageManager pageManager = new PageManager();
	private SelectCountryPage selectCountryPage = pageManager.getSelectCountryPage();
	private HomePage homePage = pageManager.getHomePage();
	private SignInPage signInPage = pageManager.getSignInPage();
	private SignInWithGooglePage signInWithGooglePage = pageManager.getsignInWithGooglePage();

	@When("I log in with following credentials hitting Enter key")
	public void i_log_in_with_following_credentials_hitting_Enter_key(Map<String,String > credentials) {
		homePage.goToSignInPage();
		signInPage.loginWithCredentials(credentials.get("username"), credentials.get("password"));
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		homePage.verifyLogin();
	}

	@When("I log in with my Google account")
	public void i_log_in_with_my_Google_account() {
		homePage.goToSignInPage();
		signInPage.loginWithGoogle();
		signInWithGooglePage.login();
	}

	@When("I go to {string} opening a new tab")
	public void i_go_to_opening_a_new_tab(String URL) {
		homePage.openNewTab();
		UtilityMethods.switchToWindow(1);
		homePage.goToHomePage(URL);
	}

	@Then("I should be logged in on the newly opened tab as well")
	public void i_should_be_logged_in_on_the_newly_opened_tab_as_well() {
		homePage.verifyLogin();
	}


}

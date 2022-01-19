package com.bestbuy.stepdefs;

import com.bestbuy.pages.HomePage;
import com.bestbuy.pages.SearchedItemPage;
import com.bestbuy.pages.SelectCountryPage;
import com.bestbuy.utils.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef {

	private PageManager pageManager = new PageManager();
	private SelectCountryPage selectCountryPage = pageManager.getSelectCountryPage();
	private HomePage homePage = pageManager.getHomePage();
	private SearchedItemPage searchedItemPage = pageManager.getsearchedItemPage();


	@Given("I'm on the home page")
	public void i_m_on_the_home_page() {
		homePage.goToHomePage();
//		selectCountryPage.selectUS();
//		homePage.closePopUp();
	}

	@Given("page title is {string}")
	public void page_title_is(String expectedTitle) {
		homePage.verifyPageTitle(expectedTitle);
	}

	@When("I search for {string}")
	public void i_search_for(String searchedItem) {
		homePage.searchItem(searchedItem);
	}

	@Then("Search results should be listed for {string}")
	public void search_results_should_be_listed_for(String searchedItem) {
		searchedItemPage.verifyResults(searchedItem);
	}


}

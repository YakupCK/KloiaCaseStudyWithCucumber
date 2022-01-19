package com.bestbuy.stepdefs;

import com.bestbuy.pages.*;
import com.bestbuy.utils.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class FilterAndSaveStepDef {

	private PageManager pageManager = new PageManager();
	private SelectCountryPage selectCountryPage = pageManager.getSelectCountryPage();
	private HomePage homePage = pageManager.getHomePage();
	private WirelessHeadphonesPage wirelessHeadphonesPage = pageManager.getWirelessHeadphonesPage();
	private ProductDetailsPage productDetailsPage = pageManager.getProductDetailsPage();
	private SavedItemsPage savedItemsPage = pageManager.getSavedItemsPage();

	private String expectedItemName;

	@Given("I go to following modules in below order:")
	public void i_go_to_following_modules_in_below_order(List<String> modules) {
		homePage.navigateToMenuOptions(modules);
	}

	@When("I filter the brands by {string}")
	public void i_filter_the_brands_by(String item) {
		wirelessHeadphonesPage.searchForItem(item);
	}

	@When("I select {string} from Brand filtered results")
	public void i_select_from_Brand_filtered_results(String item) {
		wirelessHeadphonesPage.selectSuggestedItem(item);
	}

	@When("I click on \"{int}\"th product on the search result page")
	public void i_click_on_th_product_on_the_search_result_page(int itemNo) {
		wirelessHeadphonesPage.clickOnItem(itemNo);
	}

	@When("I click Save button on product detail page")
	public void i_click_Save_button_on_product_detail_page() {
		productDetailsPage.clickOnSaveBtn();
		expectedItemName = productDetailsPage.getProductName();
	}

	@Then("The product name should exist on the saved item list")
	public void the_product_name_should_exist_on_the_saved_item_list() {
		productDetailsPage.goToSavedItems();
		savedItemsPage.verifyName(expectedItemName);
	}


}

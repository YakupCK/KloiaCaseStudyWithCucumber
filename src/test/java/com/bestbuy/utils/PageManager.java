package com.bestbuy.utils;

import com.bestbuy.pages.*;

public class PageManager {

	private HomePage homePage;
	private SelectCountryPage selectCountryPage;
	private SearchedItemPage searchedItemPage;
	private WirelessHeadphonesPage headphonesPage;
	private ProductDetailsPage productDetailsPage;
	private SavedItemsPage savedItemsPage;
	private SignInPage signInPage;
	private SignInWithGooglePage signInWithGooglePage;


	public HomePage getHomePage() {
		if (homePage == null) {
			return homePage = new HomePage();
		} else {
			return homePage;
		}
	}

	public SelectCountryPage getSelectCountryPage() {
		if (selectCountryPage == null) {
			return selectCountryPage = new SelectCountryPage();
		} else {
			return selectCountryPage;
		}
	}

	public SearchedItemPage getsearchedItemPage() {
		if (searchedItemPage == null) {
			return searchedItemPage = new SearchedItemPage();
		} else {
			return searchedItemPage;
		}
	}

	public WirelessHeadphonesPage getWirelessHeadphonesPage() {
		if (headphonesPage == null) {
			return headphonesPage = new WirelessHeadphonesPage();
		} else {
			return headphonesPage;
		}
	}

	public ProductDetailsPage getProductDetailsPage() {
		if (productDetailsPage == null) {
			return productDetailsPage = new ProductDetailsPage();
		} else {
			return productDetailsPage;
		}
	}

	public SavedItemsPage getSavedItemsPage() {
		if (savedItemsPage == null) {
			return savedItemsPage = new SavedItemsPage();
		} else {
			return savedItemsPage;
		}
	}

	public SignInPage getSignInPage() {
		if (signInPage == null) {
			return signInPage = new SignInPage();
		} else {
			return signInPage;
		}
	}

	public SignInWithGooglePage getsignInWithGooglePage() {
		if (signInWithGooglePage == null) {
			return signInWithGooglePage = new SignInWithGooglePage();
		} else {
			return signInWithGooglePage;
		}
	}

}

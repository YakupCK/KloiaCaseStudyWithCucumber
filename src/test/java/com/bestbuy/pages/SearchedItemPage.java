package com.bestbuy.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchedItemPage extends BasePage{

	//--Result String--
	@FindBy(css = "div.title-wrapper.title")
	private WebElement resultString;

	//--List of item titles--
	@FindBy(css = "div.sku-title h4 ")
	private List<WebElement> itemTitleList;

	//verify drone in result title
	public void verifyResults(String searchedItem){
		Assert.assertTrue(resultString.getText().toLowerCase().contains(searchedItem.toLowerCase()));
		getItemTitles(searchedItem.toLowerCase());
	}

	//get title of al items in the page
	public void getItemTitles(String searchedItem){
		for (WebElement itemTitle : itemTitleList) {
			boolean flag = false;
			if (itemTitle.getText().toLowerCase().contains(searchedItem)) {
				flag = true;
				Assert.assertTrue(flag);
				break;
			}
		}
	}


}

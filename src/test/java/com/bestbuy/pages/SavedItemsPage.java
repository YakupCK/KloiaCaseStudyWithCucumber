package com.bestbuy.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SavedItemsPage extends BasePage {

	//--grids for saved items--
	@FindBy(className = "li.grid-card")
	private List<WebElement> savedItemGrid;

	//--names of saved items--
	@FindBy(css = "li.grid-card a.v-line-clamp.title")
	private List<WebElement> savedItemsNames;

	//get the names of all saved items
	public List<String> getNames(){
		List<String> savedItemsNames2 = new ArrayList<>();
		for (WebElement savedItem : savedItemsNames) {
			savedItemsNames2.add(savedItem.getText());
		}
		return savedItemsNames2;
	}

	//verify if expected name exists
	public void verifyName(String expectedItemName){
		Assert.assertTrue(getNames().contains(expectedItemName));
	}


}

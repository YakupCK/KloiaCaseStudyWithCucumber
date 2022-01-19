package com.bestbuy.pages;

import com.bestbuy.utils.UtilityMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {

	//--save button--
	@FindBy(css = "button.save-for-later-save")
	private WebElement saveBtn;

	//--name of the product--
	@FindBy(css = "div.sku-title h1")
	private WebElement productName;

	//get name of the product
	public String getProductName(){
		return productName.getText();
	}

	//go to saved items
	public void goToSavedItems(){
		navigateToRightTopMenus("Saved Items");
		goToAllSavedItems();
	}

	//click on save button
	public void clickOnSaveBtn(){
		UtilityMethods.waitClickability(saveBtn,3);
		saveBtn.click();
	}





}

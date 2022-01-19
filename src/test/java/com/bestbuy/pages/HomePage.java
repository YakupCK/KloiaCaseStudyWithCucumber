package com.bestbuy.pages;

import com.bestbuy.utils.PropertyReader;
import com.bestbuy.utils.UtilityMethods;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


	//--username displayed after login--
	@FindBy(css = "span.plButton-label.v-ellipsis")
	private WebElement username;

	//--search box--
	@FindBy(id = "gh-search-input")
	private WebElement searchBox;

	//--find button--
	@FindBy(className = "header-search-button")
	private WebElement findBtn;

	//*****************************************

	//--navigate to homepage:'bestBuy.com'--
	public void goToHomePage() {
		driver.get(PropertyReader.getProperty("url"));
	}

	//--navigate to homepage: with provided URL--
	public void goToHomePage(String URL) {
		driver.get(PropertyReader.getProperty("url"));
	}

	//close pop up at the beginning (if appears)
//	public void closePopUp() {
//		try {
//			String locator = "button[class='c-close-icon c-modal-close-icon']";
//			UtilityMethods.waitClickability(By.cssSelector(locator), 4);
//			WebElement closeBtn = driver.findElement(By.cssSelector(locator));
//			closeBtn.click();
//			UtilityMethods.waitClickability(searchBox,3);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	//verify page title
	public void verifyPageTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	//open a new tab
	public void openNewTab() {
		UtilityMethods.openNewTab();
	}

	//search for item
	public void searchItem(String itemName) {
		UtilityMethods.waitClickability(searchBox, 5);
		searchBox.click();
		searchBox.sendKeys(itemName);
		findBtn.click();
	}


}




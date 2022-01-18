package com.bestbuy.pages;

import com.bestbuy.utils.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WirelessHeadphonesPage extends BasePage{

	//--filter box for the brands--
	@FindBy(css = "input[placeholder='Search brands']")
	private WebElement searchBrand;

	//--filter word appearing after filtering--
	@FindBy(css = "h4.facet-label")
	private WebElement filterWord;

	//--number of items displayed on the screen--
	@FindBy(css = "div.left-side span")
	private WebElement totalItemsNo;

	//--all item names/descriptions displayed on the screen--
	@FindBy(css = "ol > li.sku-item h4 > a")
	private List<WebElement> totalNamesNo;

	//search for an item
	public void searchForItem(String item){
		UtilityMethods.waitClickability(searchBrand,5);
		searchBrand.sendKeys(item);
	}

	//select suggested item under the search brand box after filtering
	public void selectSuggestedItem(String item){
		String locator = "//button/*[text()='" + item + "']";
		UtilityMethods.waitClickability(By.xpath(locator),3);
		WebElement suggested = driver.findElement(By.xpath(locator));
		suggested.click();
		waitFilterToBeApplied();
	}

	//wait till filter is applied to page
	public void waitFilterToBeApplied(){
		UtilityMethods.waitClickability(filterWord,5);
	}

	//get the int value of total number of items displayed on the screen
	public int getTotalNumber(){
		waitFilterToBeApplied();
		totalItemsNo.getText().split("");
		String[] split1 = totalItemsNo.getText().split("-");
		String[] split2 = split1[1].split(" ");
		System.out.println(split2[0]);
		return Integer.valueOf(split2[0]);
	}

	//wait till all items are displayed correctly
	public void waitForAllItems(){
		WebDriverWait wait = new WebDriverWait(driver,6);
		//--locator for all item names/descriptions displayed on the screen--
		String locator = "ol > li.sku-item h4 > a";
		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(locator), getTotalNumber()));
	}

	//click on the desired item with no
	public void clickOnItem(int itemNo){
		String locator = "(//a[@class='image-link'])["+ itemNo +"]";
		waitForAllItems();
		UtilityMethods.waitClickability(By.xpath(locator),5);

		WebElement item = driver.findElement(By.xpath(locator));
		item.click();
	}





}

package com.bestbuy.utils;

import com.bestbuy.stepdefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Set;

public class UtilityMethods {

	private static WebDriver driver = Hooks.driver;

	public static void waitClickability(WebElement element, int timeOut){
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitClickability(By locator, int timeOut){
		try {
			WebDriverWait wait = new WebDriverWait(driver,timeOut);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitForURLContains(String urlPart, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.urlContains(urlPart));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitForVisibility(WebElement element, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitForVisibility(By locator, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitForNewWindow(){
		try {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchToWindow(int index){
		waitForNewWindow();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> allTabs = new ArrayList<>(windowHandles);
		driver.switchTo().window(allTabs.get(index));
	}

	//open a new tab
	public static void openNewTab(){
		((JavascriptExecutor) driver).executeScript("window.open();");
	}



}

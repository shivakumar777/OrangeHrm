package com.hrm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.hrm.config.Configuration;

import net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService;

public class Commonutils extends Configuration {

	public static void enterTextInTextBox(String identify, String locator, String value) {

		if (identify.equalsIgnoreCase("xpath")) {

			driver.findElement(By.xpath(locator)).sendKeys(value);

		} else if (identify.equalsIgnoreCase("css")) {

			driver.findElement(By.cssSelector(locator)).sendKeys(value);

		} else if (identify.equalsIgnoreCase("id")) {

			driver.findElement(By.id(locator)).sendKeys(value);

		} else if (identify.equalsIgnoreCase("name")) {

			driver.findElement(By.name(locator)).sendKeys(value);

		} else if (identify.equalsIgnoreCase("class")) {

			driver.findElement(By.className(locator)).sendKeys(value);

		} else if (identify.equalsIgnoreCase("link")) {

			driver.findElement(By.linkText(locator)).sendKeys(value);

		} else {

			System.out.println("Invaild Locator");

		}

	}

// Button Click.!!

	public static void clickButton(String identify, String locator) {

		if (identify.equalsIgnoreCase("xpath")) {

			driver.findElement(By.xpath(locator)).click();

		} else if (identify.equalsIgnoreCase("css")) {

			driver.findElement(By.cssSelector(locator)).click();

		} else if (identify.equalsIgnoreCase("id")) {

			driver.findElement(By.id(locator)).click();

		} else if (identify.equalsIgnoreCase("name")) {

			driver.findElement(By.name(locator)).click();
		} else if (identify.equalsIgnoreCase("class")) {

			driver.findElement(By.className(locator)).click();

		} else if (identify.equalsIgnoreCase("link")) {

			driver.findElement(By.linkText(locator)).click();

		} else {

			System.out.println("Invaild Locator");

		}

	}

	public static void mouseHover(String identify, String locator) {

		if (identify.equalsIgnoreCase("xpath")) {

			WebElement element = driver.findElement(By.xpath(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();

		} else if (identify.equalsIgnoreCase("css")) {

			WebElement element = driver.findElement(By.cssSelector(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();

		} else if (identify.equalsIgnoreCase("id")) {

			WebElement element = driver.findElement(By.id(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();

		} else if (identify.equalsIgnoreCase("name")) {

			WebElement element = driver.findElement(By.name(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();

		} else if (identify.equalsIgnoreCase("class")) {

			WebElement element = driver.findElement(By.className(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();

		} else if (identify.equalsIgnoreCase("link")) {

			WebElement element = driver.findElement(By.linkText(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();

		} else {

			System.out.println("Invaild Locator");

		}

	}

	//Switch to Frame..!!

	public static void switchToFrame(String locator) {
		driver.switchTo().frame(locator);
	}

	public static void switchToDefaultFrame() {
		driver.switchTo().defaultContent();
	}
}
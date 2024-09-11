package UtilsLayer;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;


public class UtilityWait extends BaseClass {
	public static WebElement visiblityOf(WebElement wb) {
		// Explicit wait: Waits up to 10 seconds for the element to be visible
		return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(wb));
	}

	public static void click(WebElement wb) {
		// Waits up to 10 seconds until the element is clickable, then performs a click
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(wb)).click();
	}

	public static void sendKeys(WebElement wb, String value) {
		// Waits for the element to be visible, then enters the specified text
		UtilityWait.visiblityOf(wb).sendKeys(value);
	}
	
	public static boolean isDisplayed(WebElement wb) {
		 // Returns true if the element is visible, false otherwise
		return UtilityWait.visiblityOf(wb).isDisplayed();
	}
	
	public static String getText(WebElement wb) {
		 // Waits for the element to be visible, then retrieves its text
		return UtilityWait.visiblityOf(wb).getText();
	}
}

package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import UtilsLayer.UtilityWait;

import BaseLayer.BaseClass;

public class GICLoginPage extends BaseClass {
	
	// Locates the username (email) input field using the XPath locator strategy
	@FindBy(xpath = "//input[@id='username']")
	private WebElement Email;
	
	// Locates the password input field using the XPath locator strategy
	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;
	
	// Locates the login button using the XPath locator, which contains 'Log In' text
	@FindBy(xpath = "//button[contains(text(),'Log In')]")
	private WebElement LogIn;
	
	// Locates the error message element that appears after a failed login attempt
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement ErrorMsg;

	public GICLoginPage() {
		PageFactory.initElements(driver, this);		// Initializes the WebElements in this page class using the driver from BaseClass

	}

	public void enterUsernameAndPassword(String email, String pass) {
		UtilityWait.sendKeys(Email,email);		// Sends the provided email to the 'Email' input field using a custom wait utility
		UtilityWait.sendKeys(Password,pass);	// Sends the provided password to the 'Password' input field using a custom wait utility
	}

	public void userClickOnLoginButton() {
		UtilityWait.click(LogIn);		// Performs a click action on the 'LogIn' button using the custom wait utility
	}
	
	public void errorMsgShown()
	{
		UtilityWait.isDisplayed(ErrorMsg);		// Checks if the error message element is visible on the page
		String errorMsg=UtilityWait.getText(ErrorMsg);		// Retrieves the text from the error message element
		System.out.println(errorMsg);		// Prints the error message to the console
		
	}

}

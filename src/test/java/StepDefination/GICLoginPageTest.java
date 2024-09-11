package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.GICLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GICLoginPageTest extends BaseClass {

	public static GICLoginPage login;		// Static instance of GICLoginPage to be used in step definitions

	@Given("user open a url in {string} browser")
	public void user_open_a_url_in_browser(String browsername) {
		BaseClass.initialization(browsername);		// Calls the initialization method from BaseClass to set up WebDriver

	}

	@When("User Enter {string} and {string}")
	public void user_enter_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		login=new GICLoginPage();		// Creates an instance of GICLoginPage
		login.enterUsernameAndPassword(username, password);		// Enters the username and password into the login fields
		
	}

	@When("User Click on Login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    login.userClickOnLoginButton();		// Clicks the login button
	}

	@Then("User is naviagated to the HomePage")
	public void user_is_naviagated_to_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
	    String actualTitle=driver.getTitle();		// Gets the title of the current page
			    
	    if(actualTitle.equals("Upload your CV | Germany Is Calling"))		// Checks if the title matches the expected title
	    {
	    	System.out.println("Homepage Title is Right");		// Prints confirmation if the title is correct
	    }
	    else 
	    {
	    	System.err.println("Homepage Title is Wrong");		// Prints error if the title is incorrect
	    }
	    
	}
	
	@Then("User Close the Browser Window")
	public void user_close_the_browser_window() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();		// Closes the current browser window
	}
	
	@Then("User Clicked on Login button")
	public void user_clicked_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    login.userClickOnLoginButton();		// Clicks the login button
	}
	
	@Then("User Validate the Error Message")
	public void user_validate_the_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	   	login.errorMsgShown();		// Displays the error message if present
		driver.close();		// Closes the browser window
		
	}

	@Then("User Quit the Browser Window")
	public void user_quit_the_browser_window() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();		// Quits the WebDriver and closes all browser windows
	}
	
}

package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	protected static WebDriver driver;						// Declares a static WebDriver to be used across methods

	public static void initialization(String browsername) {
		 // Checks if the browser is Chrome
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} 
		// Checks if the browser is Edge
		else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} 
		// Checks if Chrome should run in Incognito mode
		else if (browsername.equalsIgnoreCase("incognito")) {

			driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito"));
		} 
		// Checks if Chrome should run in Headless mode (without GUI)
		else if (browsername.equalsIgnoreCase("headless")) {

			driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
		} 
		// Handles invalid browser names
		else {
			System.out.println("please enter valid browsername");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		// Sets an implicit wait for finding elements (30 seconds)
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));		// Sets a timeout for page loading (30 seconds)
		driver.manage().deleteAllCookies();		// Deletes all cookies to ensure a fresh session
		driver.manage().window().maximize();	// Maximizes the browser window for better visibility
		driver.get("https://app.germanyiscalling.com/");	// Opens the specified URL in the browser
	}

}

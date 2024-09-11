package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)		// Tells JUnit to run the tests using the Cucumber class
@CucumberOptions(features = { "src/test/java/Feature" },		// Path to the directory containing feature files
glue = "StepDefination",		// Package containing step definition classes
dryRun = false,		// If true, Cucumber will check for missing step definitions without running tests 
monochrome = true,		// If true, output will be in a readable format without ANSI color codes
plugin={
		"json:Reports/GIC.json",		// Generates a JSON report of the test results
		"junit:Reports/GIC.xml",		// Generates a JUnit XML report of the test results
		"html:Reports/GIC.html",		// Generates an HTML report of the test results
		"pretty:Reports/txt"			// Generates a plain text report with a readable format
		}
)
public class TestRunner {
	// This class is used to configure and run the Cucumber tests
}

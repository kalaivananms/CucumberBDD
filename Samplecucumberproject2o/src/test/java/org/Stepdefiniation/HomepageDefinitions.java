package org.Stepdefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageDefinitions {
	WebDriver driver;
	
	@Given("^User is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchterm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.name("q")).sendKeys(searchterm);
	
	}

	@When("^enter the return key$")
	public void enter_the_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^the user should see the search results$")
	public void the_user_should_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		boolean status=driver.findElement(By.partialLinkText("kalaivanan MS")).isDisplayed();
	   
		if (status) {
			System.out.println("Resulted is displayed");
		}
		
	}



}

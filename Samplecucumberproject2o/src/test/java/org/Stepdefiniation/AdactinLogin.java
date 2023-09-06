package org.Stepdefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin {
	
	WebDriver driver;
	
	@Given("^User is an Adactin Page$")
	public void user_is_an_Adactin_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
	}

	@When("^user is an enter the \"([^\"]*)\" and \"([^\"]*)\" and click login button$")
	public void user_is_an_enter_the_and_and_click_login_button(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("username")).sendKeys("kalai1327");
		driver.findElement(By.id("password")).sendKeys("32F5M5");
		
		
	}

	@Then("^Message displayed Login successfully$")
	public void message_displayed_Login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("login")).click();
	}

	

}

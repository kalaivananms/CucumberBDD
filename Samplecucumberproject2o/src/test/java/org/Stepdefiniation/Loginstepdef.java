package org.Stepdefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginstepdef {
	
	WebDriver driver;
	
	
	@Given("^User is facebook page$")
	public void user_is_facebook_page() throws Throwable {
		
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sakithyah\\Driver\\chromedriver_win32\\chromedriver_98.exe"
				//);
				WebDriverManager.chromedriver().setup();
				ChromeOptions options=new ChromeOptions();
				//options.addArguments("--remote-allow-origins=*");
				
		driver = new ChromeDriver(options); 
		driver.get("https://www.facebook.com/login");
		
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys("kalaimsk@1327");
		driver.findElement(By.id("pass")).sendKeys("kalai@1327");
		
		
	}

	@Then("^User click the login page sucessful$")
	public void user_click_the_login_page_sucessful() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}

	
	/*@Given("^User is an Facebook page$")
	public void user_is_an_Facebook_page()  {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sakithyah\\eclipse-workspace\\Samplecucumberproject2o\\driver\\chromedriver.exe");
		 
		driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        
		//System.out.println("User is on Faceboook pages");
		
	}
*/
	/*@When("^User enters username and password$")
	public void user_enters_username_and_password()  {
		
		driver.findElement(By.id("email")).sendKeys("kalaimsk@1327");
		driver.findElement(By.id("pass")).sendKeys("kalai@1327");
		
		//System.out.println("user enter Username and password");
	}

	@Then("^user clicks the Login Pages$")
	public void user_clicks_the_Login_Pages()  {
		driver.findElement(By.id("loginbutton")).click();
		
		
		//System.out.println("user clickthe Login pages");
		
	}
*/
}

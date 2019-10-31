package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	WebDriver driver;
	@Given("User is in Facebook Login page")
	public void user_is_in_Facebook_Login_page() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\OMR\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	    
	}

	@When("User has to enter the valid username and valid password")
	public void user_has_to_enter_the_valid_username_and_valid_password() {
		driver.findElement(By.id("email")).sendKeys("durgareddy");
		driver.findElement(By.id("pass")).sendKeys("durga");
	    
	}

	@When("Click the Login button")
	public void click_the_Login_button() {
	    driver.findElement(By.id("u_0_b")).click();
	}

	@Then("User has to navigate to the HomePage")
	public void user_has_to_navigate_to_the_HomePage() {
		System.out.println("HomePage Opened");
		System.out.println("success");
		
	    
	}



}

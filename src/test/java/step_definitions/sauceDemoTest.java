package step_definitions;

import org.junit.Assert;

import Utils.DataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceHomePAge;
import pages.sauceDemoLogInPage;

public class sauceDemoTest {
	sauceDemoLogInPage logInPage = new sauceDemoLogInPage();
	SauceHomePAge homePage = new SauceHomePAge();
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	  Utils.Driver.getDriver().get(DataReader.getProperty("sauce_url"));
	    
	}

	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_and_password() {
	  logInPage.loginUsername.sendKeys(DataReader.getProperty("sauce_username"));
	  logInPage.loginPassword.sendKeys(DataReader.getProperty("sauce_password"));
	}

	@When("user clicks on the sign in button")
	public void user_clicks_on_the_sign_in_button() {
	   sauceDemoLogInPage.loginBtn.click();
	    
	}

	@Then("user is logged  successfully")
	public void user_is_logged_successfully() throws InterruptedException {
	    Thread.sleep(1000);
	    Assert.assertTrue(homePage.homepage_products_textElement.isDisplayed());
	}
	    
	 
	
}

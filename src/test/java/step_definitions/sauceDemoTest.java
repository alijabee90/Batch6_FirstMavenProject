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
//  Login Scenario #1 valid username and passowrd = start
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
	//  Login Scenario #1 valid username and passowrd = end 
	}
	
	//  Login Scenario #2 invalid username = start
	    
	@When("user enters invalid username and valid password")
	public void user_enters_invalid_username_and_valid_password() {
		 logInPage.loginUsername.sendKeys("HeloHelo");
		  logInPage.loginPassword.sendKeys(DataReader.getProperty("sauce_password"));
		
		
	}

	@Then("user should not be logged in")
	public void user_should_not_be_logged_in() throws InterruptedException {
		Thread.sleep(2000);
	 Assert.assertTrue(sauceDemoLogInPage.loginBtn.isDisplayed());
	// Scenario #2 invalid username = end
	    
	}
	// login Scenario #3 invalid passowrd = start
	
	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
		  logInPage.loginUsername.sendKeys(DataReader.getProperty("sauce_username"));
		  logInPage.loginPassword.sendKeys("HelloHello");
		// Log in Scenario #3 invalid passowrd = end
	}  
		  // scenario outline invalid - start
		  
		  @When("user enters  username {string} and password {string}")
		  public void user_enters_username_and_password(String username, String password) {
			  logInPage.loginUsername.sendKeys(username);
			  logInPage.loginPassword.sendKeys(password);
		  }

		  // scenario outline invalid - end
}


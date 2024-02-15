package day12_POMPageOpgectModel;

import Utils.BrowserUtils;
import Utils.DataReader;
import Utils.Driver;
import pages.sauceDemoLogInPage;

public class SaucePageOpjectDemo {

	public static void main(String[] args) {
		sauceLoginDemo();
	}
public static void sauceLoginDemo() {
	sauceDemoLogInPage logInPage = new sauceDemoLogInPage();
	BrowserUtils utils = new BrowserUtils();
	
	//go to website
	Driver.getDriver().get(DataReader.getProperty("sauce_url"));
	
	// wait for the username field
	utils.waitForElementToBeVisible(logInPage.loginUsername);
	//type username
	logInPage.loginUsername.sendKeys(DataReader.getProperty("sauce_username"));
	//type password
	logInPage.loginPassword.sendKeys(DataReader.getProperty("sauce_password"));
	//click signin
	logInPage.loginBtn.click();
	
}
}

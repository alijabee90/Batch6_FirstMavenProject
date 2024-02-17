package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class sauceDemoLogInPage {
// how do we creat a page class
	//1. we need a class for a page of the application
	//2. we need to creat a constructor with page factory of selenium
	// then cloect the webelements
	 
	
	
	public  sauceDemoLogInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	// what this line telling is:  hey pageFactory, initialize all the elements in this class with the driver instance 
	// whenever an object of this class is created.
	// how do we collect webElements?
	
	@FindBy (id = "user-name")
	public WebElement loginUsername;
	
	@FindBy (id = "password")
	public WebElement loginPassword;
	
	@FindBy (xpath = "//input[@id='login-button']")
	public static WebElement loginBtn;
	
	@FindBy (css = "h3[data-test='error']")
	public WebElement loginEmptyError;
}

package Day11_FrameWork_Driver_Utillites;

import org.openqa.selenium.By;

import Utils.DataReader;
import Utils.DataReader.TestDataReader;
import Utils.Driver;
public class DriverUtilisDemo {

	public static void main(String[] args) {


	sauceDemoTest();
	}



public static void sauceDemoTest() {
	
	// go to saucedemo website 
	Driver.getDriver().get("https://saucedemo.com");
	Driver.getDriver().findElement(By.id("user-name")).sendKeys(TestDataReader.getProperty("sauce_username"));
	Driver.getDriver().findElement(By.id("password")).sendKeys(TestDataReader.getProperty("sauce_password"));
	Driver.getDriver().findElement(By.id("login-button")).click();
	
	
	
}
	
}


package Day8_Select_alerts_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHAndlingDemo {
public static void main(String[] args) throws InterruptedException {
	alertDemo();
}
          
  

	public static void alertDemo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Test case 1
		//go to https://demoqa.com/alerts
		driver.get("https://demoqa.com/alerts");
		
		//Click on the first ‘Click me’  button and Accept the alert.
		driver.findElement(By.id("alertButton")).click();
		
		// let's wait the alert to be present first, then interact with it
	     WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Wait.until(ExpectedConditions.alertIsPresent());
		
		// now it's time to handle the alert
		
		Alert handle = driver.switchTo().alert();
		// accept is for anything confirmative like: Yes, Okay, Confirm, Accept etc....
		handle.accept();
	}

}


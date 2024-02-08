package Day9_WindowHandels;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iFrameDemo {
	public static void main(String[] args) {
		iFramedemo();
	}
public static void iFramedemo() {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demoqa.com/frames");
	
	String mainframeTextString = driver.findElement(By.xpath("//*[contains(text(),'sample Ifreame page'))]")).getText();
	System.out.println(mainframeTextString);
	driver.switchTo();
}
}

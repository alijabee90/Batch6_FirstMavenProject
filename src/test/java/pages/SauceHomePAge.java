package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class SauceHomePAge {
	
	public SauceHomePAge() {
	
PageFactory.initElements(Driver.getDriver(),this);
}
	@FindBy (css=".inventory_item_price")
	public List <WebElement> itempricesElements;
	
	@FindBy (xpath = "//span[@class=\"title\"]")
	public WebElement homepage_products_textElement;
}


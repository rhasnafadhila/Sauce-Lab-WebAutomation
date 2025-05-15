package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartObject {

	
	@FindBy(xpath = "//*[@data-test='title' and contains(text(),'Your Cart')]")
	public WebElement labelCartPage;
	
	@FindBy(xpath = "//*[@data-test='inventory-item-name']")
	public WebElement labelItemName;
	
	@FindBy(xpath = "//*[@data-test='inventory-item-desc']")
	public WebElement labelItemDesc;
	
	
}

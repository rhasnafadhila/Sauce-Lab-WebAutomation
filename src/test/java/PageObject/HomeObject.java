package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeObject {
	@FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-backpack']")
	public WebElement buttonAddCartBackPack;

	@FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-fleece-jacket']")
	public WebElement buttonAddCartFleeceJacket;

	@FindBy(xpath = "//*[@data-test='shopping-cart-link']")
	public WebElement buttonShoppingCart;

	@FindBy(xpath = "//*[@id='react-burger-menu-btn']")
	public WebElement buttonHamburger;

	@FindBy(xpath = "//*[@data-test='about-sidebar-link']")
	public WebElement sidebarAbout;

}

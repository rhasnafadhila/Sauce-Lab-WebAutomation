package PageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObject.HomeObject;

public class HomeAction extends HomeObject {

	public HomeAction(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void addCartSauceLabsBackpack() {
		this.buttonAddCartBackPack.click();
	}

	public void addCartSauceLabsFleeceJacket() {
		this.buttonAddCartFleeceJacket.click();
	}

	public void clickShopCart() {
		this.buttonShoppingCart.click();
	}

	public void clickAboutSidebar() {
		this.sidebarAbout.click();
	}

	public void clickHamburgerButton() {
		this.buttonHamburger.click();
	}
}
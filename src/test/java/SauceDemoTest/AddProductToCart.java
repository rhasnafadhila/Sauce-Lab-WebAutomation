package SauceDemoTest;

import org.testng.annotations.Test;

import Assertion.CartAssertion;
import PageAction.HomeAction;
import PageAction.LoginAction;

public class AddProductToCart extends Base {
	LoginAction actionLogin;
	HomeAction actionHome;
	CartAssertion assertionCart;

	@Test(priority = 1)
	public void userCanAddSauceLabsBackpack() {
		driver.get("https://www.saucedemo.com/");
		actionLogin = new LoginAction(driver);
		actionHome = new HomeAction(driver);
		assertionCart = new CartAssertion(driver);
		actionLogin.LoginWithUsernamePassword("standard_user", "secret_sauce");
		actionHome.addCartSauceLabsBackpack();
		actionHome.clickShopCart();
		assertionCart.verifyCanSeeSauceLabsBackpackOnCart();

	}

	@Test(priority = 2)
	public void userCanAddSauceLabsFleeceJacket() {
		driver.get("https://www.saucedemo.com/");
		clearCache();
		driver.manage().window().maximize();
		actionLogin = new LoginAction(driver);
		actionHome = new HomeAction(driver);
		assertionCart = new CartAssertion(driver);
		actionLogin.LoginWithUsernamePassword("standard_user", "secret_sauce");
		actionHome.addCartSauceLabsFleeceJacket();
		actionHome.clickShopCart();
		assertionCart.verifyCanSeeSauceLabsFleeceJacket();

	}

}

package SauceDemoTest;

import org.testng.annotations.Test;

import Assertion.AboutAssertion;
import PageAction.HomeAction;
import PageAction.LoginAction;

public class About extends Base {
	LoginAction actionLogin;
	HomeAction actionHome;
	AboutAssertion assertionAbout;
	@Test
	public void userCanNavigateToAbout() {
	    driver.get("https://www.saucedemo.com/");
		actionLogin= new LoginAction(driver);
		actionHome = new HomeAction(driver);
		assertionAbout =new AboutAssertion(driver);
		actionLogin.LoginWithUsernamePassword("standard_user", "secret_sauce");
		actionHome.clickHamburgerButton();
		actionHome.clickAboutSidebar();
		assertionAbout.verifyCanNavigateToAboutPage();
		
		
		
	}

}

package Assertion;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObject.AboutObject;
import SauceDemoTest.Base;

public class AboutAssertion extends AboutObject {
Base base;


public AboutAssertion(WebDriver driver) {
	PageFactory.initElements(driver, this);
	base =new Base();
	
}

public void verifyCanNavigateToAboutPage() {
	base.waiting(this.labelSauceLab);
	base.verifyElementVisible(this.labelSauceLab);
	base.verifyElementVisible(this.buttonBookDemo);
	base.verifyElementVisible(this.buttonSignUp);
	base.verifyElementVisible(this.buttonRequestDemo);
	base.verifyElementVisible(this.buttonTryForFree);
	base.verifyElementVisible(this.buttonSignIn);


	


}
}


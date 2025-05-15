package PageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObject.LoginObject;

public class LoginAction extends LoginObject {

public LoginAction(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public void LoginWithUsernamePassword(String username, String password) {
	this.inputUserName.sendKeys(username);
	this.inputPassword.sendKeys(password);
	this.buttonLogin.click();
	
}





}

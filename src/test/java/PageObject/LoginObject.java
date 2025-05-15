package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject {
	@FindBy(xpath = "//*[@id='user-name']")
	public WebElement inputUserName;

	@FindBy(xpath = "//*[@data-test='password']")
	public WebElement inputPassword;

	@FindBy(xpath = "//*[@data-test='login-button']")
	public WebElement buttonLogin;
}

package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutObject {

	@FindBy(xpath = "//*[contains(text(),'Build apps users love with AI-driven insights')]")
	public WebElement labelSauceLab;

	@FindBy(xpath = "//button[text()='Sign up for free']")
	public WebElement buttonSignUp;

	@FindBy(xpath = "//button[text()='Book a demo']")
	public WebElement buttonBookDemo;

}

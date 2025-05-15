package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageObject.CartObject;
import SauceDemoTest.Base;

public class CartAssertion extends CartObject {
	
	Base base;

	public CartAssertion(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public void verifyCanSeeSauceLabsBackpackOnCart() {
		base = new Base();	
		base.waiting(this.labelCartPage);
		base.verifyElementVisible(this.labelCartPage);
		base.verifyElementVisible(this.labelItemName);
	    base.verifyElementVisible(this.labelItemDesc);
	    String itemName = this.labelItemName.getText();
	    String itemDesc = this.labelItemDesc.getText();
	    Assert.assertEquals(itemName,"Sauce Labs Backpack" );
	    Assert.assertEquals(itemDesc, "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");

	    
	}
	public void verifyCanSeeSauceLabsFleeceJacket() {
		base = new Base();	
		base.waiting(this.labelCartPage);
		base.verifyElementVisible(this.labelCartPage);
		base.verifyElementVisible(this.labelItemName);
	    base.verifyElementVisible(this.labelItemDesc);
	    String itemName = this.labelItemName.getText();
	    String itemDesc = this.labelItemDesc.getText();
	    Assert.assertEquals(itemName,"Sauce Labs Fleece Jacket" );
	    Assert.assertEquals(itemDesc,"It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");

	    
	}
}

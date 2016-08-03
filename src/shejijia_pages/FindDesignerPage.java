package shejijia_pages;

import org.openqa.selenium.WebDriver;

import invoke.test.Do;
import invoke.test.VerifyElement;
import shejijia_locators.FindDesignerLocator;

public class FindDesignerPage {
	
	private WebDriver driver;
	//private Do du;
	private VerifyElement verifyElement;
	
	public FindDesignerPage(WebDriver driver){
		this.driver = driver;
		verifyElement = new VerifyElement(driver);
		//du = new Do(driver);
		
	}
	
	public boolean checkElements(){
		return verifyElement.ElementsIsDisplayed(FindDesignerLocator.designer_img);
	}

}

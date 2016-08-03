package shejijia_pages;

import org.openqa.selenium.WebDriver;

import invoke.test.Do;
import shejijia_locators.GetPasswordLocator;

public class ForgetPWPage {
	
	private Do du;
	
	public ForgetPWPage(WebDriver driver){
		du = new Do(driver);
	}
	
	public void InputUname(String uname){
		du.what(GetPasswordLocator.UserName).clear();
		du.what(GetPasswordLocator.UserName).sendKeys(uname);
	}
	
	public void InChcode(String Chcode){
		du.what(GetPasswordLocator.ChCode).clear();
		du.what(GetPasswordLocator.ChCode).sendKeys(Chcode);
	}
	
	public void ClickNext(){
		du.what(GetPasswordLocator.NextStep).click();
		
	}
}

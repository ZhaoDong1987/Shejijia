package shejijia_pages;

import org.openqa.selenium.WebDriver;

import invoke.test.Do;
import invoke.test.VerifyElement;
import shejijia_locators.LoginLocator;

public class LoginPage {
	
	private Do du;
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		du = new Do(driver);
	}
	
	public LoginPage getUserName(String username){
		du.what(LoginLocator.UserName).clear();
		du.what(LoginLocator.UserName).sendKeys(username);
		return this;
	}
	
	public LoginPage getPW(String password){
		du.what(LoginLocator.password).clear();
		du.what(LoginLocator.password).sendKeys(password);
		return this;
	}
	
	
	public void clickBtn(){
		du.what(LoginLocator.loginbtn).click();
	}
	
	public void clickBtn3(){
		du.what(LoginLocator.loginbtn).click();
		du.waitFor(2000);
		du.what(LoginLocator.loginbtn).click();
		du.waitFor(2000);
		du.what(LoginLocator.loginbtn).click();
	}
	
	//验证提示
	public boolean getTS(String text){
		return du.what(LoginLocator.UnameTS).getText().equals(text);
		 
	}
	
	public boolean isdisplayed(){
		VerifyElement verifyElement = new VerifyElement(driver);
		return verifyElement.isElementPresent(LoginLocator.imgChcode);
	}


	//注册账号
	public void regist(){
		du.what(LoginLocator.regist);
	}
	
	//忘记密码？
	public void forgetPW(){
		du.what(LoginLocator.forgetPW).click();
	}
	
}

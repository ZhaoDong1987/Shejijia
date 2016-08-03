package shejijia_pages;

import org.openqa.selenium.WebDriver;

import invoke.test.Do;
import shejijia_locators.HomeLocator;

public class HomePage {
	WebDriver driver;
	Do du;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		du = new Do(driver);
	}
	
	//获取测试地址
	public void getUrl(String url){
		driver.get(url);
		
	}

	//登录/注册
	public void clickRegist(){
		du.what(HomeLocator.register).click();
	}
	
	//找设计师
	public void clickFindDesigner(){
		du.what(HomeLocator.findDesigner).click();
		
	}
	
	//海量案例
	public void clickCaseIndex(){
		du.what(HomeLocator.caseBaseindex).click();;
	}
}

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
	
	//��ȡ���Ե�ַ
	public void getUrl(String url){
		driver.get(url);
		
	}

	//��¼/ע��
	public void clickRegist(){
		du.what(HomeLocator.register).click();
	}
	
	//�����ʦ
	public void clickFindDesigner(){
		du.what(HomeLocator.findDesigner).click();
		
	}
	
	//��������
	public void clickCaseIndex(){
		du.what(HomeLocator.caseBaseindex).click();;
	}
}

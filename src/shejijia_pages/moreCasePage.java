package shejijia_pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import invoke.test.Do;
import invoke.test.VerifyElement;
import shejijia_locators.FindDesignerLocator;
import shejijia_locators.moreCaseLocator;

public class moreCasePage {
	
	private WebDriver driver;
	private Do du;
	
	
	public moreCasePage(WebDriver driver){
		this.driver = driver;
		du = new Do(driver);
		
	}
	
	public List<String> getCaseindexData(){
		du = new Do(driver);
		List<String> caseDetail = new ArrayList<String>();
		List<WebElement> elements = du.whats(moreCaseLocator.caseDetails);
		for(WebElement element:elements){
			//System.out.println(element.getText());
			caseDetail.add(element.getText());
		}
		
		return caseDetail;
	}
	
	
}

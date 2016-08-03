package test_cases;

import org.testng.annotations.Test;

import invoke.test.Do;
import invoke.test.StartBrowser;
import shejijia_locators.HomeLocator;
import shejijia_locators.testAddress;
import shejijia_pages.FindDesignerPage;
import shejijia_pages.HomePage;
import shejijia_pages.moreCasePage;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class morCase_Case {
	WebDriver driver;
	HomePage homePage;
	FindDesignerPage designerPage;
	moreCasePage moreCasePage;
	Do du; 

	@BeforeMethod
	public void beforeMethod() {
		homePage = new HomePage(driver);
		StartBrowser browser = new StartBrowser();
		//driver = browser.FireFox_Browser(driver);
		driver = browser.Chrome_Browser(driver);
	}

	// 验证UAT环境数据与生产线数据是否一致
	@Test
	public void verifyMorecaseData() {
		homePage = new HomePage(driver);
		moreCasePage = new moreCasePage(driver);
		du = new Do(driver);
		homePage.getUrl(testAddress.uatUrl);
		du.waitForElementPresent(HomeLocator.caseBaseindex);
		homePage.clickCaseIndex();
		du.waitFor(3000);
		List<String> caseIndex_text = moreCasePage.getCaseindexData();
		List<String> caseIndex_text2 = moreCasePage.getCaseindexData();
		
		for (int i = 0; i<caseIndex_text.size();i++){
			
			System.out.println(caseIndex_text.get(i));
			System.out.println("---------------");
			System.out.println(caseIndex_text2.get(i));
			System.out.println("---------------");
			caseIndex_text.equals(caseIndex_text2);
			
		}
		//homePage.getUrl(testAddress.uatUrl);
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}

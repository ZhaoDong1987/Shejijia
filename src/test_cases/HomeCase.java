package test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import invoke.test.Do;
import invoke.test.StartBrowser;
import shejijia_locators.testAddress;
import shejijia_pages.FindDesignerPage;
import shejijia_pages.HomePage;

public class HomeCase {
	WebDriver driver;
	HomePage homePage;
	FindDesignerPage designerPage;
	Do du = new Do(driver);

	@BeforeMethod
	public void beforeMethod() {
		homePage = new HomePage(driver);
		StartBrowser browser = new StartBrowser();
		//driver = browser.FireFox_Browser(driver);
		driver = browser.Chrome_Browser(driver);
		homePage.getUrl(testAddress.uatUrl);
	}

	//��֤"�����ʦ"ҳ���Ƿ������򿪣���֤�㣺���ʦͷ��Ԫ���Ƿ�ɼ�
	@Test
	public void findDesigner() {
		homePage = new HomePage(driver);
		designerPage = new FindDesignerPage(driver);
		homePage.clickFindDesigner();
		du.waitFor(3000);
		Assert.assertEquals(true, designerPage.checkElements());
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}

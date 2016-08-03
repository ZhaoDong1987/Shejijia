package test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import invoke.test.Do;
import invoke.test.StartBrowser;
import shejijia_locators.testAddress;
import shejijia_pages.HomePage;
import shejijia_pages.LoginPage;

public class ForgetPassword {
	WebDriver driver;
	HomePage homePage;
	Do du = new Do(driver);

	@BeforeMethod
	public void beforeMethod() {
		homePage = new HomePage(driver);
		StartBrowser browser = new StartBrowser();
		driver = browser.Chrome_Browser(driver);
		homePage.getUrl(testAddress.uatUrl);
	}
	
	@Test
	public void forgetPassword() {
		homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		homePage.clickRegist();
		driver.switchTo().frame("logInOutFrame");
		loginPage.forgetPW();
	}
	
	@AfterMethod
	public void afterMethod() {
	}

}

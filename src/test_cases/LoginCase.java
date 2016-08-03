package test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import invoke.test.Do;
import invoke.test.StartBrowser;
import shejijia_locators.testAddress;
import shejijia_pages.HomePage;
import shejijia_pages.LoginPage;
import test_datum.LoginData;

public class LoginCase {

	WebDriver driver;
	Do du = new Do(driver);
	HomePage homePage;
	LoginPage loginPage;
	// VerifyElement verifyElement;

	@BeforeMethod
	public void beforeMethod() {
		homePage = new HomePage(driver);
		StartBrowser browser = new StartBrowser();
		driver = browser.Chrome_Browser(driver);
		homePage.getUrl(testAddress.uatUrl);
	}

	// 正向逻辑测试，输入正确的用户名密码，可以正常登录
	@Test
	public void login() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.clickRegist();
		driver.switchTo().frame("logInOutFrame");
		loginPage.getUserName(LoginData.userName);
		du.waitFor(2000);
		loginPage.getPW(LoginData.password);
		du.waitFor(2000);
		loginPage.clickBtn();
		du.waitFor(3000);

	}

	// 验证登录账号为空时，验证提示语"请输入账号"
	@Test
	public void VerifyPrompt4Login1() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.clickRegist();
		driver.switchTo().frame("logInOutFrame");
		loginPage.getUserName("");
		loginPage.getPW(LoginData.password);
		loginPage.clickBtn();
		du.waitFor(1000);
		Assert.assertEquals(true, loginPage.getTS("请输入账号"));
	}

	// 输入正确的未注册过的手机号，验证提示语"用户名不存在"
	@Test
	public void VerifyPrompt4Login2() {

		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.clickRegist();
		driver.switchTo().frame("logInOutFrame");
		loginPage.getUserName("18611896092");
		loginPage.getPW(LoginData.password);
		loginPage.clickBtn();
		du.waitFor(1000);
		Assert.assertEquals(true, loginPage.getTS("用户名不存在"));
	}

	// 输入错误格式的手机号，验证提示语"用户名不存在"
	@Test
	public void VerifyPrompt4Login3() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.clickRegist();
		driver.switchTo().frame("logInOutFrame");
		loginPage.getUserName("18!@test测试1234");
		loginPage.getPW(LoginData.password);
		loginPage.clickBtn();
		du.waitFor(1000);
		Assert.assertEquals(true, loginPage.getTS("用户名不存在"));

	}

	// 验证输入正确的用户名，错误的密码时,验证提示"您输入的账号和密码不匹配，请重新输入"
	@Test
	public void VerifyPrompt4Login4() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.clickRegist();
		driver.switchTo().frame("logInOutFrame");
		loginPage.getUserName(LoginData.userName);
		loginPage.getPW("123123");
		loginPage.clickBtn();
		du.waitFor(2000);
		Assert.assertEquals(true, loginPage.getTS("您输入的账号和密码不匹配，请重新输入"));
	}

	// 验证登录时输错2次后，第3次点立即登录时，弹出验证码
	@Test
	public void VerifyImgChcode4Login() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		// verifyElement = new VerifyElement(driver);
		homePage.clickRegist();
		driver.switchTo().frame("logInOutFrame");
		du.waitFor(1000);
		loginPage.clickBtn3();
		du.waitFor(3000);
		Assert.assertEquals(true, loginPage.isdisplayed());
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}

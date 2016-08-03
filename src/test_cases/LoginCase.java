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

	// �����߼����ԣ�������ȷ���û������룬����������¼
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

	// ��֤��¼�˺�Ϊ��ʱ����֤��ʾ��"�������˺�"
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
		Assert.assertEquals(true, loginPage.getTS("�������˺�"));
	}

	// ������ȷ��δע������ֻ��ţ���֤��ʾ��"�û���������"
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
		Assert.assertEquals(true, loginPage.getTS("�û���������"));
	}

	// ��������ʽ���ֻ��ţ���֤��ʾ��"�û���������"
	@Test
	public void VerifyPrompt4Login3() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.clickRegist();
		driver.switchTo().frame("logInOutFrame");
		loginPage.getUserName("18!@test����1234");
		loginPage.getPW(LoginData.password);
		loginPage.clickBtn();
		du.waitFor(1000);
		Assert.assertEquals(true, loginPage.getTS("�û���������"));

	}

	// ��֤������ȷ���û��������������ʱ,��֤��ʾ"��������˺ź����벻ƥ�䣬����������"
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
		Assert.assertEquals(true, loginPage.getTS("��������˺ź����벻ƥ�䣬����������"));
	}

	// ��֤��¼ʱ���2�κ󣬵�3�ε�������¼ʱ��������֤��
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

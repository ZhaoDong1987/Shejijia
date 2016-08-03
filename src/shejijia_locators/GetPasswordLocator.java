package shejijia_locators;

public interface GetPasswordLocator {

	// 账户名：（邮箱、手机号、用户名）
	String UserName = "//input[@id='member_account']";

	// 账户名输入框下方提示文字
	String UernameTS = "//span[@id='uusername']/font";

	// 验证码
	String ChCode = "//input[@id='chcode']";
	
	//验证码错误提示
	String ChCodeTS = "//span[@id='mmchcode']/font";
	
	// 下一步
	String NextStep = "//input[@value='下一步']";
	
	//验证身份，验证方式
	String Select = "//select[@id='renovationStylereq']";
	
	
}

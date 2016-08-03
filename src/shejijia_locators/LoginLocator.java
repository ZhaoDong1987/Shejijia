package shejijia_locators;

public interface LoginLocator {
	
	//登录名
	String UserName = "//input[@id='account']";
	
	//登录框下方的提示
	String UnameTS = "//span[@id='uusername']/font";
	
	//登录密码
	String password = "//input[@id='password']";
	
	//登录框下方的提示
	String pwordTS = "//span[@id='loginessdti']/font";
	
	//验证码输入框
	String inputChcode = "//input[@id='chcode']";
	
	//验证码图片
	String imgChcode = "//img[@id='check_code']";
	
	//立即登录
	String loginbtn = "//input[@value='立即登录']";
	
	//注册账号
	String regist = "//a[text()='注册账号']";
	
	//忘记密码
	String forgetPW = "//a[text()='忘记密码?']";
	
	//复选框-记住账号
	String remember = "//input[@id='input-remember']";
	
	//复选框-十天内免登录
	String rememberMe = "//input[@id='remberMe']";

}

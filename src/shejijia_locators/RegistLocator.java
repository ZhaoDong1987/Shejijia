package shejijia_locators;

public interface RegistLocator {
	
	//我是消费者
	String XFZ = "//input[@id='Like1']";
	
	//我是设计师
	String SJS = "//input[@id='Like2']";
	
	//手机注册
	String SJZC = "//a[text()='手机注册']";
	
	//邮箱注册
	String YXZC ="//a[text()='邮箱注册']";
	
	//手机号码输入框
	String MobileIn = "//input[@id='member_telephone']";
	
	//网页验证码
	String ChCode = "//input[@id='chcode']";
	
	//手机验证码
	String MoCode = "//input[@id='authNo']";
	
	//设置密码
	String setPassword = "//input[@id='password']";
	
	//确认密码
	String confirmPassword = "//input[@id='confirmPassword']";
	
	//勾选协议
	String TreatyBox = "//input[@id='Liku']";
	
	//注册按钮
	String RegistBtn = "//input[@id='registBtn']";
	
	//我已有账户 立即登录
	String BackLogin = "//a[@id='fanhui']";
	
	//居然之家注册协议
	String XieYi = "//a[text()='《居然之家注册协议》']";
	
	
}

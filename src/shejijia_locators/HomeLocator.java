package shejijia_locators;


public interface HomeLocator {
	
	//首页登录/注册
	String register = "//a[@id='register']";
	
	//首页logo图片
	String img_logo = "//img[@id='img-logo']";
	
	//首页案例搜索框
	String searchInput ="//input[@id='searchKeyWord']";
	
	//搜索按钮
	String searchBox = "//img[@id='searchbox']";
	
	//首页
	String Home = "//a[@id='indexSrc']";
	
	//海量案例
	String caseBaseindex = "//a[text()='海量案例']";
	
	//找设计师海
	String findDesigner = "//a[text()='找设计师']";
	
	//居然在线
	String JRZX = "//a[text()='居然在线']";
	
	//查看更多案例
	String CKGDAL = "//div[@id='morecaselibrarys']/a";
	
}

package shejijia_locators;

//海量案例页面元素路径
public interface moreCaseLocator {
	
	//案例列表的每个案例信息，（中式丨二室丨m²）
	String caseDetails = "//span[contains(text(),'m²')]/parent::node()";
	
	

}

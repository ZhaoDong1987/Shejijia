package shejijia_locators;

public interface GetPasswordLocator {

	// �˻����������䡢�ֻ��š��û�����
	String UserName = "//input[@id='member_account']";

	// �˻���������·���ʾ����
	String UernameTS = "//span[@id='uusername']/font";

	// ��֤��
	String ChCode = "//input[@id='chcode']";
	
	//��֤�������ʾ
	String ChCodeTS = "//span[@id='mmchcode']/font";
	
	// ��һ��
	String NextStep = "//input[@value='��һ��']";
	
	//��֤��ݣ���֤��ʽ
	String Select = "//select[@id='renovationStylereq']";
	
	
}

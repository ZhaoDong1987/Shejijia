package shejijia_locators;

public interface LoginLocator {
	
	//��¼��
	String UserName = "//input[@id='account']";
	
	//��¼���·�����ʾ
	String UnameTS = "//span[@id='uusername']/font";
	
	//��¼����
	String password = "//input[@id='password']";
	
	//��¼���·�����ʾ
	String pwordTS = "//span[@id='loginessdti']/font";
	
	//��֤�������
	String inputChcode = "//input[@id='chcode']";
	
	//��֤��ͼƬ
	String imgChcode = "//img[@id='check_code']";
	
	//������¼
	String loginbtn = "//input[@value='������¼']";
	
	//ע���˺�
	String regist = "//a[text()='ע���˺�']";
	
	//��������
	String forgetPW = "//a[text()='��������?']";
	
	//��ѡ��-��ס�˺�
	String remember = "//input[@id='input-remember']";
	
	//��ѡ��-ʮ�������¼
	String rememberMe = "//input[@id='remberMe']";

}

package invoke.test;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class Switch {
	WebDriver driver;
	
	public Switch(WebDriver driver){
		this.driver = driver;
	}
	
	public void swichForTitle(String partialTitleName){
		Set<String> handles = driver.getWindowHandles();
		String titlename;
		for(String handle:handles){
			titlename = driver.switchTo().window(handle).getTitle();
			if(titlename.contains(partialTitleName)){
				break;
			}
		}
	}
	
	public void swichForIndex(int handleNo){
		//�������飬���д��ڵľ���� 
		String[] handles = new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handles);
		//���ݾ���л��������л��Ĵ���
		driver.switchTo().window(handles[handleNo]);
	}
}

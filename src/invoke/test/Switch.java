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
		//定义数组，所有窗口的句柄； 
		String[] handles = new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handles);
		//根据句柄切换至你想切换的窗口
		driver.switchTo().window(handles[handleNo]);
	}
}

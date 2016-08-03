package invoke.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import invoke.test.Wait;

public class Test4 {
	private static DesiredCapabilities caps = null;
	private static String projectpath = System.getProperty("user.dir");
			
			
	public static void main(String[] args){
		caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, false);
		caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
		caps.setCapability("ignoreZoomSetting", true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//(1)打开火狐浏览器的driver存放路径
		//System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		//(2)打开谷歌浏览器的driver存放路径
		//System.setProperty("webdriver.chrome.driver","D:\\zhaodong\\installation\\Eclipse\\test\\tool\\chromedriver.exe");
		
		//(3)打开ie浏览器的driver存放路径
		System.out.println(projectpath);
		System.setProperty("webdriver.ie.driver",projectpath+"/tool/IEDriverServer.exe");
		
		System.out.println("srart selenium");
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		WebDriver iedriver = new InternetExplorerDriver(caps);
		
		iedriver.get("http://www.baidu.com/");
		//iedriver.get("javascript:document.getElementById('overridelink').click();");
		Wait wait = new Wait(iedriver); 
		//鼠标悬停
		Actions action = new Actions(iedriver);
		//action.clickAndHold(driver.findElement(By.linkText("设置"))).perform();
		
		action.moveToElement(iedriver.findElement(By.linkText("设置"))).perform();
		
		iedriver.findElement(By.linkText("高级搜索")).click();
		wait.waitFor(3000);
		//driver.findElement(By.name("")).click();
		Select select = new Select(iedriver.findElement(By.xpath("//select[@name='gpc']")));
		wait.waitFor(3000);
		select.selectByVisibleText("最近一周");
		wait.waitFor(3000);
		System.out.println("测试成功！");
		iedriver.quit();
	}
}
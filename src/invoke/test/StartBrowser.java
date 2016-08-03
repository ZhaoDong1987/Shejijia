package invoke.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartBrowser {
	private static DesiredCapabilities caps = null;
	private static String projectpath = System.getProperty("user.dir");
	private Point point;
	private Dimension dimension;
	private WebDriver driver;
	
	// (1)打开ie浏览器
	public WebDriver IE_Browser(WebDriver IEdriver) {
		driver = IEdriver;
		caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, false);
		caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
		caps.setCapability("ignoreZoomSetting", true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		// (3)打开ie浏览器的driver存放路径
		System.out.println(projectpath);
		System.setProperty("webdriver.ie.driver", projectpath + "/tool/IEDriverServer.exe");
		System.out.println("srart selenium");
		driver = new InternetExplorerDriver(caps);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
	}
	
	// (2)打开谷歌浏览器
	public  WebDriver Chrome_Browser(WebDriver CHdriver) {
		// 谷歌浏览器的driver存放路径
		driver = CHdriver;
		System.setProperty("webdriver.chrome.driver", projectpath + "/tool/chromedriver.exe");
		driver = new ChromeDriver();
		setBrowserSize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	
	// (3)打开火狐浏览器
	public WebDriver FireFox_Browser(WebDriver FFdriver) {
		// (3)打开火狐浏览器的driver存放路径                 
		driver = FFdriver;
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		caps = DesiredCapabilities.firefox();
		caps.setCapability("marionette", true);
		driver = new FirefoxDriver(caps);
		setBrowserSize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public void setBrowserSize(){
		point = new Point(-5, -5);
		dimension = new Dimension(1400, 1056);
		driver.manage().window().setPosition(point);
		driver.manage().window().setSize(dimension);
	}
	
}
package invoke.test;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;
import invoke.test.StartBrowser;
import invoke.test.Wait;

public class Capture {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = null ;
		Wait wait = new Wait(driver);
		driver = new StartBrowser().Chrome_Browser(driver);
		driver.get("http://www.yorhome.com/register/newlogin");
		wait.waitFor(2000);
		WebElement element = driver.findElement(By.xpath("//img[@id='imgjiaoyan']"));
		//���ý�ͼ���ܣ��ѷ��صĽ�ͼ���浽����
		FileUtils.copyFile(captureElement(element), new File("D:\\zhaodong\\picture\\p1.jpg"));
		driver.quit();
	}

	public static File captureElement(WebElement element) throws Exception {
		WrapsDriver wrapsDriver = (WrapsDriver) element;
		//��ȡ����ҳ��
		File screen = ((TakesScreenshot) wrapsDriver
				.getWrappedDriver())
				.getScreenshotAs(OutputType.FILE);
		BufferedImage img = ImageIO.read(screen);
		// ���Ԫ�صĸ߶ȺͿ��
		int width = element.getSize().width;
		int height = element.getSize().height;
		// ����һ������ʹ������ĸ߶ȣ��Ϳ��
		Rectangle rect = new Rectangle(width, height);
		// �õ�Ԫ�ص�����
		Point p = element.getLocation();
		BufferedImage desk = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);
		//��Ϊjpg��ʽ
		ImageIO.write(desk, "jpg", screen);
		//FileUtils.copyFile(screen, new File("D:\\zhaodong\\picture\\baidu1.jpg"));
		return screen;
	
	}
}

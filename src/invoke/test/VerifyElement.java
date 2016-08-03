package invoke.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyElement {

	WebDriver driver;
	Do du = new Do(driver);

	public VerifyElement(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isdisplayed(String xpath) {
		try {

			boolean bl = driver.findElement(By.xpath(xpath)).isDisplayed();
			if (bl == true) {
				//System.out.println(bl);
				System.out.println("元素属性可见！");
				System.out.println("------------------------------------");
				return true;
			}

			else {
				System.out.println(bl);
				System.out.println(xpath + "的元素属性不可见！");
				return false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(xpath + "元素不存在！");
			System.out.println("------------------------------------");
			return false;
		}
		
	}

	public boolean isElementPresent(String xpath) {
		try {
			return	driver.findElement(By.xpath(xpath)).isDisplayed();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean ElementsIsDisplayed(String xpath){
		try {
				
			List<WebElement> elements = driver.findElements(By.xpath(xpath));
				for(WebElement element:elements){
					element.isDisplayed();
					
				}
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean verifyText(String xpath,String text){
		String getText = driver.findElement(By.xpath(xpath)).getText();
		if (getText.equals(text)) {
			return true;
		}
		else {
			System.out.println("元素中取得的文本是： "+getText);
			return false;
		}
	}
	
	
	public void isElementExsit(String locator) {
		boolean flag;
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			flag = null != element;

		} catch (NoSuchElementException e) {
			System.out.println("Element:" + locator.toString() + " is not exsit!");
			flag = false;
		}
		System.out.println(flag);
		// return flag;

	}

}

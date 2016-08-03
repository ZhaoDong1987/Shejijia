package invoke.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {

	private String locator;
	private WebDriver driver;

	/**
	 * ����ʼ�������Ϊdriver��table�Ķ�λ��ʹ��xpath���·���ķ�ʽ��λtable
	 * 
	 * @param dr
	 * @param locator
	 */
	public Table(WebDriver dr, String locator) {
		this.driver = dr;
		this.locator = locator;
	}

	/**
	 * �����������꣬ȡ��Ԫ��������ݣ�����Ͳ�������1��ʼ����
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	public String getCellText(int row, int col) {
		// ƴ�ӵ�Ԫ���·��
		String xpath = locator + "/tr[" + row + "]/td[" + col + "]"+"/a";
		WebElement cell = driver.findElement(By.xpath(xpath));
		return cell.getText();
	}

	public void click_btn(int row,int col){
		String xpath2 = locator + "/tr[" + row + "]/td[" + col + "]"+"/a";
		WebElement cell = driver.findElement(By.xpath(xpath2));
		cell.click();
	}
}

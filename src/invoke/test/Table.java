package invoke.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {

	private String locator;
	private WebDriver driver;

	/**
	 * 表格初始化，入参为driver和table的定位，使用xpath相对路径的方式定位table
	 * 
	 * @param dr
	 * @param locator
	 */
	public Table(WebDriver dr, String locator) {
		this.driver = dr;
		this.locator = locator;
	}

	/**
	 * 根据行列坐标，取单元格里的内容，标题和操作区从1开始计算
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	public String getCellText(int row, int col) {
		// 拼接单元格的路径
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

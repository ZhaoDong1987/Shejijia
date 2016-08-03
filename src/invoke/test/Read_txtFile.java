package invoke.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Read_txtFile {

	// 读取TXT中的文件
	public List<String> getTestData(String path) {
		List<String> txtList = new ArrayList<String>(); // 用来保存数据
		File file = new File(path);
		String line;
		try {
			// 一般用这编码读就可以了
			if (file.isFile() && file.exists()) {

				BufferedReader br = new BufferedReader(new FileReader(file));
				br.readLine();// 跳过表头如果需要表头的话，不要写这句。

				while ((line = br.readLine()) != null) { // 逐行读入除表头的数据
					String fileCity = line;
					fileCity = fileCity.trim();// 去掉首尾的空格
					txtList.add(fileCity);
				}

				br.close();
			}

			else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception ex) {
			System.out.println("读取文件内容出错");
			ex.printStackTrace();
		}

		return txtList;
	}

}

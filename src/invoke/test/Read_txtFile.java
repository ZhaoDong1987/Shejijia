package invoke.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Read_txtFile {

	// ��ȡTXT�е��ļ�
	public List<String> getTestData(String path) {
		List<String> txtList = new ArrayList<String>(); // ������������
		File file = new File(path);
		String line;
		try {
			// һ�����������Ϳ�����
			if (file.isFile() && file.exists()) {

				BufferedReader br = new BufferedReader(new FileReader(file));
				br.readLine();// ������ͷ�����Ҫ��ͷ�Ļ�����Ҫд��䡣

				while ((line = br.readLine()) != null) { // ���ж������ͷ������
					String fileCity = line;
					fileCity = fileCity.trim();// ȥ����β�Ŀո�
					txtList.add(fileCity);
				}

				br.close();
			}

			else {
				System.out.println("�Ҳ���ָ�����ļ�");
			}
		} catch (Exception ex) {
			System.out.println("��ȡ�ļ����ݳ���");
			ex.printStackTrace();
		}

		return txtList;
	}

}

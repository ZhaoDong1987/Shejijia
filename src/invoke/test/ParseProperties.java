package invoke.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ParseProperties {
	private Properties pro = new Properties();
	
	public ParseProperties(String propertiespath){
		this.loadProperties(propertiespath);
	}
	
	private void loadProperties(String propertiespath){
		try {
			InputStream in = new FileInputStream(propertiespath);
			pro.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getTestData(String keyname){
		return pro.getProperty(keyname).trim();
	}
}

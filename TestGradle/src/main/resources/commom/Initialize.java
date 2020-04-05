package commom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.Environment;
import com.Testdemo;

public class Initialize {
	private WebApp webapp;

	private static String currentDir = System.getProperty("user.dir");
	private static String configFile = Initialize.currentDir + "/" + "resources/config.properties";

	public WebApp load() {
		
		 Properties testdataProperties= new Properties();
		 try {
			testdataProperties.load(new FileInputStream(Initialize.configFile));
			Environment.getInstance(testdataProperties, currentDir);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
		
		
		return webapp;
	}
}

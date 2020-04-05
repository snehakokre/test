import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import commom.PageData;

public class Testdemo {

	 private static String currentDir = System.getProperty("user.dir");
	private static String configFile = Testdemo.currentDir + "/" + "src/test/resources/PageObject.json";

	public static void main(String[] args) {
	

		/*	 Properties testdataProperties= new Properties();
				
				testdataProperties.load(new FileInputStream(Testdemo.configFile));
				Environment.getInstance(testdataProperties, currentDir);
				System.out.println("va;uess**************");
				System.out.println(Environment.getDriverPath());
				System.out.println(Environment.getBrowser());
			*/	
			PageData pg= PageData.pagedatatest(configFile);
			
			 
		 System.out.println(pg.getWebsite());
		  
	}
}

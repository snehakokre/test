package com;
import java.io.FileInputStream;
import com.Environment;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testdemo {

	private static String currentDir = System.getProperty("user.dir");
	private static String configFile = Testdemo.currentDir + "/" + "src/test/resources/PageObject.properties";

	public static void main(String[] args) {
	
		 try {
			 Properties testdataProperties= new Properties();
				
				testdataProperties.load(new FileInputStream(Testdemo.configFile));
			
				
				testdataProperties.getProperty("search");
				
				
			} catch (FileNotFoundException e) {
				System.out.println("file not found");
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		  
	}
}

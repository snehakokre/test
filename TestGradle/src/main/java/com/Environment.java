package com;
import java.util.Properties;

public class Environment {
	
	private static String browser;
	private static String driverPath;
	
	private static Environment environment=null;
	
	
	
	public Environment() {
		
	}
	
	
	public Environment(final Properties propf, final String currentdir) {
		System.out.println("here1");
		System.out.println(propf.getProperty("browser"));
		Environment.setDriverPath(currentdir+propf.getProperty("driverPath"));
		Environment.setBrowser(propf.getProperty("browser"));
	}
	public static Environment getInstance(final Properties propf, final String currentdir) {
		if(environment==null) {
			environment= new Environment(propf, currentdir);
		}
		return environment;
	}// use to make singleton class and make only one instance visible to all 
	
	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		Environment.browser = browser;
	}

	public static String getDriverPath() {
		return driverPath;
	}

	public static void setDriverPath(String driverPath) {
		Environment.driverPath = driverPath;
	}

	
	
	
}

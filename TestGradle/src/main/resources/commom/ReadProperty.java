package commom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ReadProperty {
	Properties prop;
	
	public ReadProperty() {
	}
	
	public ReadProperty(final String filepath) {
	
		try {
			this.prop= new Properties();
			prop.load(new FileInputStream(filepath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getValue(String key) {
		
		return this.prop.getProperty(key);
	}

}

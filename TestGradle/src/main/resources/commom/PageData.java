package commom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.google.gson.GsonBuilder;

public class PageData {
	static PageData pagedata =null;
	
	public String website;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	 private PageData type=null;
		
	public static PageData pagedatatest(String dataPropertiesFile) {
		 final GsonBuilder gson = new GsonBuilder();// for reading json and converting it 
		  PageData jsonObj= null;
	        Reader reader;
			try {
				reader = new FileReader(dataPropertiesFile);
				  BufferedReader jsonData = new BufferedReader(reader);
			      jsonObj = gson.create().fromJson(jsonData,PageData.class);
			          
			        
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return jsonObj;    
	        
	}

}

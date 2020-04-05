package commom;

public enum PageObject {
	search("","");
	
	private String xpath;
	public String getXpath() {
		return xpath;
	}
	public void setXpath(String xpath) {
		this.xpath = xpath;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	private String key;
	
	 PageObject() {
	}
	 PageObject(String xpath, String key){
		 this.xpath=xpath;
		 this.key=key;
	 }
	 
	 
	

}

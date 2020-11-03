package com.demo.bean;

public class TextAndImageNote extends Note{
	
	public TextAndImageNote(String text) {
		super(text);
	}

	private String url;
	
	//Parameterized Constructor
	public TextAndImageNote(String text, String url) {
		super(text);
		this.url = url;
	}
	
	//Getter Method
	public String getUrl() {
		return url;
	}
	//Setter Method
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}

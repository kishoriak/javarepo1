package com.demo.bean;

public class TextAndImageNote extends TextNote{
	private String url;
	
	//default constructor
	public TextAndImageNote() {
		super();
	}
	
	//parametarized
	public TextAndImageNote(String txt,String url) {
		super(txt);
		this.url = url;
	}
	
	//setter and getters
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	//toString
	@Override
	public String toString() {
		return "TextAndImageNote"+super.toString()+" [url=" + url + "]";
	}
	
	
}

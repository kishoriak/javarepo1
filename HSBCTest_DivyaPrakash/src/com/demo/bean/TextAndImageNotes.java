package com.demo.bean;

public class TextAndImageNotes {
	private String text;
	private String url;
	public TextAndImageNotes(String text, String url) {
		super();
		this.text = text;
		this.url = url;
	}
	public TextAndImageNotes() {
		super();
	}
	//Declared but used
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "TextAndImageNotes : [text=" + text + ", url=" + url + "]\n";
	}
	
}

package com.hsbc.exam;

// Creating class to store both text and Image Task 1
public class TextAndImageNote{
	private String text;
	private String url;
	
	//default constructor
	public TextAndImageNote() {
		
	}
	// constructor using fields
	public TextAndImageNote(String text,String url) {
		this();
		this.text = text;
		this.url = url;
	}
	@Override
	public String toString() {
		return "TextAndImageNote [text=" + text + ", url=" + url + "]";
	}
	
	
}

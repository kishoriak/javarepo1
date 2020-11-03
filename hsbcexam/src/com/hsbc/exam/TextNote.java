package com.hsbc.exam;

public class TextNote {
	private String text;
	
	public TextNote() {
		
	}
	
	public TextNote(String text) {
		this();
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextNote [text=" + text + "]";
	}
	
}

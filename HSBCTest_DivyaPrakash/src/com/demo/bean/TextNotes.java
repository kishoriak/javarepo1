package com.demo.bean;

public class TextNotes {
	private String text;

	public TextNotes() {
		super();
	}

	public TextNotes(String text) {
		super();
		this.text = text;
	}
	//Declared but not used
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextNotes : [text=" + text + "]\n";
	}
	
}

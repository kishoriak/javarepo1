package com.demo.bean;

public class TextNote {
	protected String textNote;

	public TextNote() {
		super();
	}
	
	public TextNote(String textNote) {
		super();
		this.textNote = textNote;
	}
	//getter and setter methods
	public String getTextNote() {
		return textNote;
	}

	public void setTextNote(String textNote) {
		this.textNote = textNote;
	}

	@Override
	public String toString() {
		return "TextNote : "  + textNote ;
	}
	
}

package com.demo.bean;

public class TextNote {
	private String text_note;
	
	//default constructor
	public TextNote() {
		super();
	}
	
	//parameterized constructor
	public TextNote(String text_note) {
		this.text_note = text_note;
	}

	//setter and getters
	public String getText_note() {
		return text_note;
	}
	
	//
	public void setText_note(String text_note) {
		this.text_note = text_note;
	}

	//toString
	@Override
	public String toString() {
		return "TextNote [text_note=" + text_note + "]";
	}

	
	
}

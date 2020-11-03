package com.exam.bean;

public class TextNote {
	private String text;

	public TextNote() {
		super();
	}

	public TextNote(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextNote [text=" + text + "]";
	}

	
	
	
}

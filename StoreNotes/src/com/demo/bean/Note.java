package com.demo.bean;

public abstract class Note {
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Note [text=" + text + "]";
	}

	public Note(String text) {
		super();
		this.text = text;
	}
	
	
}

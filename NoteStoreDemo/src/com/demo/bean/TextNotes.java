package com.demo.bean;

public class TextNotes {
	private String note;

	public TextNotes() {
		super();
	}

	public TextNotes(String note) {
		super();
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "TextNotes [note=" + note + "]";
	}
	
	

}

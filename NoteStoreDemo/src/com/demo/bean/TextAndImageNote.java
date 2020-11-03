package com.demo.bean;

public class TextAndImageNote {
	private String note;
	private String url;
	public TextAndImageNote() {
		super();
	}
	public TextAndImageNote(String note, String url) {
		super();
		this.note = note;
		this.url = url;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "TextAndImageNote [note=" + note + ", url=" + url + "]";
	}
	
	

}

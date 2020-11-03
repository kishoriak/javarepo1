package com.exam.bean;

public class TextAndImageNote extends TextNote{
	
	private String url;

	public TextAndImageNote() {
		super();
	}

	public TextAndImageNote(String text, String url) {
		super(text);
		this.url = url;
	}
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "TextAndImageNote"+super.toString()+ "[url=" + url + "]";
	}


	
	
}

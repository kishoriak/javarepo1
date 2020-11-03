package com.demo.bean;

public class TextAndImageNote extends TextNote {
	private String url;

	//Default Constructor
	public TextAndImageNote() {
		super();
	}

	//Parameterized Constructor
	public TextAndImageNote(String note, String url) {
		super(note);
		this.url = url;
	}

	//Getter and Setter Method
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	//To String method for print 
	@Override
	public String toString() {
		return super.toString()+ url ;
	}
	
	
	
	

}

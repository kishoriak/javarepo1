package com.demo.bean;

public class TextAndImageNote extends TextNote{
	
	private String imageUrl;
	//default constructor

	public TextAndImageNote() {
		super();
	}
	//parameterized constructor
	public TextAndImageNote(String textNote,String imageUrl) {
		super(textNote);
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		super.toString();
		return "Image Url : "+ imageUrl + "\nText Note :" + textNote;
	}
	
	
	
}

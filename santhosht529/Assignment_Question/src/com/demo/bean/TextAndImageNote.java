package com.demo.bean;

import java.net.URL;

public class TextAndImageNote extends Note{
	
	private String imageurl;
	//default constructor
	public TextAndImageNote() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parametrized constructor
	public TextAndImageNote(String text, String url) {
		super(text);
		this.imageurl = url;
	}
	//getter and setter methods
	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	@Override
	public String toString() {
		return  super.toString()+ "| its image url :" + imageurl + "\n";
	}
	
	
	

}

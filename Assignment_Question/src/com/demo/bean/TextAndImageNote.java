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
	public TextAndImageNote(String imageurl, String url) {
		super();
		this.imageurl = imageurl;
	}
	//getter and setter methods
	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	// to string method
	@Override
	public String toString() {
		return "TextAndImageNote [imageurl=" + imageurl + "]";
	}
	
	

}

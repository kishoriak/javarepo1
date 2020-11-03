package com.demo.bean;

public class Note {

	private String MyNotes;
	//default Constructor
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parametrized Constructor
	public Note(String myNotes) {
		super();
		MyNotes = myNotes;
	}
	//getter and setter methods
	public String getMyNotes() {
		return MyNotes;
	}

	public void setMyNotes(String myNotes) {
		MyNotes = myNotes;
	}
	
	
	//to-string method to display
	@Override
	public String toString() {
		return " " + MyNotes + "]";
	}

	
	
	
	
}

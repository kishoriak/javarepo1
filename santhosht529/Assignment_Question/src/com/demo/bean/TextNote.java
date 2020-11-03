package com.demo.bean;

public class TextNote extends Note{
	
	// default constructor
	public TextNote() {
		super();
		// TODO Auto-generated constructor stub
	}
	// parametrized contrictor
	public TextNote(String myNotes) {
		super(myNotes);
		// TODO Auto-generated constructor stub
	}
	//to-string method to display
	@Override
	public String toString() {
		return  super.toString() +"\n";
	}
	
	

}

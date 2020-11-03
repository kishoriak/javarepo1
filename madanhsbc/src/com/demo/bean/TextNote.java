package com.demo.bean;

public class TextNote {
	private String textnote;

	//Default Constructor
	public TextNote() {
	}

	//Parameterized Constructor
	public TextNote(String textnote) {
		this.textnote = textnote;
	}

	//Getter and Setter Method
	public String getTextnote() {
		return textnote;
	}

	public void setTextnote(String textnote) {
		this.textnote = textnote;
	}

	//To String method for print 
	@Override
	public String toString() {
		return textnote ;
	}
	
	
	
}

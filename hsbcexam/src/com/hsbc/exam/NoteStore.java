package com.hsbc.exam;

import java.util.ArrayList;

//defining class NoteStore Task 2

public class NoteStore {
	ArrayList<TextNote> tlist = new ArrayList<TextNote>();
	ArrayList<TextAndImageNote> timlist = new ArrayList<TextAndImageNote>();

	public NoteStore() {
		
	}
	
//

	//methods to store information in Text Note and TextandImage Note
	
	public void storeNote(TextNote textnote) {
		tlist.add(textnote);
	}
	
	public void storeNote(TextAndImageNote textimgnote) {
		timlist.add(textimgnote);
	}
	
	public ArrayList<TextNote> getAllTextNotes() {
		return tlist;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return timlist;
	}


	
}

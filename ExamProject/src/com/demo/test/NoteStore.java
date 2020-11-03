package com.demo.test;

import java.util.ArrayList;

public class NoteStore {
	private ArrayList<TextNote> listText = new ArrayList<>();
	private ArrayList<TextAndImageNote> listTextImage = new ArrayList<>();

	public void storeNote(String note) {
		TextNote noteObj = new TextNote(note);
		listText.add(noteObj);
		System.out.println("Note added successfully");
	}

	public void storeNote(String note, String url) {
		TextAndImageNote noteObj = new TextAndImageNote(note, url);
		listTextImage.add(noteObj);
		System.out.println("Note added successfully");
	}
	
	public ArrayList<TextNote> getAllTextNotes() {
		return listText;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return listTextImage;
	}
}
package com.demo.dao;

import java.util.ArrayList;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;

public class NoteStore implements NoteStoreInterface{
	private static ArrayList<TextNote> arr = new ArrayList<TextNote>();

	//@Override
	public boolean storeNote(String textNote) {
		// TODO Auto-generated method stub
		arr.add(new TextNote(textNote));
		return true;
	}
	
	//@Override
	public boolean storeNote(String textNote, String urlImage) {
		// TODO Auto-generated method stub
		arr.add(new TextAndImageNote(textNote,urlImage));
		return false;
	}
	
	//@Override
	public ArrayList<TextNote> getAllTextNotes() {
		// TODO Auto-generated method stub
		ArrayList<TextNote> result = new ArrayList<TextNote>();
		for(TextNote a : arr) {
			if(a instanceof TextNote && !(a instanceof TextAndImageNote)) {
				result.add(a);
			}
		}
		return result;
	}

	//@Override
	public ArrayList<TextNote> getAllTextAndImageNotes() {
		// TODO Auto-generated method stub
		ArrayList<TextNote> result = new ArrayList<TextNote>();
		for(TextNote a : arr) {
			if(a instanceof TextAndImageNote) {
				result.add(a);
			}
		}
		return result;
	}
		
	
	
	
	
}

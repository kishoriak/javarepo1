package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;

public class NoteStoreImpl implements NoteStore{
	private static List<TextNote> plist1;
	private static List<TextAndImageNote> plist2;
	static {
		plist1=new ArrayList<>();	//for text notes 
		plist2=new ArrayList<>();	//for text with images
	}
	
	// store notes
	@Override
	public void storeNote(String msg, String url) {
		if(url.equals(" ")){
			plist1.add(new TextNote(msg));
		}
		else {
			plist2.add(new TextAndImageNote(msg,url));
		}
		
	}
	
	//get all text notes
	@Override
	public List<TextNote> getAllTextNotes() {
		return plist1;
	}
	
	//get all the text and Image notes
	@Override
	public List<TextAndImageNote> getAllTextAndImageNotes() {
		return plist2;
	
	
}
}

package com.demo.dao;

import java.util.List;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;

public interface NoteStore {
	
	void storeNote(String msg, String url);
	
	List<TextNote> getAllTextNotes();
	
	List<TextAndImageNote> getAllTextAndImageNotes();
	
}

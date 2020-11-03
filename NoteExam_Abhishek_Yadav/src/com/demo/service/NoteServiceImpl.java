package com.demo.service;

import java.util.List;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;
import com.demo.dao.NoteStore;
import com.demo.dao.NoteStoreImpl;

public class NoteServiceImpl implements NoteService {
	private NoteStore noteStore;
	
	//constructor
	public NoteServiceImpl() {
		noteStore=new NoteStoreImpl();
	}
	
	//add text note
	@Override
	public void addTextNote() {
		String url =" ";
		noteStore.storeNote("TEXT NOTE EXAMPLE",url);
		
	}
	
	//get all text notes
	@Override
	public List<TextNote> getAllTextNotes() {
		return noteStore.getAllTextNotes();
	}
	
	//get all text and images notes
	@Override
	public List<TextAndImageNote> getAllTextAndImageNotes() {
		return noteStore.getAllTextAndImageNotes();
	}

	//add text with image url
	@Override
	public void addTextImageNote() {
		noteStore.storeNote("TEXT WITH IMAGE EXAMPLE","\\URL HERE\\");
		
	}
	

}

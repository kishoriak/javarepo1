package com.demo.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.bean.TextNote;

public interface NoteStoreInterface {
	boolean storeNote(String textNote);
	ArrayList<TextNote> getAllTextNotes();
	ArrayList<TextNote> getAllTextAndImageNotes();
	boolean storeNote(String textNote, String urlImage);
	
}

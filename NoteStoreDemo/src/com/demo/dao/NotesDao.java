package com.demo.dao;

import java.util.List;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNotes;

public interface NotesDao {

	void storeNote(TextAndImageNote n);

	List<TextNotes> getAllTextNotes();

	List<TextAndImageNote> getAllTextAndImageNotes();

	void storeNoteWithoutUrl(TextNotes n);

}

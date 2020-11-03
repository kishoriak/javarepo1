package com.demo.service;

import java.util.List;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNotes;

public interface NotesService {

	void storeNote();

	List<TextNotes> displayTextNotes();

	List<TextAndImageNote> displayTextAndImageNotes();

	void storeNoteWithoutUrl();

}

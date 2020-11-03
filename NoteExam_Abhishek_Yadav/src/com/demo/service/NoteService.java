package com.demo.service;

import java.util.List;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;

public interface NoteService {

	void addTextNote();

	List<TextNote> getAllTextNotes();

	List<TextAndImageNote> getAllTextAndImageNotes();

	void addTextImageNote();

}

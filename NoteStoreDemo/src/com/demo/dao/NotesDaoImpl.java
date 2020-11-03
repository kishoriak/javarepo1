package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNotes;

public class NotesDaoImpl implements NotesDao{
	static List<TextNotes> textlist;
	static List<TextAndImageNote> textandimagelist;
	static {
		textlist=new ArrayList<>();
		textlist.add(new TextNotes("Hello, how are you?"));
		textlist.add(new TextNotes("I am good."));
		textandimagelist=new ArrayList<>();
		textandimagelist.add(new TextAndImageNote("Hello, how are you?","www.abc.com"));
		textandimagelist.add(new TextAndImageNote("I am good.","www.cgd.com"));
	}
	@Override
	public void storeNote(TextAndImageNote n) {
		textandimagelist.add(n);
	}
	@Override
	public List<TextNotes> getAllTextNotes() {
		return textlist;
}
	@Override
	public List<TextAndImageNote> getAllTextAndImageNotes() {
		return textandimagelist;
	}
}

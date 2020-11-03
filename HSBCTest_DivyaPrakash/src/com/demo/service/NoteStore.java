package com.demo.service;
import java.util.*;

import com.demo.bean.TextAndImageNotes;
import com.demo.bean.TextNotes;
public class NoteStore {
	static List<TextNotes> tnotes;
	static List<TextAndImageNotes> tinotes;
	//Static Block
	static {
		tnotes = new ArrayList<>();
		tinotes = new ArrayList<>();
	}
	//To Store Text Notes
	public void storeTextNote(TextNotes t) {
		tnotes.add(t);
	}
	//To Store Image Notes
	public void storeTextandImageNote(TextAndImageNotes ti) {
		tinotes.add(ti);
	}
	//To return all Text Notes
	public List<TextNotes> getAllTextNotes() {
		return tnotes;
	}
	//To return all Image Notes
	public List<TextAndImageNotes> getAllTextAndImageNotes() {
		return tinotes;
	}
}

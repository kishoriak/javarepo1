package com.demo.dao;

import com.demo.bean.Note;
import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteStore {
	
	private static List<TextAndImageNote> tailist;
	private static List<TextNote> tlist;
	
	//Creating List for TextNote
	static {
		tlist=new ArrayList<>();
		tlist.add(new TextNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems"));
		tlist.add(new TextNote("Few books to read - Ikigai, How to win friends and influence people"));
	}
	//Creating list for Text And Image Notes 
	static {
		tailist=new ArrayList<>();
		tailist.add(new TextAndImageNote("The shopping list on my fridge","//foo/bar1/bar2/imgset1.jpg"));
		tailist.add(new TextAndImageNote("The size label of Jack's shirt","//foo/bar1/bar2/ingset2.jpg"));
	}
	
	//Adding Text Note
	public void storeNote(String text) {
		TextNote t=new TextNote(text);
		tlist.add(t);
	}
	//Adding Text And image note
	public void storeNote(String text,String url) {
		TextAndImageNote tai=new TextAndImageNote(text,url);
		tailist.add(tai);
	}
	//Displaying Text Notes
	public List<TextNote> getAllTextNotes() {
		return tlist;
	}
	//Displaying Text And Imaging Notes
	public List<TextAndImageNote> getAllTextAndImageNotes(){
		return tailist;
	}

}

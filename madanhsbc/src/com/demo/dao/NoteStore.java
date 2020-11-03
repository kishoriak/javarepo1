package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;

public class NoteStore {
	private static List<TextNote> textlist;
	private static List<TextNote> imagelist;
	
	//Static Block for Initializatio Static Member
	static {
		textlist=new ArrayList<>();
		imagelist=new ArrayList<>();
		textlist.add(new TextNote("Java is a set of Computer softwareand specifications developed by James Gosling at Sun Microsystems"));
		textlist.add(new TextNote("Few Books to Read"));
		imagelist.add(new TextAndImageNote("The Shopping list on my Fridge", "//foo/bar1/bar2/imageset1.jpg"));
		imagelist.add(new TextAndImageNote("The size label of Jack's Shirt", "//foo/bar1/bar2/imageset2.jpg"));

	}
	Scanner sc=new Scanner(System.in);
	//Method to add new notes with text note
    public void storeNote(String note) {
    	textlist.add(new TextNote(note));
	}
	
  //Method to add new notes with text and image note
	public void storeNote(String note, String url) {
		
    	imagelist.add(new TextAndImageNote(note,url));
	}
	
	//Method to Get All text Notes
	public List<TextNote> getAllTextNotes() {
		return textlist;
	}
	
	//Method to get All Text Image Notes
	public List<TextNote> getAllTextAndImageNotes() {
		return imagelist;
	}
	

}

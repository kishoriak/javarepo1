package com.hsbc.exam;

import java.util.ArrayList;

// Launcher class containing main method, Task 3 of the exam.

public class Launcher {
	
	public static void displayTextNotes(NoteStore ns) {
		ArrayList<TextNote> newtn = ns.getAllTextNotes();
		ArrayList<TextAndImageNote> newtextimage = ns.getAllTextAndImageNotes();
		
		for(int i=0; i<newtn.size(); i++) {
			System.out.println(newtn);

		}
		

	}
	
	//Main method

	public static void main(String[] args) {
		String s1 = "Java is a set of computer software and specifications developed by James "
				+ "Gosling at Sun Microsystems";
		String s2 = "Few Books to read - Ikigai, How to win friends and influence people";
		String s3 = "The Shopping list is on my fridge";
		String s4 = "The size label of Jack's Shirt";

		String url1 = "//foo/bar1/bar2/imgset1.jpg";
		String url2 = "//foo/bar1/bar2/imgset2.jpg";

		TextNote tn1 = new TextNote(s1);
		TextNote tn2 = new TextNote(s2);
		TextAndImageNote tin1 = new TextAndImageNote(s3, url1);
		TextAndImageNote tin2 = new TextAndImageNote(s4, url2);

		NoteStore ns = new NoteStore();
		ns.tlist.add(tn1);
		ns.tlist.add(tn2);
		ns.timlist.add(tin1);
		ns.timlist.add(tin2);
		displayTextNotes(ns);

	}
}

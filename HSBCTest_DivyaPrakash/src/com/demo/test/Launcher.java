package com.demo.test;
import java.util.*;
import com.demo.bean.*;
import com.demo.service.*;
public class Launcher {
	//Calls NoteStore method getAllTextNotes
	public static void displayTextNotes(NoteStore ns) {
		System.out.println(ns.getAllTextNotes());
	}
	//Calls NoteStore method getAllTextAndimageNotes
	public static void displayTextAndImageNotes(NoteStore ns) {
		System.out.println(ns.getAllTextAndImageNotes());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//text and Image notes
		TextNotes t1 = new TextNotes("This is instance 1");
		TextNotes t2 = new TextNotes("This is instance 2");
		TextAndImageNotes ti1 = new TextAndImageNotes("This is image instance 1","a");
		TextAndImageNotes ti2 = new TextAndImageNotes("This is image instance 2","b");
		//Adding Notes
		NoteStore ns = new NoteStore();
		ns.storeTextNote(t1);
		ns.storeTextNote(t2);
		ns.storeTextandImageNote(ti1);
		ns.storeTextandImageNote(ti2);
		//To display all text notes
		displayTextNotes(ns);
		//To display all Text and image Notes 
		displayTextAndImageNotes(ns);
	}

}

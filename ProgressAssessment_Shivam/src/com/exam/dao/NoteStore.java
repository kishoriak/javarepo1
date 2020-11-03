package com.exam.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.exam.bean.TextAndImageNote;
import com.exam.bean.TextNote;

public class NoteStore {
	static List<TextNote> tlist;
	static List<TextAndImageNote> ilist;
	static {
		tlist = new ArrayList<>();
		ilist = new ArrayList<>();
		//tlist.add(new TextNote("fgtrr"));
		//ilist.add(new TextAndImageNote("jhjhjhhj","jjjkgg"));
	}
	
	public boolean storeNote(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String text = sc.nextLine();
		if(ch==2) {
			System.out.println("Enter the Image url");
			String url = sc.nextLine();
			ilist.add(new TextAndImageNote(text, url));
			//System.out.println("Notes Successfully Added in TextAndImageNote");
			return true;
		}else if(ch==1) {
			tlist.add(new TextNote(text));
			//System.out.println("Notes Successfull added in TextNote");
			return true;
		}
		return false;
		
	}
	
	public List<TextNote> getAllTextNotes(){
		return tlist;
	}
	
	public List<TextAndImageNote> getAllTextAndImageNotes(){
		return ilist;
	}
}

package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.bean.Note;
import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;


public class NoteStore implements NoteStoreInterface{
	static List<Note> Notelist;
	static {
		Notelist= new ArrayList<Note>();
	
	}

	public void storeNote(String text) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Select 1. for storing only text");
//		System.out.println("Select 2. for storing text and url");
//		System.out.println("Enter choice \n");
		
//		int choice =sc.nextInt();
//		switch(choice) {
//		case 1:
//			System.out.println("enter text to store");
//			String text=sc.nextLine();
			Notelist.add(new TextNote(text));
//			
//			break;
//		case 2:
//			System.out.println("Enter Text");
//			text = sc.nextLine();
//			System.out.println("enter image URL");
//			String url = sc.next();
			
		
						
		}
				
	
	public void storeNote(String text, String url) {
		
		
		
		Notelist.add(new TextAndImageNote(text,url));
	

	}
		
	public void getAllTextNotes() {
		for (int i=0;i<Notelist.size();i++) {
			if(Notelist.get(i) instanceof TextNote) {
				System.out.println(Notelist.get(i));
			
				
			}
		}
			
	}
	
	public void getAllTextAndImageNotes() {
		for (int i=0;i<Notelist.size();i++) {
			if(Notelist.get(i) instanceof TextAndImageNote) {
				System.out.println(Notelist.get(i));
					
			
			}
		}
				
	}
		
}

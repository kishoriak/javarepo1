package com.demo.service;

import java.util.Scanner;

import com.demo.bean.TextNote;
import com.demo.dao.NoteStore;

public class Launcher {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		
		String Text11= "First Text";
		String Text12="Second Text";
		String Text21= "First Text";
		String Text22="Second Text";
		String Url1="First url";
		String Url2= "Second url";
		
		NoteStore noteStore= new NoteStore();
		
		noteStore.storeNote(Text11);
		noteStore.storeNote(Text12);
		noteStore.storeNote(Text21,Url1);
		noteStore.storeNote(Text21,Url2);
		
	
		int choice=0;
		
		do {
		System.out.println("1.Add TextNote \n2.Add TextAndImageNote\n3.DisplayTextNotes\n4.DisplayTextAndImageNotes\n5.Exit");
		System.out.println("choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter text to store");
			String text=sc.next();
			
			noteStore.storeNote(text);
			System.out.println("TextNote added");
			break;
		case 2:
			System.out.println("Enter Text");
			text = sc.next();
			System.out.println("enter image URL");
			String url = sc.next();
			noteStore.storeNote(text, url);
			System.out.println("TextAndImageNote added");
			break;
		case 3:
			
			noteStore.getAllTextNotes();
			break;
		case 4:
			noteStore.getAllTextAndImageNotes();
			break;
		case 5:
			sc.close();
			System.exit(0);
			}
		}while(choice!=5);
	}
		
	
	
	
	
}


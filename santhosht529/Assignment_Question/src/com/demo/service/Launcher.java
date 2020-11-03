package com.demo.service;

import java.util.Scanner;

import com.demo.bean.TextNote;
import com.demo.dao.NoteStore;

public class Launcher {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		
		NoteStore noteStore= new NoteStore();
		// given task to add 2 text  two text and image in main method
		
		String Text11= "Text 11 ";
		String Text12="Second Text";
		
		
		
		
		String Text21= "First Text";
		String Text22="Second Text";
		
		String Url1="First url";
		String Url2= "Second url";
		
		
	
		
		noteStore.storeNote(Text11);
		noteStore.storeNote(Text12);
		
		noteStore.storeNote(Text21,Url1);
		noteStore.storeNote(Text22,Url2);
		
	
		int choice=0;
		

		do {
		System.out.println("\n*****Menu********\n");
		System.out.println("1.Add TextNote \n2.Add TextAndImageNote\n3.DisplayTextNotes\n4.DisplayTextAndImageNotes\n5.Exit");
		System.out.println("choice:\n");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter text to store:");
			sc.nextLine();
			String text=sc.nextLine();
			noteStore.storeNote(text);		
			System.out.println("TextNote added \n");
			break;
		case 2:
			System.out.println("Enter Text \n");
			sc.nextLine();
			text = sc.nextLine();
			System.out.println("enter corresponding image URL");
			String url = sc.next();
			noteStore.storeNote(text, url);
			System.out.println("TextAndImageNote added \n");
			break;
		case 3:
			
			noteStore.getAllTextNotes();
			break;
		case 4:
			//noteStore.printall();
			noteStore.getAllTextAndImageNotes();
			break;
		case 5:
			System.out.println("Cosing System \nThank You");
			sc.close();
			System.exit(0);
			}
		}while(choice!=5);
	}
		
}


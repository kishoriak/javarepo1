package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Note;
import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;
import com.demo.dao.NoteStore;

public class Launcher{

	public static void main(String[] args) {
		{
		
			Scanner sc=new Scanner(System.in);
			int choice=0;
			NoteStore noteStore=new NoteStore();
			do {
			System.out.println("1. Add Text Note\n2. Add Text And Url Note\n3. Display Text Notes\n4. Display Text and Image Notes\n5. exit");
			System.out.println("choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the note to add");
				String s=sc.next();
				noteStore.storeNote(s);
				break;
			case 2:
				System.out.println("Enter the note to add");
				String text=sc.next();
				System.out.println("Enter the Image URL to add");
				String url=sc.next();
				noteStore.storeNote(text,url);
				break;
			case 3:
				List<TextNote> tlist=noteStore.getAllTextNotes();
				for(TextNote t:tlist) {
					System.out.println(t);
				}
				break;
			case 4:
				List<TextAndImageNote> tailist=noteStore.getAllTextAndImageNotes();
				for(TextAndImageNote tai:tailist) {
					System.out.println(tai.getText());
					System.out.println(tai.getUrl());
					
				}
				break;
			case 5:
				sc.close();
				System.exit(0);
			}
			}while(choice!=5);
		}

	}
}

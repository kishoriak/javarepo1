package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.TextNote;
import com.demo.dao.NoteStore;




public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		NoteStore note=new NoteStore();
		do {
		System.out.println("1. Create Notes \n2.Create Notes and Image\n3display all text notes\n4 Display All Image Notes\n5. exit");
		System.out.println("choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter Notes ");
	    	String note1 =sc.nextLine();
	    	sc.nextLine();
			note.storeNote(note1);
			break;
		case 2:
			System.out.println("enter Notes ");
	    	note1 =sc.nextLine();
	    	System.out.println("enter image url ");
	    	String url1 =sc.nextLine();
	    	note.storeNote(note1,url1);
			break;
		case 3:
			List<TextNote> txtnote = note.getAllTextNotes();
			int i=1;
			for(TextNote n:txtnote)
			{
				System.out.println("Text Note "+i+": "+n);
			}
			break;
		case 4:
			List<TextNote> imgnote = note.getAllTextAndImageNotes();
			int j=1;
			for(TextNote n:imgnote)
			{
				System.out.println("Text And Image Note "+j+": "+n);
			}
			break;

		case 5:
			sc.close();
			System.exit(0);
		}
		}while(choice!=5);
		

	}

}

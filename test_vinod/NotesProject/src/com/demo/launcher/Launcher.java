package com.demo.launcher;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;
import com.demo.dao.NoteStore;
import com.demo.dao.NoteStoreInterface;

public class Launcher {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteStoreInterface noteStore = new NoteStore();
		boolean flag;
		noteStore.storeNote("this is the first text only not to be inserted from launcer");
		noteStore.storeNote("this is the second note from launcher");
		noteStore.storeNote("first Image Note", "foo/bar/first.jpg");
		noteStore.storeNote("second Note", "foo/bar/second.jpg");
		//displaying all text notes
		ArrayList<TextNote> arrtext = noteStore.getAllTextNotes();
		int i =1;
		for(TextNote a:arrtext) {
			System.out.println("textnote " + i + ": "+ a);
			i++;
		}
		
		//displaying all text and image notes
		ArrayList<TextNote> arrtextandimage = noteStore.getAllTextAndImageNotes();
		i = 1;
		for(TextNote a:arrtextandimage) {
			System.out.println("text and image note" + i + ": "+ a);
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		int choice ;
		do {
			System.out.println("1.Add a text note \n2.Add a text and Image note \n3.Display all notes\n4.Display all text notes\n5.Display all text and image notes \n6.Exit");
			System.out.println("Your Choice :");
			choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("Please write your note");
				sc.next();
				String textNote = sc.next();
				flag = noteStore.storeNote(textNote); 
				if(flag) {
					System.out.println("Note successfully inserted");
				}else {
					System.out.println("insertion failed");
				}
				break;
			case 2:
				System.out.println("Please write your text note");
				sc.next();
				String textNotei = sc.next();
				System.out.println("Please write your image url");
				sc.next();
				String urlImage = sc.next();
				flag = noteStore.storeNote(textNotei, urlImage);
				break;
			case 3:
				//for displaying all the notes both text and text andimage notes
				ArrayList<TextNote> arr1 = noteStore.getAllTextNotes();
				ArrayList<TextNote> arr2 = noteStore.getAllTextAndImageNotes();
				i = 1;
				for(TextNote a:arr1) {
					System.out.println("textnote" + i + ":"+ a);
					i++;
				}
				i =1;
				for (TextNote a : arr2) {
					System.out.println("text and image note " + i + ":"+ a);
					i++;
				}
				break;
			case 4:
				//displaying all text notes functionality
				ArrayList<TextNote> arr41 = noteStore.getAllTextNotes();
				for(TextNote a:arr41) {
					System.out.println(a);
				}
				break;
			case 5:
				//displaying all text and image functionality
				ArrayList<TextNote> arr42 = noteStore.getAllTextAndImageNotes();
				for(TextNote a:arr42) {
					System.out.println(a);
				}
				break;
			case 6:
				System.exit(0);
				break;
			}
			
		}while(choice!=6);
		sc.close();
	}

}

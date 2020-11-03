package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNotes;
import com.demo.service.NotesService;
import com.demo.service.NotesServiceImpl;

public class Launcher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		NotesService notesService=new NotesServiceImpl();
		do {
		System.out.println("1. Add new note with url \n2. Add new note without url \n3.Display text notes \n4. Display Text and images notes\n5. Exit");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			notesService.storeNote();
			break;
		case 2:
			notesService.storeNoteWithoutUrl();
			break;
		case 3:
			List<TextNotes> notelist=notesService.displayTextNotes();
			for(TextNotes n1:notelist) {
				System.out.println(n1);
			}
			break;
		case 4:
			List<TextAndImageNote> noteandimagelist= notesService.displayTextAndImageNotes();
			for(TextAndImageNote n2:noteandimagelist) {
				System.out.println(n2);
			}
			break;
		case 5:
		sc.close();
			System.exit(0);
			break;
		}
		}while(choice!=5);
	}

	}


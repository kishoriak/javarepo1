package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;
import com.demo.service.NoteService;
import com.demo.service.NoteServiceImpl;

public class Launcher {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int choice=0;
		NoteService noteService=new NoteServiceImpl();
		
		do {
			System.out.println("1. add text note \n2. add text with image \n3. display text note \n4.diplay text with image note \n5.ext");
			System.out.println("Choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				//for adding text notes
				noteService.addTextNote();
				System.out.println("Done !!!");
				break;
			case 2:
				//for adding text with images
				noteService.addTextImageNote();
				System.out.println("Done !!!");
				break;
			case 3:
				// display text notes
				List<TextNote> plist1=noteService.getAllTextNotes();
				for(TextNote p1:plist1) {
					System.out.println(p1);
				}
				break;
			case 4:
				//display text with images
				List<TextAndImageNote> plist2=noteService.getAllTextAndImageNotes();
				for(TextNote p2:plist2) {
					System.out.println(p2);
				}
				break;
			case 5:
				sc.close();
				System.exit(0);
			}
		}while(choice!=5);
		

	}

}

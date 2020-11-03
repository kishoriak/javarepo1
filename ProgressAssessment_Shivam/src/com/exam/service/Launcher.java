package com.exam.service;

import java.util.List;
import java.util.Scanner;

import com.exam.bean.TextAndImageNote;
import com.exam.bean.TextNote;
import com.exam.dao.NoteStore;

public class Launcher {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		NoteStore noteStore = new NoteStore();
		int choice=0;
		do {
			System.out.println("Enter Choice: ");
			System.out.println("1.Add Notes\n2.Display Text Notes\n3.Display Text And Image Notes\n4.exit");
			choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1.Add TextNotes\n2. Add Text And Image Notes\n3.exit");
			int ch = sc.nextInt();
			boolean flag=noteStore.storeNote(ch);
			if(flag) {
				System.out.println("Added");
			}
			break;
		case 2:
			List<TextNote> tn = noteStore.getAllTextNotes();
			for(TextNote tnotes:tn) {
				System.out.println(tnotes);
			}
			break;
		case 3:
			List<TextAndImageNote> ti = noteStore.getAllTextAndImageNotes();
			for(TextAndImageNote inotes: ti) {
				System.out.println(inotes);
			}
			break;
		case 4:
			System.exit(0);
			break;
		}
	}while(choice!=4);
	
	}
}

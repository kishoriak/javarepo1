package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNotes;
import com.demo.dao.NotesDao;
import com.demo.dao.NotesDaoImpl;

public class NotesServiceImpl implements NotesService{

	
	private NotesDao notesDao;

	public NotesServiceImpl() {
		notesDao=new NotesDaoImpl();
		
	}
	@Override
	public void storeNote() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Note");
		String note=sc.nextLine();
		System.out.println("Enter url");
		String url=sc.nextLine();
		TextAndImageNote n=new TextAndImageNote(note,url);
		notesDao.storeNote(n);	
	}

	@Override
	public List<TextNotes> getAllTextNotes() {
		return notesDao.getAllTextNotes();
	}

	@Override
	public List<TextAndImageNote> getAllTextAndImageNotes() {
		return notesDao.getAllTextAndImageNotes();
	}

}

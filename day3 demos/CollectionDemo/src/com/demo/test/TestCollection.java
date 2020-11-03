package com.demo.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestCollection {

	public static void main(String[] args) {
		List<Integer> ar=new ArrayList<>();
		//HashSet<Integer> ar=new HashSet<>();
		ar.add(23);
		ar.add(45);
		ar.add(55);
		//ar.add("abc");
		ar.add(23);
		System.out.println(ar);
		System.out.println(ar.size());
		//System.out.println(ar.capacity());
		for(int i=0;i<30;i++) {
			ar.add(i);
		}
		System.out.println(ar);
		System.out.println(ar.size());
		//System.out.println(ar.capacity());
	}

}

package com.demo.service;

import com.demo.bean.Circle;
import com.demo.bean.Shape;
import com.demo.bean.Triangle;

public class ShapeServiceImpl implements ShapeService {
	static Shape[] sarr;
	static{
		sarr=new Shape[5];
	}
	
	
	public void addData(int ch, int i) {
		if(ch==1) {
			sarr[i]=new Triangle("white",2,3,4,5);
		}
		else {
			sarr[i]=new Circle("red",5);
		}
		
	}


	public void displayAll() {
		int cntT=0,cntC=0;
		for(int i=0;i<sarr.length;i++) {
			if(sarr[i] instanceof Circle) {
				cntC++;
			}
			else {
				cntT++;
			}
			System.out.println("Area : "+sarr[i].area());
			System.out.println("Area : "+sarr[i].perimeter());
		}
		System.out.println("Triangle cnt: "+cntT);
		System.out.println("Circle cnt: "+cntC);
	}

}

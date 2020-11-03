package com.demo.bean;

public class Triangle extends Shape{
	private float s1,s2,base,height;

	public Triangle() {
		super();
	}

	public Triangle(String color,float s1, float s2, float base, float height) {
		super(color);
		this.s1 = s1;
		this.s2 = s2;
		this.base = base;
		this.height = height;
	}

	public float getS1() {
		return s1;
	}

	public void setS1(float s1) {
		this.s1 = s1;
	}

	public float getS2() {
		return s2;
	}

	public void setS2(float s2) {
		this.s2 = s2;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	
	public float area() { 
		  return 0.5f*base*height;
		  } 
	  
	  
	  public float perimeter() {
	  return s1+s2+base; 
	  }
	 
	@Override
	public String toString() {
		return "Triangle [s1=" + s1 + ", s2=" + s2 + ", base=" + base + ", height=" + height + "]";
	}

	
}

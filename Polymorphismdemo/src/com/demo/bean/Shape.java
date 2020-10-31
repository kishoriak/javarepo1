package com.demo.bean;

abstract public class Shape {
	private String color;
    //default constructor
	public Shape() {
		super();
	}
	//parametrised constructor
	public Shape(String color) {
		super();
		this.color = color;
	}
	
	 abstract public float area();
	  
	 abstract public float perimeter();
	 
	//setter and getter methods
	

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}

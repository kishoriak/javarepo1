package com.demo.bean;

public class Circle extends Shape {
	private float radius;

	public Circle() {
		super();
	}

	public Circle(String color,float radius) {
		super(color);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float area() {
    	return 3.142f*radius*radius;
    }
    public float perimeter() {
    	return 2*3.142f*radius;
    }
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}

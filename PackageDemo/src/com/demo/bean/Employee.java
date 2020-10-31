package com.demo.bean;

import java.util.Date;

public class Employee extends Person{
	
	private String dept,desg;
	
	public Employee() {
		super();
		System.out.println("in Employee default");
		dept=null;
		desg=null;
		
	}
	public Employee(int id,String name,String mob,String email,Date bd,String dept,String desg) {
		super(id,name,mob,email,bd);
		System.out.println("in employee parametrized");
		this.dept=dept;
		this.desg=desg;
		
	}
	public String toString() {
		return super.toString()+"\nDepartment :"+dept+"\nDesignation : "+desg;
		
	}

}

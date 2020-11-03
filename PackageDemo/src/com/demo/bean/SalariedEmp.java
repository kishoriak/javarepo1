package com.demo.bean;

import java.util.Date;

public class SalariedEmp extends Employee{
	private double sal;
	public SalariedEmp() {
		sal=0.0;
	}
	public SalariedEmp(int id,String name,String mob,String email,Date bd,String dept,String desg,double sal) {
		super(id,name,mob,email,bd,dept,desg);
		this.sal=sal;
	}
	public String toString() {
		return super.toString()+"\nSalary : "+this.sal;
	}

}

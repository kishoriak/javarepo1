package com.demo.test;

import java.util.Date;

import com.demo.bean.Employee;
import com.demo.bean.SalariedEmp;

public class TestEmployee {
	public static void main(String[] args) {
		
		//Employee e= new Employee(12,"kishori","1111","abc@jdfh",new Date(),"Hr","mgr");
		SalariedEmp e= new SalariedEmp(12,"kishori","1111","abc@jdfh",new Date(),"Hr","mgr",2345.00);
		System.out.println(e);
	}

}

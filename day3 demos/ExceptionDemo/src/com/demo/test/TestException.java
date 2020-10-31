package com.demo.test;

public class TestException {

	public static void main(String[] args) {
		try {
			//open
		String str="aaaa";
		System.out.println("Length "+str.length());  //JVM generate object of the class
		int a=10;
		int b=0;
		if(b==0) {
			  throw new ArithmeticException("b cannot be zero");
		}
		else {
		System.out.println("Division : "+(a/b));}
		//close();
		}catch(NullPointerException e) {
			System.out.println("error occured"+e.getMessage());
			//e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("error occured"+e.getMessage());
		}finally {
			System.out.println("this is finally");
			//close
		}
		
		System.out.println("In main method resume execution");
		System.out.println("end of main");

	}

}

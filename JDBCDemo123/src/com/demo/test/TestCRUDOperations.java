package com.demo.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.service.ProductService;

public class TestCRUDOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductService ps=new ProductService();
		
		int choice=0;
		do {
		System.out.println("1. Insert new product \n2.update price\n3.delete by id");
		System.out.println("4.display by id\n5.display All\n6.exit");
		System.out.println("choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			int n;
			try {
				n = ps.addProduct();
				if(n>0) {
					System.out.println("insertion done");
				}
				else {
					System.out.println("insertion not done");
				}
			} catch (SQLException e) {
				System.out.println("error : "+e.getMessage());
			}
		
			break;
		case 2:
			System.out.println("enetr id");
			int id=sc.nextInt();
			System.out.println("enetr name");
			String nm=sc.next();
			System.out.println("enetr price");
			double pr=sc.nextDouble();
			try {
				int num=ps.updateProduct(id,nm,pr);
				if(num>0)
				  System.out.println("updated");
			} catch (SQLException e1) {
				System.out.println("Error in updation");
			}
			break;
		case 3:
			System.out.println("enetr id");
			id=sc.nextInt();
			try {
				n=ps.deleteProduct(id);
				if(n>0)
					System.out.println("deleted record");
			} catch (SQLException e) {
				System.out.println("not found"+e.getMessage());
				//e1.printStackTrace();
			}
			
			break;
		case 4:
			System.out.println("enetr id");
			id=sc.nextInt();
			try {
			   Product p=ps.displayById(id);
			   System.out.println(p); 
			 }catch(SQLException|NullPointerException e) {
				System.out.println("Not found"+e.getMessage());
			}
			break;
		case 5:
			try {
				List<Product>plist=ps.displayAll();
				plist.forEach(System.out::println);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 6:
			sc.close();
			ps.closeConnection();
			System.exit(0);
			break;
		}
		}while(choice!=6);

}
}

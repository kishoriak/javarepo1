package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.exception.ProductNotFoundException;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import com.demo.service.ServiceGenerator;

public class TestCrudOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		ProductService productService=new ProductServiceImpl();
		//ServiceGenerator.createService();
		do {
		System.out.println("1. add \n2.search\n3display all\n4. sort data\n5.display by name\n6. modify qty\n7. exit");
		System.out.println("choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			productService.addProduct();
			break;
		case 2:
			System.out.println("enetr id");
			int id=sc.nextInt();
			Product p=productService.searchProduct(id);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("not found");
			}
		
			break;
		case 3:
			List<Product> plist=productService.displayAll();
			for(Product p1:plist) {
				System.out.println(p1);
			}
			break;
		case 4:
			List<Product> plst=productService.sortData();
			plst.forEach(System.out::println);
			break;
		
		case 5:
			for(int i=0;i<3;i++) {
			System.out.println("enter name");
			String nm=sc.next();
			try {
			    p=productService.searchByName(nm);
			    System.out.println(p);
			    break;
			}
			catch(ProductNotFoundException e) {
				System.out.println(e.getMessage());
				if(i==2) {
					System.out.println("you lost all attempts pls contact administrator");
					System.exit(0);
				}
			}
			}
			break;
		case 6:
			System.out.println("1. change both");
			System.out.println("2.change name");
			System.out.println("3.change qty");
			System.out.println("choice :");
			int ch =sc.nextInt();
			System.out.println("enter id");
			id=sc.nextInt();
			boolean flag=true;
			switch(ch) {
			case 1:
				System.out.println("enter name");
				String nm=sc.next();
				System.out.println("enter qty");
				int qty=sc.nextInt();
				flag=productService.modifyNameandQty(id,nm,qty);
				break;
			case 2:
				System.out.println("enter name");
				nm=sc.next();
				flag=productService.modifyName(id,nm);
				
				break;	
			case 3:
				break;
			default:
				break;
			}
			if(flag) {
				System.out.println("modification done");
			}
			else {
				System.out.println("not found");
			}
			
			break;
		case 7:
			sc.close();
			System.exit(0);
		}
		}while(choice!=7);
		

	}

}

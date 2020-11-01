package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestCrudOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		ProductService productService=new ProductServiceImpl();
		do {
		System.out.println("1. Add new product\n2.Search product by ID\n3Display all\n4. Delete by ID\n5.Modify Quantity\n6. Exit");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			productService.addProduct();
			break;
		case 2:
			System.out.println("Enter ID");
			int id=sc.nextInt();
			Product p=productService.searchProduct(id);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("Not found");
			}
			break;
		case 3:
			List<Product> plist=productService.displayAll();
			for(Product p1:plist) {
				System.out.println(p1);
			}
			break;
		case 4:
			System.out.println("Enter ID");
			int id2=sc.nextInt();
			boolean p2=productService.deleteProduct(id2);
			if(p2) {
				System.out.println("Delete done");
			}
			else {
				System.out.println("Not found");
			}
			break;
		case 5:
			System.out.println("Enter id");
			int id3=sc.nextInt();
			System.out.println("Enter name to modify");
			String name=sc.next();
			boolean p3=productService.modifyQuantity(id3, name);
			if(p3) {
				System.out.println("Product modification done");
			}
			else {
				System.out.println("Not found");
			}
			break;
		case 6:
		sc.close();
			System.exit(0);
			break;
		}
		}while(choice!=6);
	}

}

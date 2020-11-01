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
		System.out.println("1. add \n2.search\n3display all\n4. delete\n5.display by id\n6. modify qty\n7. exit");
		System.out.println("choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			productService.addProduct();
			break;
		case 2:
			System.out.println("enter id");
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
			System.out.println("enter id");
			int id1=sc.nextInt();
			boolean flag= productService.deleteProduct(id1);
			if(flag==true) {
				System.out.println("Deleted Successfully !!!");
			}
			else {
				System.out.println("no product found !!!");
			}
			break;
		case 5:
			System.out.println("enter id");
			int id_d=sc.nextInt();
			Product pd=productService.searchProduct(id_d);
			if(pd!=null) {
				System.out.println(pd);
			}
			else {
				System.out.println("not found");
			}
			break;
			
		case 6:
			System.out.println("enter id: ");
			int id_m=sc.nextInt();
			Product pm= productService.searchProduct(id_m);
			if(pm!=null) {
				System.out.println("enter new qty");
				int qty= sc.nextInt();
				productService.modifyProductQ(pm,qty);
				System.out.println("Success");
			}
			else {
				System.out.println("No product found");
			}
			break;
		case 7:
			sc.close();
			System.exit(0);
		}
		}while(choice!=7);
		

	}

}

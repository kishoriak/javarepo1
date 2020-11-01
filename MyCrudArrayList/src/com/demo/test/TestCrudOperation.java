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
		System.out.println("1. Add \n2. Search\n3. Display all\n4. delete\n5. Display by id\n6. Modify\n7. Exit");
		System.out.println("choice");
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
			id=sc.nextInt();
			productService.deleteProduct(id);
			
			
			break;
		case 5:
			System.out.println("enter id");
			id=sc.nextInt();
			System.out.println(productService.displayById(id));
			break;
		case 6:
			System.out.println("enter id");
			id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter qty");
			int qty=sc.nextInt();
			boolean status=productService.modifyData(id,name,qty);
			if(status) {
				System.out.println("updation done");
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

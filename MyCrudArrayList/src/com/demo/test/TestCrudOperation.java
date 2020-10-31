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
		System.out.println("1. Add \n2. Search\n3. Display all\n4. Delete\n5. Display by id\n6. Modify quantity\n7. Exit");
		System.out.println("Enter choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			productService.addProduct();
			break;
		case 2:
			System.out.println("enetr id: ");
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
			System.out.println("Enter id: ");
			int idDel = sc.nextInt();
			Product delP = productService.searchProduct(idDel);
			if(delP!=null) {
				productService.deleteProduct(delP);
				System.out.println("Product Deleted.");
			}
			else System.out.println("Invalid id.");
			break;
		case 5:
			System.out.println("Enter id: ");
			int idSer = sc.nextInt();
			Product x = productService.searchProduct(idSer);
			if(x!=null) {
				System.out.println(x);
			}
			else System.out.println("Not found");
			break;
		case 6:
			System.out.println("Enter id:");
			int idq = sc.nextInt();
			Product q=productService.searchProduct(idq);
			if(q!=null) {
				System.out.println("Enter new qty: ");
				int qt = sc.nextInt();
				productService.modifyProductQty(q, qt);
			}
			else System.out.println("Invalid id.");
			break;
		case 7:
			sc.close();
			System.exit(0);
		}
		}while(choice!=7);
		

	}

}

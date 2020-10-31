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
			System.out.println("Enter id of the Product to be deleted: ");
			int id1 = sc.nextInt();
			if(productService.deleteProd(id1) == 1)
				System.out.println("Product has been deleted");
			else
				System.out.println("Product not found");
			break;
		case 5:
			System.out.println("Enter id: ");
			int id2 = sc.nextInt();
			productService.displayById(id2);
			break;
		case 6:
			System.out.println("Enter product ID to be modified: ");
			int id3 = sc.nextInt();
			System.out.println("Enter modified quantity: ");
			int qty = sc.nextInt();
			productService.modify(id3, qty);
			break;
		case 7:
			sc.close();
			System.exit(0);
		}
		}while(choice!=6);
		

	}

}

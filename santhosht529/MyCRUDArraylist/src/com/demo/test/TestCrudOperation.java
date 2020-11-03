package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestCrudOperation {

	public static void main(String[] args) {
		
		int choice ;
		Scanner sc = new Scanner(System.in);
		ProductService productService = new ProductServiceImpl();
		do {
		System.out.println("1.Add \n2.Delete \n3.Search by id"
				+"\n4.Display All \n5.Display by id \n6.Modify \n7.Exit");
		choice = sc.nextInt();
		switch(choice) {
		//add
		case 1:
			System.out.println("enter id :");
			int ida = sc.nextInt();
			
			productService.addProduct(ida);
			
			break;
		
		//Delete	
		case 2:
			System.out.println("enter id of the product to be deleted:");
			int idd = sc.nextInt();
			boolean flag = productService.deleteProduct(idd);
			if(flag) {
				System.out.println("entry deleted succesfully");
			}else {
				System.out.println("deletion unsuccessfull");
			}
			break;
		
			//Search
		case 3:
			System.out.println("enter id");
			int ids = sc.nextInt();
			Product p = productService.searchById(ids);
			
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("not found");
			}
			break;
		
			//Display
		case 4:
			List<Product> plist = productService.displayAll();
			for(Product pi:plist ) {
				System.out.println(pi);
			}
			break;
		case 5:
			
			break;
		case 6:
			System.out.println("enter id");
			int idm = sc.nextInt();
			
			
			boolean flag1 = productService.deleteProduct(idm);
			if(flag1) {
				System.out.println("Enter new Values");
				productService.addProduct(idm);
			}else {
				System.out.println("Wong ID");
			}
		
			
			
			break;
			
		case 7:
			sc.close();
			System.out.println("Thank You");
			System.exit(0);
			break;
		}
	 }while(choice!=7);
	}

}
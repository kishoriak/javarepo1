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
		System.out.println("1.add \n2.delete \n3.search by id \n4.display All \n5.display by id \n6.exit");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			productService.addProduct();
			break;
		case 2:
			boolean flag = productService.deleteProduct();
			if(flag) {
				System.out.println("entry deleted succesfully");
			}else {
				System.out.println("deletion unsuccessfull");
			}
			break;
		case 3:
			Product p = productService.searchById();
			System.out.println(p);
			break;
		case 4:
			List<Product> plist = productService.displayAll();
			for(int i = 0; i<plist.size();i++) {
				System.out.println(plist);
			}
			break;
		case 5:
			//Search by id and display by id are exactly same?
			Product prod = productService.searchById();
			System.out.println(prod);
			break;
		case 6:
			sc.close();
			System.exit(0);
			break;
		}
	 }while(choice!=6);
	}

}

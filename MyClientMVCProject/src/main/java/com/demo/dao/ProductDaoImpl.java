package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.demo.bean.ProductData;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	RestTemplate restTemplate;
	
	public ProductData findAll(){
		ProductData p=restTemplate.getForObject("http://localhost:8383/products/product", ProductData.class);
		System.out.println(p);
		return p;
	} 

}

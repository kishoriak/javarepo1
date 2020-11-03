package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.demo.bean.Product;
import com.demo.bean.ProductData;

@Repository
public class ProductDaoImpl implements ProductDao{
    
	@Autowired
	RestTemplate restTemplate;
	
	
	
	@Override
	public ProductData findAll() {
		//restTemplate.exchange("http://localhost:8181/products",HttpMethod.GET,null,new ParameterizedTypeReference<ProductData>() {},id)
		ProductData p=restTemplate.getForObject("http://localhost:8181/products",ProductData.class);
		System.out.println(p);
		return p;
	}

	
	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

}

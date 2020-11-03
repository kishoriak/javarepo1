package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.demo.bean.Product;
import com.demo.bean.ProductData;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	RestTemplate restTemplate;
	public ProductData findAll() {
	
		// TODO Auto-generated method stub
		//restTemplate.exchange("http://localhost:8080/products", HttpMethod.GET, null, new ParameterizedType)
		ProductData p =  restTemplate.getForObject("http://localhost:8080/products", ProductData.class);
		System.out.println(p);
		return p;
	}
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

}

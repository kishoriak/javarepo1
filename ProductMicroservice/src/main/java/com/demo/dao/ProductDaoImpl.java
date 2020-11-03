package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.bean.Product;
import com.demo.bean.ProductData;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
    
	//@Override
	public ProductData findAll() {
		List<Product> plist=jdbcTemplate.query("select * from product_hsbc",
				     new RowMapper<Product>() {

						//@Override
						public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
							Product p=new Product();
							p.setPid(rs.getInt(1));
							p.setPname(rs.getString(2));
							p.setPdesc(rs.getString(3));
							p.setPrice(rs.getDouble(4));
							p.setQty(rs.getInt(5));
							return p;
						}
			          
		});
		ProductData p=new ProductData(plist);
		return p;
		
	}

	//@Override
	public Product insertProduct(Product p) {
		int n=jdbcTemplate.update("insert into product_hsbc values(?,?,?,?,?)",new Object[] {p.getPid(),p.getPname(),p.getPdesc(),p.getPrice(),p.getQty()});
		if (n>0) {
			return p;
		}
		return null;
	}

	//@Override
	public Product updateProduct(Product p) {
		int n=jdbcTemplate.update("update product_hsbc set pname=?,price=?,qty=?,pdesc=? where pid=?",new Object[] {p.getPname(),p.getPrice(),p.getQty(),p.getPdesc(),p.getPid()});
	
	if (n>0) {
		return p;
	}
	return null;
	}

	//@Override
	public Product deletProduct(int id) {
		Product p=getById(id);
		int n=jdbcTemplate.update("delete from product_hsbc where pid=?",new Object[] {id});
		if (n>0) {
			return p;
		}
		return null;
	}

	//@Override
	public Product getById(int pid) {
		Product p=jdbcTemplate.queryForObject("select * from Product_hsbc where pid=?",new Object[] {pid},new RowMapper<Product>(){
			public Product mapRow(ResultSet rs,int nrows) throws SQLException {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPdesc(rs.getString(3));
				p.setPrice(rs.getDouble(4));
				p.setQty(rs.getInt(5));
				return p;
			}
		});
		return p;
	}
}






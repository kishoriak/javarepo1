package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class ProductDao {
	public static Connection con;
	public static PreparedStatement pins,pdisplay,pByid,pup,pdel;
	static {
		con=DBUtil.getMyConnection();
		
			try {
				//con.setAutoCommit(false);
				pins=con.prepareStatement("insert into product(pid,pname,price) values(?,?,?)" );
				pdisplay=con.prepareStatement("select * from product",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );
				pByid=con.prepareStatement("select * from product where pid=?");
				pdel=con.prepareStatement("delete from product where pid=?");
				pup=con.prepareStatement("update product set price=?,pname=? where pid=?");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public Product getById(int id) throws SQLException {
		pByid.setInt(1, id);
		ResultSet rs=pByid.executeQuery();
		if(rs.next()) {
			Product p= new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			return p;
		}
		else {
			return null;
		}
		
	}


	public int insertProduct(Product p) throws SQLException  {
		
			pins.setInt(1, p.getPid());
			pins.setString(2, p.getPname());
			pins.setDouble(3, p.getPrice());
			int n=pins.executeUpdate();
			/*if(n>0) {
				con.commit();
			}
			else {
				con.rollback();
			}*/
		    return n;
		
		
	}
	public List<Product> displayAllProduct() throws SQLException {
		ResultSet rs=pdisplay.executeQuery();
		System.out.println("Resultset type= "+rs.getType());
		ArrayList<Product> aplist=new ArrayList<>();
		while(rs.next()) {
			Product p= new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			aplist.add(p);
			
		}
		
		
		return aplist;
		
	}


	public int updateProduct(int id, String nm,double pr) throws SQLException {
		pup.setDouble(1,pr);
		pup.setString(2,nm);
		pup.setInt(3,id);
		return pup.executeUpdate();
		
	}


	public int deleteProductById(int id) throws SQLException {
		pdel.setInt(1, id);
		return pdel.executeUpdate();
		
	}


	public void closeConnection() {
		DBUtil.closeMyConnection();
		
	}
	
}

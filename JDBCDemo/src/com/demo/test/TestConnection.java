package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) {
		//registering which driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/test";
			Connection conn=DriverManager.getConnection(url,"root","root123");
			if(conn!=null) {
				System.out.println("Connection done");
			}
			else {
				System.out.println("connection not done");
			}
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from product_hsbc");
			while(rs.next()) {
				System.out.println("Pid : "+rs.getInt(1));
				System.out.println("Name : "+rs.getString(2));
				System.out.println("Description : "+rs.getString(3));
				System.out.println("Price : "+rs.getDouble(4));
				System.out.println("qty : "+rs.getInt(5));
			}
			
			PreparedStatement pst=conn.prepareStatement("select * from product_hsbc where pid=?");
			int id=13;
			pst.setInt(1, id);
			//pst.setInt(2, 200);
			ResultSet rs1=pst.executeQuery();
			if(rs1.next()) {
				System.out.println("Pid : "+rs1.getInt(1));
				System.out.println("Name : "+rs1.getString(2));
				System.out.println("Description : "+rs1.getString(3));
				System.out.println("Price : "+rs1.getDouble(4));
				System.out.println("qty : "+rs1.getInt(5));
			}
			else {
				System.out.println("not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
	}

}

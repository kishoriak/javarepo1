package com.demo.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.demo.dao.DBUtil;

public class TestSQLInjection {

	public static void main(String[] args) {
		Connection con=DBUtil.getMyConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product");
		String name=sc.nextLine(); 
		//String query="select * from product where pname='"+name+"'";
		String query="select * from product where pname=?";
        System.out.println(query);
        try {
			//Statement st=con.createStatement();
			//ResultSet rs=st.executeQuery(query);
        	PreparedStatement ps=con.prepareStatement(query);
        	ps.setString(1, name);
        	ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Id: "+rs.getDouble(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}

}

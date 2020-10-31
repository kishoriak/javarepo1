package com.demo.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;

import com.demo.dao.DBUtil;
import com.mysql.cj.xdevapi.Type;

import java.sql.CallableStatement;

public class TestCallProc {

	public static void main(String[] args) {
		Connection con=DBUtil.getMyConnection();
		try {
			CallableStatement cs=con.prepareCall("{call getCount(?)}");
			cs.registerOutParameter(1,Types.INTEGER);
			cs.execute();
			int cnt=cs.getInt(1);
			System.out.println("Count in product table : " +cnt);
			Statement st=con.createStatement();
			boolean ans=st.execute("create table user123(id int,nm varchar(20));");
			/*if(ans) {
				System.out.println("table created");
			}else
			{
				System.out.println("table not created");
			}*/
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con!=null)
			   DBUtil.closeMyConnection();
		}
		
	}

}

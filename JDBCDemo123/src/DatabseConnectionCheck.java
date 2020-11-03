import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabseConnectionCheck {

	public static void main(String[] args) {
		Connection con=null;
		try {
			//step 1: create object of driver class and register Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url="jdbc:mysql://localhost:3306/test";
		//Step 2: get connection
		con=DriverManager.getConnection(url,"root","root123");
		System.out.println("Connection done");
		//step 3: generate statement for execution
		Statement st=con.createStatement();
		//step 4: execute Query
		ResultSet rs=st.executeQuery("select * from product");
		while(rs.next()) {
			System.out.println("Id :" +rs.getInt(1));
			System.out.println("Name:" +rs.getString(2));
			System.out.println("Description :" +rs.getFloat(3));
			
		}
		int n=st.executeUpdate("insert into product(pid,pname,price) values(3333,'coke',55)");
		if(n>0) {
			System.out.println("----------------");
			System.out.println("insertion done");
			rs=st.executeQuery("select * from product");
			while(rs.next()) {
				System.out.println("Id :" +rs.getInt(1));
				System.out.println("Name:" +rs.getString(2));
				System.out.println("Description :" +rs.getFloat(3));
				
			}
		}
		
		}catch(SQLException e) {
			System.out.println("Error"+e.getMessage());
			e.printStackTrace();
		}
		finally {
			try {
			con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

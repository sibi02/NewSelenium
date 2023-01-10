package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseSample {
public static void retrivedatabase(String querypara) {
		
		
		//1.Load the driver
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.Connect to database
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
			
			//3.Write a sql query
			String query = querypara;
			
			//4.prepare the statement 
			PreparedStatement ps = con.prepareStatement(query);
			
			//5.execute query
			ResultSet rs = ps.executeQuery();
			
			//6.iterate
			while (rs.next()) {
				
				String fn = rs.getString("first_name");
				System.out.println(fn);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exceptionw
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		retrivedatabase("select distinct first_name from employees where first_name = 'Steven'");
	
		
		
	}

}



package com.JavaWebApplication.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDB {

	// since the is using commonly for all pages i am creating class inside the model folder
	
	Connection con = null;
	//getCon is a default method in java
	public Connection getCon()
	{
		//to do connection for db:
		try {
			Class.forName("com.mysql.jdbc.driver");
			//it take 3 params: url,username,password
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javawebapplication_list?useSSL=false","root","root");
			
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
}

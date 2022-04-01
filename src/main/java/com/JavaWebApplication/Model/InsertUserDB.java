package com.JavaWebApplication.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.JavaWebApplication.Beans.NewUserRegistrationBean;

public class InsertUserDB {
	String s1 = null;
	// or NewUserRegistrationBean NU = new NewUserRegistrationBean();
	
	// public String insertuser(String firstname, String lastname, String password)
	public String insertuser(NewUserRegistrationBean NU)
	{
		MyDB db = new MyDB();
		Connection con = db.getCon();
		try {
			
			//import statement.sql
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into newuserregistration(firstname,lastname,password) values ('"+NU.getFirstname()+"','"+NU.getLastname()+"','"+NU.getPassword()+"')");
		    s1= "data inserted";
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s1;
	}

}

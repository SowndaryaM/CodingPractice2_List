package com.JavaWebApplication.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JavaWebApplication.Beans.NewUserRegistrationBean;
import com.JavaWebApplication.Model.InsertUserDB;

/**
 * Servlet implementation class NewUserRegistration
 */
public class NewUserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUserRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		PrintWriter out= response.getWriter();
		String Firstname = request.getParameter("fname");
		String Lastname = request.getParameter("lname");
		String Password = request.getParameter("pwd");
		
		System.out.println(Firstname);
		System.out.println(Lastname);
		System.out.println(Password);
		
		NewUserRegistrationBean NU= new NewUserRegistrationBean(Firstname,Lastname,Password);
		NU.setFirstname(Firstname);
		NU.setLastname(Lastname);
		NU.setPassword(Password);
		
		InsertUserDB UDB = new InsertUserDB();
		UDB.insertuser(NU);
		
		String s1 = UDB.insertuser(NU);
		System.out.println(s1);
	}

}

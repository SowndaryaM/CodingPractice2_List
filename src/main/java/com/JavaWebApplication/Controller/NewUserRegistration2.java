package com.JavaWebApplication.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JavaWebApplication.Beans.NewUserRegistrationBean2;
import com.JavaWebApplication.Model.InsertUserDB2;

/**
 * Servlet implementation class NewUserRegistration
 */
public class NewUserRegistration2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUserRegistration2() {
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
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		String password = request.getParameter("pwd");
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(password);
		
		NewUserRegistrationBean2 NU= new NewUserRegistrationBean2(firstname,lastname,password);
		
		NU.setfirstname(firstname);
		NU.setlastname(lastname);
		NU.setpassword(password);
		
		InsertUserDB2 UDB = new InsertUserDB2();
		UDB.insertuser(NU);
		
		String s1 = UDB.insertuser(NU);
		System.out.println(s1);
	}

}

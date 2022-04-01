package com.JavaWebApplication.Beans;

public class NewUserRegistrationBean2 {

	public String firstname;
	public String lastname;
	public String password;
	
	
	public NewUserRegistrationBean2() {
		super();
	}

	//since we are using mvc architecture we need to use bean class
	//method1: using constructor
	public NewUserRegistrationBean2(String firstname, String lastname, String password) {
		super();
		firstname = firstname;
		lastname = lastname;
		password = password;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}



		
	
	//method2: using getters and setters method

	
	

}

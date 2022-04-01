package com.JavaWebApplication.Beans;

public class NewUserRegistrationBean {

	public String Firstname;
	public String Lastname;
	public String Password;
	
	
	public NewUserRegistrationBean() {
		super();
	}

	//since we are using mvc architecture we need to use bean class
	//method1: using constructor
	public NewUserRegistrationBean(String firstname, String lastname, String password) {
		super();
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.Password = password;
	}
	
	//method2: using getters and setters method
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		this.Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		this.Lastname = lastname;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
	

}

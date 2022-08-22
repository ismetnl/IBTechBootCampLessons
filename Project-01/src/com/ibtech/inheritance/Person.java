package com.ibtech.inheritance;

abstract public class Person {
	
	protected String firstname;
	protected String lastname;
	protected String emailAdress;
	
	public Person(String firstname, String lastname) {

		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFullname() {
		return firstname+" "+lastname;
	}
	
	
	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	abstract public String getGreeting();
	
}

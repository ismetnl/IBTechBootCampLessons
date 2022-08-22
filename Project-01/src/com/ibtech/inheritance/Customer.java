package com.ibtech.inheritance;

public class Customer extends Person {
	
	private long customId;
	private double totalCredit;
	
	
	
	public Customer(long customId,String firstname, String lastname, double totalCredit) {
		super(firstname, lastname);
		this.customId = customId;
		this.totalCredit = totalCredit;
	}
	public long getCustomId() {
		return customId;
	}
	public void setCustomId(long customId) {
		this.customId = customId;
	}
	public double getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(double totalCredit) {
		this.totalCredit = totalCredit;
	}
	
	@Override
	public String getFullname() {
		return lastname +","+ firstname;
	}
	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Merhaba";
	}
	
	
}

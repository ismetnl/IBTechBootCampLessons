package com.ibtech.inheritance;

public class Supplier extends Person{

	private long supplierId;
	private double totalCredit;
	
	public Supplier(long supplierId,String firstname, String lastname , double totalCredit) {
		super(firstname, lastname);
		this.supplierId = supplierId;
		this.totalCredit = totalCredit;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public double getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(double totalCredit) {
		this.totalCredit = totalCredit;
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Selamlar";
	}
	
	
	
}

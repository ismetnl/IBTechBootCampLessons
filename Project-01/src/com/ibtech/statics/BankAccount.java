package com.ibtech.statics;

public class BankAccount {
	
	private final static int MONTHS_IN_A_YEAR = 12;
	private double investment;
	private static double rate;
	
	
	public BankAccount(double investment) {
		super();
		this.investment = investment;
		
	}
	
	public double getAmount(int months) {
		return investment*(1+months*rate/(MONTHS_IN_A_YEAR*100));
	}
	
	public double getAmount() {
		return getAmount(MONTHS_IN_A_YEAR);
	}
	public BankAccount() {
		super();
	}


	public double getInvestment() {
		return investment;
	}
	public void setInvestment(double investment) {
		this.investment = investment;
	}
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		BankAccount.rate = rate;
	}
	
	
	
}

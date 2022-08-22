package com.ibtech.statics;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount.setRate(24);
		
		BankAccount account = new BankAccount(3000);
		System.out.println("Tutar 9 Aylık: "+account.getAmount(9));
		System.out.println("Tutar 1 Yıllık: "+account.getAmount());
		
		BankAccount.setRate(36);
		BankAccount account2 = new BankAccount(4000);
		System.out.println("Tutar 9 Aylık: "+account2.getAmount(9));
		System.out.println("Tutar 1 Yıllık: "+account2.getAmount());
		
	}
}

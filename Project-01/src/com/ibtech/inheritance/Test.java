package com.ibtech.inheritance;

public class Test {
	
	public static void main(String[] args) {
		Customer customer = new Customer(401,"Neşet","Ertaş",3450);
		customer.setEmailAdress("Neset@godoro.com");
		Person person = new Customer(402, "Mahsun", "Şerif", 6042);
		person.setEmailAdress("Mahsun@godoro.com");
		Supplier supplier = new Supplier(502, "Orhan", "Gencebay", 8042);
		supplier.setEmailAdress("Orhan@godoro.com");
		
		System.out.println(customer.getGreeting()+" "+customer.getFullname());
		System.out.println(person.getGreeting()+" "+person.getFullname());
		System.out.println(supplier.getGreeting()+" "+supplier.getFullname());
		
		
		sendMail(customer);
		sendMail(supplier);
		sendMail(person);
		
	}
	
	
	private static void sendMail(Person person) {
		System.out.println();
		System.out.println("Kime: "+person.getEmailAdress());
		System.out.println("Konu: "+person.getGreeting());
		System.out.println("Gövde: "+person.getFullname());
	}

}

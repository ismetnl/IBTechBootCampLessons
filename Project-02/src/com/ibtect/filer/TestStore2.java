package com.ibtect.filer;

import java.util.ArrayList;
import java.util.List;

public class TestStore2 {
	public static void main(String[] args) {
		try {
			List<Customer> customers = new ArrayList<>();
			customers.add(new Customer(601, "Cem Karaca", 6540));
			customers.add(new Customer(602, "Barış Manço", 6541));
			customers.add(new Customer(603, "Fikret kızılok", 6542));
			
			String filepath = "C:\\Users\\ISMETUNLU\\Desktop\\JavaIO\\Customer.txt";
			CustomerFiller customerFiller = new CustomerFiller(filepath);
			customerFiller.store(customers);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

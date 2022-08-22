package com.ibtech.collections;

import com.ibtech.inventory.Product;

public class ProductTest {
	public static void main(String[] args) {
		Product[] products = {
				new Product(501,"Cep Telefonu",3000),
				new Product(502,"Masaüstü Bilgisayar",6200),
				new Product(503,"Dizüstü Bilgisyar",7328),
		};
		
		for(Product product: products) {
			System.out.println(product.getProductId()+" "
					+product.getProductName()+" "
					+product.getSalesPrice());
		}
		
		double priceSum =0;
		int count = 0;
		
		for(Product product: products) {
			if(product.getSalesPrice() > 5000) {
				priceSum += product.getSalesPrice();
				count++;
			}
		}
		System.out.println("Eder Özetim: "+priceSum);
		double priceAverage = priceSum/count;
		System.out.println("Eder Ortalama: "+priceAverage);
	}
	
}

package com.ibtecth.pattern;

import java.util.List;

public class TestList {
	public static void main(String[] args) throws Exception {
		ProductManager productManager = new ProductManager();
		List<Product> products = productManager.list();
		
		for(Product product : products) {
			System.out.println(product.getProductId()+" "
					+product.getProductName()+" "
					+product.getSalesPrice());
		}
	}
}

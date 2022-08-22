package com.ibtecth.pattern;

import java.util.List;

public class TestPriceFilter {
	public static void main(String[] args) throws Exception {
		ProductManager productManager = new ProductManager();
		double salesPriceMin= 5000;
		List<Product> products = productManager.listBySalesPriceGrater(salesPriceMin);
		
		for(Product product : products) {
			System.out.println(product.getProductId()+" "
					+product.getProductName()+" "
					+product.getSalesPrice());
		}
	}
}

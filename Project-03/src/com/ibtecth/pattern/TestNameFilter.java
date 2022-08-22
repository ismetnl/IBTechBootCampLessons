package com.ibtecth.pattern;

import java.util.List;

public class TestNameFilter {
	public static void main(String[] args) throws Exception {
		ProductManager productManager = new ProductManager();
		String Filter= "%Bil%";
		List<Product> products = productManager.listByNameLikeFilter(Filter);
		
		for(Product product : products) {
			System.out.println(product.getProductId()+" "
					+product.getProductName()+" "
					+product.getSalesPrice());
		}
	}
}

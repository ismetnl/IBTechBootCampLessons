package com.ibtech.inventory;

public class ProductTest1 {
	public static void main(String[] args) {
		Product product = new Product();
		product.setProductId(501);
		product.setProductName("mouse");
		product.setSalesPrice(120);
		
		System.out.println(product.getProductId()+" "
				+product.getProductName()+" "
				+product.getSalesPrice());
	}
}

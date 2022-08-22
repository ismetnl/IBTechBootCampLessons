package com.ibtech.inventory;

public class ProductTest2 {
	public static void main(String[] args) {
		Product product = new Product(501,"mouse",120);
		
		System.out.println("Ürün Özdeşliği: "+product.getProductId());
		System.out.println("Ürün Adı: "+product.getProductName());
		System.out.println("Ürün Fiyatı: "+product.getSalesPrice());
		
	}
}

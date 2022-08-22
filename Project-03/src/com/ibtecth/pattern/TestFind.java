package com.ibtecth.pattern;

public class TestFind {
	public static void main(String[] args) {
		try {
			ProductManager productManager = new ProductManager();
			Product product = productManager.find(5);
			if(product != null) {
				System.out.println(product.getProductId()+ " "
						+product.getProductName()+ " "
						+product.getSalesPrice());
			}
			else {
				System.out.println("Ürün Bulunamadı");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

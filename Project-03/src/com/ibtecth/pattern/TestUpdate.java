package com.ibtecth.pattern;

public class TestUpdate {
	public static void main(String[] args) {
		
		try {
			ProductManager productManager = new ProductManager();
			Product product = new Product(11,"Kahve",9000);
			boolean updated = productManager.update(product);
			
			if(updated) {
				System.out.println("Ürün sokuldu");
			}
			else {
				System.out.println("Ürün sokulamadı");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package com.ibtecth.pattern;

public class TestDelete {
	public static void main(String[] args) {
		
		try {
			ProductManager productManager = new ProductManager();
			boolean updated = productManager.delete(11);
			
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

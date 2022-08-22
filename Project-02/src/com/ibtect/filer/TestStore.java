package com.ibtect.filer;

import java.util.ArrayList;
import java.util.List;

public class TestStore {
	public static void main(String[] args) {
		try {
			List<Supplier> supplierList = new ArrayList<>();
			supplierList.add(new Supplier(601, "Cem Karaca", 6540));
			supplierList.add(new Supplier(602, "Barış Manço", 6541));
			supplierList.add(new Supplier(603, "Fikret kızılok", 6542));
			
			String filepath = "C:\\Users\\ISMETUNLU\\Desktop\\JavaIO\\Suplier.txt";
			SupplierFiller supplierFiller = new SupplierFiller(filepath);
			supplierFiller.store(supplierList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

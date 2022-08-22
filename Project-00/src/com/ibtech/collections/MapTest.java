package com.ibtech.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> countryMap = new HashMap<String,String>();
		countryMap.put("tr","Türkiye");
		countryMap.put("az","Azerbeycan");
		
		
		for(String country: countryMap.values()) {
			System.out.println("* :"+ country);
		}
		
		for(String code: countryMap.keySet()) {
			String country = countryMap.get(code);
			System.out.println("# :"+ country);
		}
	} 
}

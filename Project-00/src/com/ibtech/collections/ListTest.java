package com.ibtech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> provinceList = new ArrayList<String>();
		provinceList.add("Ankara");
		provinceList.add("istanbul");
		provinceList.add("Van");
		provinceList.add("Tokat");
		provinceList.add("Çanakkale");
		provinceList.add("Muş");
		
		Collections.sort(provinceList,Collections.reverseOrder());
		
		String found = provinceList.get(3);
		System.out.println(found);
		provinceList.remove("Van");
		
		for(String province: provinceList) {
			System.out.println("* :"+province);
		}
	}

}

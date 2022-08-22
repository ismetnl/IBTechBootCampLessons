package com.ibtech.console;

import java.util.Formatter;

public class FormatTest {
	public static void main(String[] args) {
		long l = 3;
		String s = "Godoro";
		double d = 3.14556;
		
		System.out.printf("Uzun: %d Sicim: %-20s ikişer: %11.2f",l,s,d);
		
		Formatter formatter = new Formatter(System.out);
		formatter.format("Uzun: %d Sicim: %-20s ikişer: %11.2f",l,s,d);
		formatter.close();
		
		
	}
}

package com.ibtech.console;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Uzun:");
		long l = scanner.nextLong();
		
		System.out.println("Sicim:");
		String s = scanner.next();
		
		System.out.println("Double:");
		double d = scanner.nextDouble();
		scanner.close();
		System.out.printf("Uzun: %d Sicim: %-20s ikişer: %11.2f",l,s,d);
		
		
		
	}
}

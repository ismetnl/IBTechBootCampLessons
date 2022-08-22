package com.ibtech.enums;

public class DayTest {
	
	private static void printDay(Day day) {
		switch(day) {
		
		case MONDAY:
			System.out.println("Pazartesi");
			break;
		case TUESDAY:
			System.out.println("Salı");
			break;
		case WEDNESDAY:
			System.out.println("Çarşamba");
			break;
		default :
			System.out.println("Geçersiz giriş");
		
		}
	}
	public static void main(String[] args) {
		
		Day day = Day.WEDNESDAY;
		printDay(day);
	
	}
	
	
}

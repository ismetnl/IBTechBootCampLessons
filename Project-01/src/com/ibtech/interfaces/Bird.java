package com.ibtech.interfaces;

abstract public class Bird extends Animal implements Flyable{

	public Bird(String name) {
		super(name);
		
	}

	@Override
	public void fly() {
		System.out.println("Kuş "+name+" uçuyor..." );
	}

	@Override
	public void land() {
		System.out.println("Kuş "+name+" konuyor..." );
	}
	
	
}

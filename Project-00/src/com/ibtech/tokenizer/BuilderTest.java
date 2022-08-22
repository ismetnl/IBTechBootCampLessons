package com.ibtech.tokenizer;

public class BuilderTest {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Godoro: ");
		builder.append("HTML").append(", ");
		builder.append("CSS").append(". ");
		
		String string = builder.toString();
		
		System.out.println("Sicim: "+string);
		
		
		
		
		String string2 = new StringBuilder("Godoro: ")
						.append("HTML").append(", ")
						.append("CSS").append(". ")
						.toString();
		
		System.out.println("Sicim2: "+string2);
		
		
	}
}

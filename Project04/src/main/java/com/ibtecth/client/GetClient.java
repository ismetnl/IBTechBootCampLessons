package com.ibtecth.client;

import static com.ibtecth.utils.StreamUtilities.*;

public class GetClient {
	public static void main(String[] args) throws Exception {
		String adress = "http://localhost:8080/Project04/me";
		String text = get(adress);
		System.out.println("İçerik");
		System.out.println(text);
	}
}

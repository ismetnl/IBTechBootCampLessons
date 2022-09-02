package com.ibtecth.client;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.ibtecth.utils.StreamUtilities;

public class PostClient {
	public static void main(String[] args) throws Exception {
		
		String adress = "http://localhost:8080/Project04/post";
		String input = StreamUtilities.post(adress,"Giden");
		
		System.out.println("Girdi");
		System.out.println(input);
		
	}

	
}

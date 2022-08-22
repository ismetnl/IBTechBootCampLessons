package com.ibtect.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ResourceTest {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\ISMETUNLU\\Desktop\\out.txt";
		try(BufferedWriter bw= new BufferedWriter(new FileWriter(path));) {
			bw.write("Java\r\n");
			bw.write("JDBC\r\n");
			bw.write("JAXP\r\n");
			bw.write("JSON-P\r\n");
			bw.write("JSON\r\n");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	

	}
}

package com.ibtecth.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestFind {
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:postgresql://localhost/dbgodoro";
		String user = "postgres";
		String password = "209152Ok";
		String driver = "org.postgresql.Driver";
		Class.forName(driver);
		
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="select * from product where productid = ?";
		PreparedStatement statement =  connection.prepareStatement(sql);
		statement.setDouble(1, 3);
		ResultSet resultSet = statement.executeQuery();
		
		
		if(resultSet.next()) {
			long productid = resultSet.getLong("productId");
			String productName = resultSet.getString("productName");
			double salesPrice = resultSet.getDouble("salesPrice");
			
			System.out.println(productid+" "+productName+" "+salesPrice);
		}
		
		
		connection.close();
		
	}
}

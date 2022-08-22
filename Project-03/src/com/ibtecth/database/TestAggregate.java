package com.ibtecth.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestAggregate {
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:postgresql://localhost/dbgodoro";
		String user = "postgres";
		String password = "209152Ok";
		String driver = "org.postgresql.Driver";
		Class.forName(driver);
		
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="select avg(salesprice) as averageprice from product";
		PreparedStatement statement =  connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		
		
		if(resultSet.next()) {
			double averagePrice = resultSet.getDouble("averageprice");
			
			System.out.println("Ortalama değer: "+averagePrice);
		}
		
		
		connection.close();
		
	}
}

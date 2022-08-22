package com.ibtecth.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductManager {
	
	private String url = "jdbc:postgresql://localhost/dbgodoro";
	private String user = "postgres";
	private String password = "209152Ok";
	private String driver = "org.postgresql.Driver";
	
	
	
	public ProductManager() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	


	public Product find(long productId) throws Exception{
		Product product = null;
		

		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="select * from product where productid = ?";
		PreparedStatement statement =  connection.prepareStatement(sql);
		statement.setDouble(1, productId);
		ResultSet resultSet = statement.executeQuery();
		
		
		if(resultSet.next()) {
			product = parse(resultSet);
			return product;
		}
		
		connection.close();
		return product;
		
	}

	
	
	public List<Product> list() throws Exception{
		
		List<Product> products = new ArrayList<>();
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="select * from product";
		PreparedStatement statement =  connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		
		products = parseList(products, resultSet);
		
		
		connection.close();
		
		
		return products;
	}
	
	
	
	public List<Product> listBySalesPriceGrater(double salesPriceMin) throws Exception{
		
		List<Product> products = new ArrayList<>();
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="select * from product where salesPrice > ?";
		PreparedStatement statement =  connection.prepareStatement(sql);
		statement.setDouble(1, salesPriceMin);
		ResultSet resultSet = statement.executeQuery();
		
		products = parseList(products, resultSet);
		
		
		connection.close();
		
		
		return products;
	}
	
	public List<Product> listByNameLikeFilter(String Filter) throws Exception{
		
		List<Product> products = new ArrayList<>();
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="select * from product where productName like ?";
		PreparedStatement statement =  connection.prepareStatement(sql);
		statement.setString(1, Filter);
		ResultSet resultSet = statement.executeQuery();
		
		products = parseList(products, resultSet);
		
		
		connection.close();
		
		
		return products;
	}
	
	private Product parse(ResultSet resultSet) throws SQLException {
		Product product;
		long productid = resultSet.getLong("productId");
		String productName = resultSet.getString("productName");
		double salesPrice = resultSet.getDouble("salesPrice");
		
		product = new Product(productid,productName,salesPrice);
		return product;
	}
	private List<Product> parseList(List<Product> products, ResultSet resultSet) throws SQLException {
		
		while(resultSet.next()) {
			
			Product product = parse(resultSet);
			products.add(product);
		}
		return products;
		
	}
	
	public boolean delete(long productId) throws Exception{
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="delete from Product where productId=?";
		PreparedStatement statement =  connection.prepareStatement(sql);
		statement.setDouble(1, productId);
		int affected = statement.executeUpdate();
		
		connection.close();
		
		System.out.println("Etkilenmiş "+affected);
		
		return affected>0;
	}
	
	public boolean update(Product product) throws Exception{
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="update Product set productName=?, salesPrice=? where productId=?";
		PreparedStatement statement =  connection.prepareStatement(sql);
		statement.setString(1, product.getProductName());
		statement.setDouble(2, product.getSalesPrice());
		statement.setDouble(3, product.getProductId());
		int affected = statement.executeUpdate();
		
		connection.close();
		
		System.out.println("Etkilenmiş "+affected);
		return affected>0;
	}


	public boolean insert(Product product) throws Exception{
	
		Class.forName(driver);
		
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="insert into Product(productname,salesprice) values (?,?)";
		PreparedStatement statement =  connection.prepareStatement(sql);
		statement.setString(1, product.getProductName());
		statement.setDouble(2, product.getSalesPrice());
		
		int affected = statement.executeUpdate();
		
		connection.close();
		
		System.out.println("Etkilenmiş "+affected);
		return affected>0;
	}
	
}	

package com.ibtecth.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AggregateList {
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:postgresql://localhost/dbgodoro";
		String user = "postgres";
		String password = "209152Ok";
		String driver = "org.postgresql.Driver";
		Class.forName(driver);
		
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="select e.departmentid,d.departmentname ,sum(monthsalary) as sumsalary\r\n"
				+ "from employee e \r\n"
				+ "	right join department d on e.departmentid = d.departmentid  \r\n"
				+ "group by e.departmentid,d.departmentname  ";
		PreparedStatement statement =  connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		
		
		while(resultSet.next()) {
			long departmentId = resultSet.getLong("departmentId");
			String departmentName = resultSet.getString("departmentName");
			double sumSalary = resultSet.getDouble("sumSalary");
			
			System.out.println(departmentId+" "+departmentName+" "+sumSalary);
		}
		
		
		connection.close();
		
	}
}

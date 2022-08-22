package com.ibtecth.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RelationList {
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:postgresql://localhost/dbgodoro";
		String user = "postgres";
		String password = "209152Ok";
		String driver = "org.postgresql.Driver";
		Class.forName(driver);
		
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String sql ="select e.employeeid,e.employeename,e.monthsalary,d.departmentid,d.departmentname \r\n"
				+ "from employee e \r\n"
				+ "	left join department d on e.departmentid = d.departmentid  ";
		PreparedStatement statement =  connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		
		while(resultSet.next()) {
			long employeeid = resultSet.getLong("employeeid");
			String employeename = resultSet.getString("employeename");
			double monthsalary = resultSet.getDouble("monthsalary");
			long departmentid = resultSet.getLong("departmentid");
			String departmentName = resultSet.getString("departmentName");
			
			System.out.println(employeeid+" "+employeename+" "+monthsalary+" "
			+departmentName+" "+departmentid);
		}
		
		
		connection.close();
		
	}
}

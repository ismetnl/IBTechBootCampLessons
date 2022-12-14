package com.ibtech.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFind {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		
		long employeeId = 1;
		Employee employee = manager.find(Employee.class, employeeId);
		
		manager.close();
		factory.close();
		
		System.out.println(employee.getEmployeeId()+" "
				+employee.getEmployeeName()+" "
				+employee.getMonthlySalary());
	}
}

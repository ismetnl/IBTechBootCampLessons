package com.ibtech.orm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmployeeQuery {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		String jpql = "select e from Employee e";
		TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
		List<Employee> employees = query.getResultList();
	
		manager.close();
		factory.close();
		
		for(Employee employee: employees) {
			System.out.println(employee.getEmployeeId()+" "
					+employee.getEmployeeName()+" "
					+employee.getMonthlySalary());
		}
	
	}
}

package com.ibtech.orm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmployeeAggregate {
	public static void main(String[] args) {
		
		double monthlySalaryMin = 15000.0;
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		String jpql = "select e from Employee e where e.monthlySalary > :monthlySalaryMin";
		TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
		query.setParameter("monthlySalaryMin", monthlySalaryMin);
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

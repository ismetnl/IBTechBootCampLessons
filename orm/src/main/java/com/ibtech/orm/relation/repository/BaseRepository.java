package com.ibtech.orm.relation.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.ibtech.orm.Employee;



public class BaseRepository <E>{

	private static EntityManagerFactory factory;
	
	private Class<E> clazz;
	
	

	public BaseRepository(Class<E> clazz) {
		this.clazz = clazz;
	}

	protected static EntityManagerFactory getFactory() {

		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
			System.out.println("Varlık işletmecisi üretimliği yaratıldı");
		}

		return factory;
	}
	
	public EntityManager newManager() {
		return getFactory().createEntityManager();
	}
	
	public void insert(E entity){
		
		EntityManager manager = newManager();
		
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public E find(long id){
		EntityManager manager = newManager();
		E entity = manager.find(clazz, id);
		manager.close();		
		return entity;
	}
	
	public List<E> getList(){
		EntityManager manager = newManager();
		
		String entityName = clazz.getSimpleName();
		String jpql = String.format("select e from %s e", entityName);
		TypedQuery<E> query = manager.createQuery(jpql, clazz);
		List<E> entity = query.getResultList();
	
		manager.close();
		return entity;
	}
}

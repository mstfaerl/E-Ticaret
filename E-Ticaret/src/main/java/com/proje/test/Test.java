package com.proje.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		@SuppressWarnings("unused")
		EntityManager entityManager = factory.createEntityManager();
		
		
	}
	

}

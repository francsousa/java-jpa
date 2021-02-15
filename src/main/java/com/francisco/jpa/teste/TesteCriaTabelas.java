package com.francisco.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCriaTabelas {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		@SuppressWarnings("unused")
		EntityManager createEntityManager = emf.createEntityManager();
		emf.close();
	}
}

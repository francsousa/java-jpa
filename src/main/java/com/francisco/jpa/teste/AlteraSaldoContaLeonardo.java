package com.francisco.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.francisco.jpa.modelo.Conta;

public class AlteraSaldoContaLeonardo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta contaDoLeonardo = em.find(Conta.class, 1L);
		
		em.getTransaction().begin();
		
		contaDoLeonardo.setSaldo(20.0);
		
		
		em.getTransaction().commit();
	}
}

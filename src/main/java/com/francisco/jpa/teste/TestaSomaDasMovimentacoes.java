package com.francisco.jpa.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestaSomaDasMovimentacoes {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();

		String jpql = "select sum(m.valor) from Movimentacao m";

		TypedQuery<BigDecimal> query = em.createQuery(jpql, BigDecimal.class);
		BigDecimal somaDasMovimentacoes = query.getSingleResult();

		System.out.println("A soma das movimentações é: " + somaDasMovimentacoes);

		String jpqlMediaMovimentacao = "select avg(m.valor) from Movimentacao m";

		TypedQuery<Double> query2 = em.createQuery(jpqlMediaMovimentacao, Double.class);
		Double mediaDasMovimentacoes = query2.getSingleResult();

		System.out.println("A média das movimentações é: " + mediaDasMovimentacoes);
	}

}

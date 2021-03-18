package com.francisco.jpa.modelo.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.francisco.jpa.modelo.MediaComData;
import com.francisco.jpa.modelo.Movimentacao;

public class MovimentacaoDao {

	private EntityManager em;

	public MovimentacaoDao(EntityManager em) {
		this.em = em;
	}

	public List<Movimentacao> getMovimentacoesFiltradasPorData(Integer dia, Integer mes, Integer ano) {
		
		String sql = "select m from Movimentacao m where";

		if (dia != null) {
			sql = sql + " day(m.data) = :pDia";
		}

		if (mes != null) {
			sql = sql + " and month(m.data) = :pMes";
		}
		
		if (ano != null) {
			sql = sql + " and year(m.data) = :pAno";
		}

		return null;
	}

	public List<MediaComData> getMediaDiariaDasMovimentacoes() {

		TypedQuery<MediaComData> query = em.createNamedQuery("mediaDiariaMovimentacoes", MediaComData.class);
		return query.getResultList();
	}

	public BigDecimal getSomaDasMovimentacoes() {

		String jpql = "select sum(m.valor) from Movimentacao m";

		TypedQuery<BigDecimal> query = em.createQuery(jpql, BigDecimal.class);
		BigDecimal somaDasMovimentacoes = query.getSingleResult();

		return somaDasMovimentacoes;
	}
}

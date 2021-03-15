package com.francisco.jpa.teste;

import java.util.List;

import com.francisco.jpa.modelo.MediaComData;
import com.francisco.jpa.modelo.dao.MovimentacaoDao;

public class TestaMediaDiariaDasMovimentacoes {

	public static void main(String[] args) {

		List<MediaComData> somaDasMovimentacoes = new MovimentacaoDao().getMediaDiariaDasMovimentacoes();
		
		for (MediaComData resultado : somaDasMovimentacoes) {
			System.out.println("A média das movimentações do dia " + resultado.getDia() + "/" + resultado.getMes() + " é: " + resultado.getValor());
		}
	}
}

package br.edu.univas.si5.bd2.runners;

import br.edu.univas.si5.bd2.dao.CandidatosDAO;
import br.edu.univas.si5.bd2.dao.VagaDAO;
import br.edu.univas.si5.bd2.dao.VagaDetalhesDAO;

public class Deleta {

	public static void main(String[] args) {
		CandidatosDAO candidatosDAO = new CandidatosDAO();
		//Para realizar as operações verique as pk's geradas no banco pelo sequence
		int pk_Cand = 9;
		candidatosDAO.deletar(pk_Cand);
		
		VagaDAO vagaDAO = new VagaDAO();
		//Para realizar as operações verique as pk's geradas no banco pelo sequence
		int pk_Vaga = 12;
		vagaDAO.deletar(pk_Vaga);
		
		VagaDetalhesDAO detalhesDAO = new VagaDetalhesDAO();
		//Para realizar as operações verique as pk's geradas no banco pelo sequence
		int pk_detalhes = 15;
		detalhesDAO.deletar(pk_detalhes);
	}

}

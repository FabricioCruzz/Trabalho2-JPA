package br.edu.univas.si5.bd2.runners;

import br.edu.univas.si5.bd2.dao.CandidatosDAO;
import br.edu.univas.si5.bd2.dao.VagaDAO;
import br.edu.univas.si5.bd2.dao.VagaDetalhesDAO;
import br.edu.univas.si5.bd2.entities.Candidatos;
import br.edu.univas.si5.bd2.entities.Vaga;
import br.edu.univas.si5.bd2.entities.VagaDetalhes;

public class Consulta {

	public static void main(String[] args) {
				
		//Consultando candidatos
		CandidatosDAO candidatosDAO = new CandidatosDAO();
		//Para realizar as operações verique as pk's geradas no banco pelo sequence
		int pk_Cand = 11;
		Candidatos candidato = candidatosDAO.consultar(pk_Cand);
		if(candidato != null) {
			System.out.println(candidato.toString());
		}
		
		//Consultando vagas
		VagaDAO vagaDAO = new VagaDAO();
		//Para realizar as operações verique as pk's geradas no banco pelo sequence
		int pk_Vaga = 14;
		Vaga vaga = vagaDAO.consultar(pk_Vaga);
		if(vaga != null) {
			System.out.println(vaga.toString());			
		}
		
		//Consultando Detalhes da Vaga
		VagaDetalhesDAO detalhesDAO = new VagaDetalhesDAO();
		//Para realizar as operações verique as pk's geradas no banco pelo sequence
		int pk_Detalhes = 19;
		VagaDetalhes detalhes = detalhesDAO.consultar(pk_Detalhes);
		if(detalhes != null) {
			System.out.println(detalhes.toString());			
		}
	}

}

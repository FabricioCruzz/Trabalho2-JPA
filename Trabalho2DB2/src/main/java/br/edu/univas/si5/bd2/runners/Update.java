package br.edu.univas.si5.bd2.runners;

import java.util.Date;

import br.edu.univas.si5.bd2.dao.CandidatosDAO;
import br.edu.univas.si5.bd2.dao.VagaDAO;
import br.edu.univas.si5.bd2.dao.VagaDetalhesDAO;
import br.edu.univas.si5.bd2.entities.Candidatos;
import br.edu.univas.si5.bd2.entities.Vaga;
import br.edu.univas.si5.bd2.entities.VagaDetalhes;

public class Update {

	public static void main(String[] args) {
		
		CandidatosDAO candidatosDAO = new CandidatosDAO();
		//Para realizar as operações verique as pk's geradas no banco pelo sequence
		int pk_Cand = 15;
		Candidatos candidato = candidatosDAO.consultar(pk_Cand);
		if(candidato != null) {
			candidato.setNome("Eliana");
			candidato.setEmail("eliana@mail.com");
			candidato.setDataNasc(new Date());
			candidatosDAO.atualizar(candidato);
		}
		else {
			System.out.println("Candidato não encontrado!");
		}
		
		VagaDAO vagaDAO = new VagaDAO();
		//Para realizar as operações verique as pk's geradas no banco pelo sequence
		int pk_Vaga = 16;
		Vaga vaga = vagaDAO.consultar(pk_Vaga);
		if(vaga != null) {
			vaga.setContratante("Empresa DEF");
			vagaDAO.atualizar(vaga);
		}
		else {
			System.out.println("Vaga não encontrada!");
		}
		
		VagaDetalhesDAO vagaDetalhesDAO = new VagaDetalhesDAO();
		//Para realizar as operações verique as pk's geradas no banco pelo sequence
		int pk_Detalhes = 21;
		VagaDetalhes detalhes = vagaDetalhesDAO.consultar(pk_Detalhes);
		if(detalhes != null) {
			detalhes.setArea("Infraestrutura");
			detalhes.setSalario(1200f);
			detalhes.setNomeVaga("Estagiário");
			vagaDetalhesDAO.atualizar(detalhes);
		}
		else {
			System.out.println("Detalhes não encontrados!");
		}
	}

}

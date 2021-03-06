package br.edu.univas.si5.bd2.runners;

import java.util.Date;

import br.edu.univas.si5.bd2.dao.CandidatosDAO;
import br.edu.univas.si5.bd2.dao.VagaDAO;
import br.edu.univas.si5.bd2.dao.VagaDetalhesDAO;
import br.edu.univas.si5.bd2.entities.Candidatos;
import br.edu.univas.si5.bd2.entities.Vaga;
import br.edu.univas.si5.bd2.entities.VagaDetalhes;

public class Persistencia {

	public static void main(String[] args) {
		CandidatosDAO candidatosDAO = new CandidatosDAO();
		VagaDAO vagaDAO = new VagaDAO();
		VagaDetalhesDAO vagaDetalhesDAO = new VagaDetalhesDAO();
		
		VagaDetalhes detalhes = new VagaDetalhes();
		detalhes.setArea("Desenvolvimento");
		detalhes.setSalario(10000f);
		detalhes.setNomeVaga("Gerente de Projeto");
	
		vagaDetalhesDAO.persistir(detalhes);
		
		Vaga vaga = new Vaga();
		vaga.setContratante("Empresa ABC");
		vaga.setDetalhes(detalhes);
		
		vagaDAO.persistir(vaga);

		Candidatos candidato = new Candidatos();
		candidato.setNome("Jonas");
		candidato.setEmail("jonas@mail.com");
		candidato.setDataNasc(new Date());
		candidato.setVaga(vaga);
		
		candidatosDAO.persistir(candidato);
		
	}

}

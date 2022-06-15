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
		detalhes.setArea("UX");
		detalhes.setSalario(5000f);
		detalhes.setNomeVaga("Designer");
	
		vagaDetalhesDAO.persistir(detalhes);
		
		Vaga vaga = new Vaga();
		vaga.setContratante("Empresa 3");
		vaga.setDetalhes(detalhes);
		
		vagaDAO.persistir(vaga);

		Candidatos candidato = new Candidatos();
		candidato.setNome("Ramon");
		candidato.setEmail("ramon@mail.com");
		candidato.setDataNasc(new Date());
		candidato.setVaga(vaga);
		
		candidatosDAO.persistir(candidato);
		
	}

}

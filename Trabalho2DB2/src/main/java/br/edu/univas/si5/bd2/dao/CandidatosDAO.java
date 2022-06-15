package br.edu.univas.si5.bd2.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Candidatos;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class CandidatosDAO {
	
	private EntityManager em = HibernateUtil.getEntityManager();
	
	public void persistir(Candidatos candidato) {
		em.getTransaction().begin();
		em.persist(candidato);
		em.getTransaction().commit();
	}
	
	public Candidatos consultar(Integer primaryKey) {
		Candidatos objCand = em.find(Candidatos.class, primaryKey);
		
		if(objCand == null) {
			System.out.println("Não existe candidato com primaryKey " + primaryKey + ". objCand é null!");
		}
		else {
			System.out.println("Consulta realizada com sucesso!");
		}
		return objCand;
	}
	
	public void atualizar(Candidatos candidato) {
		if(candidato != null) {
			em.getTransaction().begin();
			em.merge(candidato);
			em.getTransaction().commit();
		}
		else {
			System.out.println("Erro! Candidato é null!");
		}
	}
	
	public void deletar(Integer primaryKey) {
		Candidatos objCand = em.find(Candidatos.class, primaryKey);
		if(objCand != null) {
			em.getTransaction().begin();
			em.remove(objCand);
			em.getTransaction().commit();
			
			System.out.println("Exclusão realizada com sucesso!");
		}
		else {
			System.out.println("Objeto com a primaryKey: " + primaryKey + " não encontrado!");
		}
	}

}

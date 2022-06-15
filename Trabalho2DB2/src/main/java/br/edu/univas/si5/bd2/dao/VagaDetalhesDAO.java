package br.edu.univas.si5.bd2.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.VagaDetalhes;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class VagaDetalhesDAO {
	
	private EntityManager em = HibernateUtil.getEntityManager();
	
	public void persistir(VagaDetalhes detalhes) {
		em.getTransaction().begin();
		em.persist(detalhes);
		em.getTransaction().commit();
		System.out.println("Persistência realizada com sucesso!");
	}
	
	public VagaDetalhes consultar(Integer primaryKey) {
		VagaDetalhes objDet = em.find(VagaDetalhes.class, primaryKey);
		
		if(objDet == null) {
			System.out.println("Não existe detalhes com primaryKey " + primaryKey + ". objDet é null!");
		}
		else {
			System.out.println("Consulta realizada com sucesso!");
		}
		return objDet;
	}
	
	public void atualizar(VagaDetalhes detalhes) {
		if(detalhes != null) {
			em.getTransaction().begin();
			em.merge(detalhes);
			em.getTransaction().commit();
			System.out.println("Detalhes atualizados com sucesso!");
		}
		else {
			System.out.println("Erro! Detalhes é null!");
		}
	}
	
	public void deletar(Integer primaryKey) {
		VagaDetalhes objDet = em.find(VagaDetalhes.class, primaryKey);
		if(objDet != null) {
			em.getTransaction().begin();
			em.remove(objDet);
			em.getTransaction().commit();
			
			System.out.println("Exclusão realizada com sucesso!");
		}
		else {
			System.out.println("Objeto com a primaryKey: " + primaryKey + " não encontrado!");
		}
	}

}

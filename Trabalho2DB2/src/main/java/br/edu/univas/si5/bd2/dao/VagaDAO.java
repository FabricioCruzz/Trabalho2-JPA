package br.edu.univas.si5.bd2.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Vaga;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class VagaDAO {
	
	private EntityManager em = HibernateUtil.getEntityManager();
	
	public void persistir(Vaga vaga) {
		em.getTransaction().begin();
		em.persist(vaga);
		em.getTransaction().commit();
		System.out.println("Persistência realizada com sucesso!");
	}
	
	public Vaga consultar(Integer primaryKey) {
		Vaga objVaga = em.find(Vaga.class, primaryKey);
		
		if(objVaga == null) {
			System.out.println("Não existe vaga com primaryKey " + primaryKey + ". objVaga é null!");
		}
		else {
			System.out.println("Consulta realizada com sucesso!");
		}
		return objVaga;
	}
	
	public void atualizar(Vaga vaga) {
		if(vaga != null) {
			em.getTransaction().begin();
			em.merge(vaga);
			em.getTransaction().commit();
			System.out.println("Vaga atualizada com sucesso!");
		}
		else {
			System.out.println("Erro! Vaga é null!");
		}
	}
	
	public void deletar(Integer primaryKey) {
		Vaga objVaga = em.find(Vaga.class, primaryKey);
		if(objVaga != null) {
			em.getTransaction().begin();
			em.remove(objVaga);
			em.getTransaction().commit();
			
			System.out.println("Exclusão realizada com sucesso!");
		}
		else {
			System.out.println("Objeto com a primaryKey: " + primaryKey + " não encontrado!");
		}
	}

}

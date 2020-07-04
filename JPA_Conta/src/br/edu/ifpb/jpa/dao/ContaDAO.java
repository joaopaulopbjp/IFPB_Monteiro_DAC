package br.edu.ifpb.jpa.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.edu.ifpb.jpa.entidades.Conta;

public class ContaDAO {

	private EntityManagerFactory emf;

	public ContaDAO(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public void adiciona(Conta conta) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();

		em.close();

	}
	
	public void altera(Conta conta) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();

		em.close();

	}

}

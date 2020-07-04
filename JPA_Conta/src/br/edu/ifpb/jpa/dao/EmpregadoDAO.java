package br.edu.ifpb.jpa.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.edu.ifpb.jpa.entidades.Conta;
import br.edu.ifpb.jpa.entidades.Empregado;

public class EmpregadoDAO {

	private EntityManagerFactory emf;

	public EmpregadoDAO(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public void adiciona(Empregado emp) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		em.close();

	}

}

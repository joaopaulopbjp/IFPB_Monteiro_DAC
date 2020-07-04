package br.edu.ifpb.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpb.jpa.dao.ContaDAO;
import br.edu.ifpb.jpa.entidades.Conta;
import br.edu.ifpb.jpa.entidades.ContaTipo;

public class TesteConta {

	public static void main(String[] args) {

//		Conta conta = new Conta();
//		conta.setTitular("Leonardo");
//		conta.setBanco("Caixa Economica");
//		conta.setAgencia("123");
//		conta.setNumero("456-X");
//		conta.setTipo(ContaTipo.SALARIO);
//		conta.setTipo(ContaTipo.POUPANCA);

		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
//		ContaDAO dao = new ContaDAO(emf);
//		dao.adiciona(conta);
		
		
		EntityManager em = emf.createEntityManager();
		
//		Conta conta2 = new Conta();
//		conta2.setTitular("João Paulo");
//		conta2.setBanco("BB");
//		conta2.setAgencia("123");
//		conta2.setNumero("123-X");
//		
//		em.getTransaction().begin();
//		em.persist(conta2);
//		em.getTransaction().commit();
//
//		em.close();
		
		
		
//		em = emf.createEntityManager();
//		
//		Conta conta2 = new Conta();
//		conta2.setId(3);
//		
//		em.getTransaction().begin();
//
////		conta2 = em.merge(conta2);
//		conta2.setTitular("João Paulo Lopes");
//
//		em.getTransaction().commit();
//
//		em.close();
//		
//		
		
		
//		em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//
//		Conta conta3 = em.find(Conta.class,3);
//		em.remove(conta3);
//		
//		Conta conta4 = em.find(Conta.class,5);
//		em.remove(conta4);
//		
//		em.getTransaction().commit();
//
//		em.close();

	}
}

package br.edu.ifpb.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpb.jpa.entidades.Conta;

/**
 * Created by leonardocordeiro on 24/02/17.
 */
public class TesteBuscaConta {

    public static void main(String[] args) {

		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");

        EntityManager em =  emf.createEntityManager();;
        em.getTransaction().begin();

        Conta conta = em.find(Conta.class, 1);

        em.getTransaction().commit();
        em.close();
    }

}

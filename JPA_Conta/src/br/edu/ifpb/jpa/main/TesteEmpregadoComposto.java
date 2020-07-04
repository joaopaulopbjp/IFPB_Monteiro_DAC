package br.edu.ifpb.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpb.jpa.entidades.EmpregadoComposto;
import br.edu.ifpb.jpa.entidades.EmpregadoEmbId;
import br.edu.ifpb.jpa.entidades.EmpregadoId;

public class TesteEmpregadoComposto {

	public static void main(String[] args) {


//		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
//		EntityManager em = emf.createEntityManager();
//
//		
//		EmpregadoComposto empComp = new EmpregadoComposto();
//		empComp.setNome("JOAO PAULO");
//		empComp.setEmail("paulo.lopes@academico.ifpb.edu.br");
//		empComp.setMatricula(mat);
//		empComp.setCpf(cpf);
//		
//		em.getTransaction().begin();
//		em.persist(empComp);
//		em.getTransaction().commit();
//		
//		em.close();
//
//		em = emf.createEntityManager();
//
//
//
//		String cpf = "012.137.094-78";
//		String mat = "3457812";
//		EmpregadoId pk = new EmpregadoId(cpf,mat);
//		EmpregadoComposto empCompConsulta = em.find(EmpregadoComposto.class, pk);
//
//		
//		
//		
//		
//		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
//		EntityManager em = emf.createEntityManager();
//
//		String cpf = "012.137.095-81";
//		String mat = "3457815";
//		EmpregadoEmbId pk = new EmpregadoEmbId(cpf,mat);
//		
//		EmpregadoComposto empComp = new EmpregadoComposto();
//		empComp.setNome("JOAO PAULO Emb");
//		empComp.setEmail("paulo.lopes.emb@academico.ifpb.edu.br");
//		empComp.setId(pk);
//		
//		em.getTransaction().begin();
//		em.persist(empComp);
//		em.getTransaction().commit();
//		
//		em.close();
//
//		
//		em = emf.createEntityManager();
//
//		
//		EmpregadoComposto empCompConsulta = em.find(EmpregadoComposto.class, pk);

	}
}

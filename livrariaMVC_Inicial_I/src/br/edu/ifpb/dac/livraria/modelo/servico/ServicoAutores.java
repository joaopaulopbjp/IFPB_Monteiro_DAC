package br.edu.ifpb.dac.livraria.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.ifpb.dac.livraria.modelo.Autor;

public class ServicoAutores{
	
	public ServicoAutores() {
		
	}
		
	public void salva(Autor autor) {
	    System.out.println("[INFO] Salvando o Autor " + autor.getNome());
	    EntityManager manager = new JPAUtils().getEntityManager();
	    manager.getTransaction().begin();
	    manager.persist(autor);
	    manager.getTransaction().commit();
	    System.out.println("[INFO] Salvou o Autor " + autor.getNome());
	}
	
	
	public List<Autor> listarTodosAutores() {
	    EntityManager manager = new JPAUtils().getEntityManager();

	    //TODO Realizar uma consulta usando JPA para retornar uma lista com todos os autores do banco
		return manager.createQuery("select a from Autor a",Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
	    EntityManager manager = new JPAUtils().getEntityManager();

	    //TODO Realizar uma consulta usando JPA para buscar o autor pelo id
		Autor autor = manager.find(Autor.class,autorId);
		
		return autor;
	}
	
	public void altera(Autor autor) {
		System.out.println("[INFO] Alterando o Autor " + autor.getNome());
	    EntityManager manager = new JPAUtils().getEntityManager();
	    manager.getTransaction().begin();
	    manager.merge(autor);
	    manager.getTransaction().commit();
	    System.out.println("[INFO] Autor " + autor.getNome()+" alterado com sucesso.");	
	}

	public void remove(int id) {
		System.out.println("[INFO] Removendo o Autor com id: " + id);
		
		Autor autor = new Autor();
		autor.setId(id);
		
	    EntityManager manager = new JPAUtils().getEntityManager();
	    manager.getTransaction().begin();
	    autor = manager.merge(autor);
	    manager.remove(autor);
	    manager.getTransaction().commit();
	    System.out.println("[INFO] Autor com id: " + id+" removido com sucesso.");
		
	}
}	

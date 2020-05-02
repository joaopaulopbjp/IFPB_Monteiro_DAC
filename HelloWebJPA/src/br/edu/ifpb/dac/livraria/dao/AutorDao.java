package br.edu.ifpb.dac.livraria.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.ifpb.dac.livraria.modelo.Autor;

@Stateless
public class AutorDao {
	@PersistenceContext(unitName = "livraria")
	private EntityManager manager;
	
	@PostConstruct
	void aposCriacao() {

   	   	List<Autor> autores = todosAutores(); 
   	   	
   	   	if (autores == null || autores.isEmpty()) {
			Autor autorMartin = new Autor();
			autorMartin.setNome("Martin Fowler");
			Autor autorTanembaum = new Autor();
			autorTanembaum.setNome("Tanembaum");
			
			manager.persist(autorMartin);
			manager.persist(autorTanembaum);
		}

	    System.out.println("[INFO] AutorDao foi criado.");
	}
	
	public void salva(Autor autor) {
	    System.out.println("[INFO] Salvando o Autor " + autor.getNome());

	    manager.persist(autor);
	    System.out.println("[INFO] Salvou o Autor " + autor.getNome());
	}
	
	public List<Autor> todosAutores() {
		return manager.createQuery("select a from Autor a",Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = manager.find(Autor.class,autorId);
		
		return autor;
	}
	
}

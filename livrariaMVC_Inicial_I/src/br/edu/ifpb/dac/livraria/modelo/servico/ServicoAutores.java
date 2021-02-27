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
	    
		return null;
	}

	public Autor buscaPelaId(Integer autorId) {
	    EntityManager manager = new JPAUtils().getEntityManager();

	    //TODO Realizar uma consulta usando JPA para buscar o autor pelo id
				
		return null;
	}
}	

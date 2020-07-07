package br.edu.ifpb.dac.livraria.servico;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.ifpb.dac.livraria.modelo.Autor;
import br.edu.ifpb.dac.livraria.modelo.Livro;

/**
 * Session Bean implementation class ServicoLivros
 */
@Stateless
public class ServicoLivros {

	@PersistenceContext
	private EntityManager manager;
	
	@PostConstruct
	void aposCriacao() {
	    System.out.println("[INFO] ServicoLivros foi criado.");
	}
	
	public void salva(Livro livro) {
	    System.out.println("[INFO] Salvando o Livro " + livro.getTitulo());
	    manager.persist(livro);
	    System.out.println("[INFO] Salvou o Livro " + livro.getTitulo());
	}
	
	public List<Livro> todosLivros() {
		return manager.createQuery("select l from Livro l",Livro.class).getResultList();
	}

	public Livro buscaPelaId(Integer livroId) {
		Livro livro = manager.find(Livro.class,livroId);
		
		return livro;
	}

	public void altera(Livro livro) {
		System.out.println("[INFO] Alterando o Livro " + livro.getTitulo());
	    manager.merge(livro);
	    System.out.println("[INFO] Livro " + livro.getTitulo()+" alterado com sucesso.");	
	}
}

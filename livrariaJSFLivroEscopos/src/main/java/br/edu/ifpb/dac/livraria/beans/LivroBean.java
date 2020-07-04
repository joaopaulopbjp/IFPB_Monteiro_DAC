package br.edu.ifpb.dac.livraria.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.edu.ifpb.dac.livraria.modelo.Autor;
import br.edu.ifpb.dac.livraria.modelo.Livro;
import br.edu.ifpb.dac.livraria.servico.ServicoAutores;
import br.edu.ifpb.dac.livraria.servico.ServicoLivros;

@Named
@ViewScoped
public class LivroBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Livro livro = new Livro();
	private List<Autor> autores;
	private Integer autorId;
	private List<Autor> autoresLivro;
	private List<Livro> livros;
	@EJB
	private ServicoLivros servicoLivro;
	@EJB
	private ServicoAutores servicoAutor;
	
	public LivroBean() {
		
	}
	
	@PostConstruct
	public void init() {
		livros = this.servicoLivro.todosLivros();
		autores = servicoAutor.todosAutores();
		autoresLivro = new ArrayList<Autor>();
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	
	public void adicionaAutorLivro() {
		System.out.println("AdicionaAutor - Livro - AutorID: "+autorId);
		Autor autor = servicoAutor.buscaPelaId(autorId);
		System.out.println("AdicionaAutor - Livro: "+autor.getNome());
		autoresLivro.add(autor);
	}
	
	public void cadastra() {
		System.out.println("Cadastra - Livro: "+livro.getTitulo());
		System.out.println("Cadastra - Livro - AutoresdoLivro: "+autoresLivro.size());
		livro.setAutores(autoresLivro);
		this.servicoLivro.salva(livro);
		livros.add(livro);
		this.livro = new Livro();
		this.autoresLivro.clear();
	}
	
	public List<Livro> getLivros() {
		return livros;
	}
	
	public List<Autor> getAutores(){
		System.out.println("GetAutores - Livro: "+autores.size());		
		return autores;
	}

	public List<Autor> getAutoresLivro() {
		return autoresLivro;
	}

	public void setAutoresLivro(List<Autor> autoresLivro) {
		this.autoresLivro = autoresLivro;
	}

	public Integer getAutorId() {
		return autorId;
	}

	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}

}

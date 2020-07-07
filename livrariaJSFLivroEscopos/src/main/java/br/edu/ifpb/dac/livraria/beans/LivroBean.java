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
	private List<Livro> livros;
	private Integer autorId;
	private List<Autor> autores;
	private List<Autor> autoresLivro;
	
	@EJB
	private ServicoLivros servicoLivro;
	@EJB
	private ServicoAutores servicoAutor;
	
	public LivroBean() {
		
	}
	
	@PostConstruct
	public void init() {
		livros = this.servicoLivro.todosLivros();
		autores = this.servicoAutor.todosAutores();
		autoresLivro = new ArrayList<Autor>();
	}
	
	public Livro getLivro() {
		return livro;
	}
	
		
	public void cadastra() {
		System.out.println("Cadastra - Livro: "+livro.getTitulo()+" - DATA: "+livro.getDataLancamento());
		livro.setAutores(autoresLivro);
		this.servicoLivro.salva(livro);
		livros.add(livro);
		this.livro = new Livro();
	}
	
	public String altera() {
		System.out.println("Altera - Livro: "+livro.getTitulo());
		this.servicoLivro.altera(livro);
		this.livro = new Livro();
		
		return "livros?faces-redirect=true";
	}
	
	public void adicionaAutorLivro() {
		Autor autor = servicoAutor.buscaPelaId(autorId);
		System.out.println("AdicionaAutorLivro - Livro: "+livro.getTitulo()+" - Autor: "+autor.getNome());
		autoresLivro.add(autor);
	}
	
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
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

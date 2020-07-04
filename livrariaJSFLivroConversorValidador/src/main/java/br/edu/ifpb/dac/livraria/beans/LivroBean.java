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
	@EJB
	private ServicoLivros servicoLivro;
	
	public LivroBean() {
		
	}
	
	@PostConstruct
	public void init() {
		livros = this.servicoLivro.todosLivros();
	}
	
	public Livro getLivro() {
		return livro;
	}
	
		
	public void cadastra() {
		System.out.println("Cadastra - Livro: "+livro.getTitulo());
		this.servicoLivro.salva(livro);
		livros.add(livro);
		this.livro = new Livro();
	}
	
	public void preparaEditar() {
		
	}
	
	public String altera() {
		System.out.println("Altera - Livro: "+livro.getTitulo());
		this.servicoLivro.altera(livro);
		this.livro = new Livro();
		
		return "livros?faces-redirect=true";
	}
	
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	

}

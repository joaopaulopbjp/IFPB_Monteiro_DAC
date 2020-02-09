package br.edu.ifpb.livraria.bean;

import java.util.List;

import javax.enterprise.inject.Model;

import br.edu.ifpb.livraria.dao.AutorDao;
import br.edu.ifpb.livraria.dao.LivroDao;
import br.edu.ifpb.livraria.modelo.Autor;
import br.edu.ifpb.livraria.modelo.Livro;

@Model
public class LivroBean {
	
	private Livro livro = new Livro();
	private Integer autorId;
	
	private LivroDao livroDao = new LivroDao();
	private AutorDao autorDao = new AutorDao();

	public void cadastra() {
		
		Autor autor = this.autorDao.buscaPelaId(this.autorId);
		this.livro.setAutor(autor);
		
		this.livroDao.salva(livro);
		
		this.livro = new Livro();
	}

	public List<Autor> getAutores() {
		return autorDao.todosAutores();
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}
	
	public Integer getAutorId() {
		return autorId;
	}
	
	public List<Livro> getLivros() {
		return this.livroDao.todosLivros();
	}
}

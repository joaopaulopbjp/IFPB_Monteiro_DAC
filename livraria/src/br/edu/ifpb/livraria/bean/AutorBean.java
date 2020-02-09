package br.edu.ifpb.livraria.bean;

import java.util.List;

import javax.enterprise.inject.Model;

import br.edu.ifpb.livraria.dao.AutorDao;
import br.edu.ifpb.livraria.modelo.Autor;

@Model
public class AutorBean {
	
	private Autor autor = new Autor();
	private AutorDao dao = new AutorDao();
	
	public Autor getAutor() {
		return autor;
	}
	
	public void cadastra() {
		this.dao.salva(autor);
		this.autor = new Autor();
	}
	
	public List<Autor> getAutores() {
		return this.dao.todosAutores();
	}
}

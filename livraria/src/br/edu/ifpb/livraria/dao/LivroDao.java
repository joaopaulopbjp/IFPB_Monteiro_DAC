package br.edu.ifpb.livraria.dao;

import java.util.List;

import br.edu.ifpb.livraria.modelo.Livro;


public class LivroDao {

	private Banco banco = new Banco();
	
	public void salva(Livro livro) {
		banco.save(livro);
	}
	
	public List<Livro> todosLivros() {
		return banco.listaLivros();
	}
	
}

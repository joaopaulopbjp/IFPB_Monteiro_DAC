package br.edu.ifpb.livraria.dao;

import br.edu.ifpb.livraria.modelo.Usuario;


public class UsuarioDao {

	private Banco banco = new Banco();

	public Usuario buscaPeloLogin(String login) {
		return this.banco.buscaPeloNome(login);
	}
	
}

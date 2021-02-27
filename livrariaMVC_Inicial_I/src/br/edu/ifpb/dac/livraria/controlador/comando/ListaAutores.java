package br.edu.ifpb.dac.livraria.controlador.comando;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifpb.dac.livraria.modelo.Autor;
import br.edu.ifpb.dac.livraria.modelo.servico.ServicoAutores;


public class ListaAutores {
	

	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ServicoAutores servicoAutor = new ServicoAutores();
		
		//TODO 	FALTA consultar todos os autores através do DAO e retornar uma lista de autores
		

		//TODO FALTA incluir a lista de autores em uma atributo da requisição para que a visão possa exibir
				
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/visao/listaAutores.jsp");
		rd.forward(request, response);
	}
}
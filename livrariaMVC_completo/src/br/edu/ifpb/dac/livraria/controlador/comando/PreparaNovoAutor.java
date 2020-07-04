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


public class PreparaNovoAutor implements Comando{
	

	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/visao/formNovoAutor.jsp");
		rd.forward(request, response);
	}
}
package br.edu.ifpb.dac.livraria.controlador.comando;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Comando {

	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;
}

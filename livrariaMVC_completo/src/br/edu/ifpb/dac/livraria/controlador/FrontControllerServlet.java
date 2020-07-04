package br.edu.ifpb.dac.livraria.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifpb.dac.livraria.controlador.comando.Comando;
import br.edu.ifpb.dac.livraria.controlador.comando.ListaAutores;

/**
 * Servlet implementation class DacServlet
 */
@WebServlet("/controlador")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

    	
		String paramComando = request.getParameter("comando");		
		String nomeCompletoClasse = "br.edu.ifpb.dac.livraria.controlador.comando." + paramComando;
		Comando comandoObj = null;
		try {
			Class classe = Class.forName(nomeCompletoClasse);
			comandoObj = (Comando)classe.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		comandoObj.executa(request, response);
    }

}

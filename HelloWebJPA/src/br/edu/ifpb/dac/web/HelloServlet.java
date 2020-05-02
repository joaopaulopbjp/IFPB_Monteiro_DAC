package br.edu.ifpb.dac.web;

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

import br.edu.ifpb.dac.livraria.dao.AutorDao;
import br.edu.ifpb.dac.livraria.modelo.Autor;

/**
 * Servlet implementation class DacServlet
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	AutorDao autorDao;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
				
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Oi Web.</h2>");
		List<Autor> autores = autorDao.todosAutores();
		for (Autor autor : autores) {
			out.println(autor.getNome()+"</br>");			
		}

		out.println("</body>");
		out.println("</html>");
	}

}

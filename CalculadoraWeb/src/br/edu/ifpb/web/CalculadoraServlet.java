package br.edu.ifpb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifpb.negocio.CalculadoraEJB;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/Calculadora")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private CalculadoraEJB cal;

    public CalculadoraServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramA = request.getParameter("a");
		String paramB = request.getParameter("b");
		
		if (paramA == null) {
			paramA = "0";
		}
		
		if (paramB == null) {
			paramB = "0";
		}
		
		int a = Integer.parseInt(paramA);
		int b = Integer.parseInt(paramB);
		
		int resultado = cal.soma(a, b);
		
		PrintWriter respOut = response.getWriter();
		
		respOut.println("<html>");
		respOut.println("<body>");
		
		respOut.println("<h1>A ("+a+") + B ("+b+") = "+resultado+"</h1>");
		
		respOut.println("</body>");
		respOut.println("</html>");
	}

}

package br.edu.ifpb.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifpb.ejb.Carrinho;

/**
 * Servlet implementation class CarrinhoWeb
 */
@WebServlet("/Carrinho")
public class CarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CART_SESSION_KEY = "Carrinho";
	private static final String LISTAR = "listar";
	private static final String ADD = "add";

	private Carrinho carrinhoSessao;  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String produto = null;
		
		PrintWriter respOut = response.getWriter();
		
		respOut.println("<html>");
		respOut.println("<body>");
		
		HttpSession session = request.getSession(true);
		carrinhoSessao = (Carrinho) session.getAttribute(CART_SESSION_KEY+session.getId());
		 
        if(carrinhoSessao == null){
             try {
               InitialContext ic = new InitialContext();
               carrinhoSessao = (Carrinho) 
                ic.lookup("java:global/CarrinhoEAR/CarrinhoEJB/Carrinho!br.edu.ifpb.ejb.Carrinho");

               request.getSession().setAttribute(CART_SESSION_KEY+session.getId(), carrinhoSessao);
               
               System.out.println("CarrinhoLista Servlet - nova sessao criada - "+session.getId());

             } catch (NamingException e) {
               throw new ServletException(e);
             }
        }
        
        System.out.println("EJB instancia: "+carrinhoSessao.getId());


		if (acao.equalsIgnoreCase(ADD)) {
			produto = request.getParameter("produto");
			carrinhoSessao.adicionaProduto(produto);
			
			if (produto == null) {
				respOut.println("<h1>Nenhum produto enviado</h1>");
			}else {
				respOut.println("<h1>Produto ("+produto+") adicionado ao carrinho. </h1>");
			}

		}else if(acao.equalsIgnoreCase(LISTAR)) {
			List<String> produtos = carrinhoSessao.listaCarrinho();
			
			if (produtos == null || produtos.isEmpty()) {
				respOut.println("<h1>Carrinho vazio. </h1>");
			}else
				respOut.println("<h1>Lista de produtos: </h1>");
			
			for (String prod : produtos) {
				respOut.println("<h1>"+prod+"; </h1>");
			}
	
		}
					
			
		respOut.println("</body>");
		respOut.println("</html>");
	}

}

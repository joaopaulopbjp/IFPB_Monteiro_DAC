package br.edu.ifpb.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Carrinho
 */
@Stateful
public class Carrinho {
	
	private static int count = 0;

	private List<String> produtos;
	private int id;
	
	@PostConstruct
	public void inicializa() {
		id = count++;
		produtos = new ArrayList<String>();
		System.out.println("EJB Carrinho criado.");
	}
	
	public void adicionaProduto(String produto) {
		produtos.add(produto);
	}
	
	public int getId() {
		return id;
	}
	
	public List<String> listaCarrinho(){
		return produtos;
	}
}

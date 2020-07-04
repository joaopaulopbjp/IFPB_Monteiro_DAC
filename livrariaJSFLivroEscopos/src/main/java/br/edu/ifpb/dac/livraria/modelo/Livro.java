package br.edu.ifpb.dac.livraria.modelo;

import java.io.Serializable;
import java.lang.String;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Livro
 *
 */
@Entity
public class Livro implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String isbn;
	private BigDecimal preco;
	
	@ManyToMany
	private List<Autor> autores;
	
	private static final long serialVersionUID = 1L;

	public Livro() {
		super();
	}   
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}   
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}   
	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
   
}

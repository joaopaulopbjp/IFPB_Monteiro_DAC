package br.edu.ifpb.jpa.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@DiscriminatorValue("Livro")

@Entity
public class Livro extends Publicacao {

	private int numPaginas;

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
}

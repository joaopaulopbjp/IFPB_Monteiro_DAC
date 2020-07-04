package br.edu.ifpb.jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String endereco;
	private int cep;
//	private int numero;
	private String cidade;
	@Column(length = 50)
	private String estado;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
//	public int getNumero() {
//		return numero;
//	}
//	public void setNumero(int numero) {
//		this.numero = numero;
//	}
	
}

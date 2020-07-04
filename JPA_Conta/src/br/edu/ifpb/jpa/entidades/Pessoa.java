package br.edu.ifpb.jpa.entidades;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {
	@Id
	private String cpf;
	private String nome;
	
//	private String endereco;
//	private int cep;
//	private String cidade;
//	private String estado;
	
	@Embedded
	private Endereco endereco;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
//	public String getEndereco() {
//		return endereco;
//	}
//	public void setEndereco(String endereco) {
//		this.endereco = endereco;
//	}
//	public int getCep() {
//		return cep;
//	}
//	public void setCep(int cep) {
//		this.cep = cep;
//	}
//	public String getCidade() {
//		return cidade;
//	}
//	public void setCidade(String cidade) {
//		this.cidade = cidade;
//	}
//	public String getEstado() {
//		return estado;
//	}
//	public void setEstado(String estado) {
//		this.estado = estado;
//	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

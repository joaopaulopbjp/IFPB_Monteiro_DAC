package br.edu.ifpb.jpa.entidades;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Empregado")
@SecondaryTable(name = "Empregado_Detalhes", pkJoinColumns = @PrimaryKeyJoinColumn(name = "empregado_id"))
public class Empregado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idempregado;
 
	@Column(name = "primeiro_nome")
	private String primeiroNome;
 
	@Column(name = "ultimo_nome", table = "Empregado")
	private String ultimoNome;
 
	@Column(name = "email_id", table = "Empregado_Detalhes")
	private String email;
 
	@Column(table = "Empregado_Detalhes")
	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;
 
	@Column(table = "Empregado_Detalhes")
	private double salario;

	public int getIdempregado() {
		return idempregado;
	}

	public void setIdempregado(int idempregado) {
		this.idempregado = idempregado;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	} 
 
}



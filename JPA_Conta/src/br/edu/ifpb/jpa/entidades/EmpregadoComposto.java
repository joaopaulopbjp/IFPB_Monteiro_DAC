package br.edu.ifpb.jpa.entidades;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
//@IdClass(EmpregadoId.class)
public class EmpregadoComposto {
	
//	@Id
//	private String cpf;
//	
//	@Id
//	private String matricula;
	
	@EmbeddedId
	private EmpregadoEmbId id;
	
	private String nome;
  
	private String email;

//	public String getCpf() {
//		return cpf;
//	}
//
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}

//	public String getMatricula() {
//		return matricula;
//	}
//
//	public void setMatricula(String matricula) {
//		this.matricula = matricula;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmpregadoEmbId getId() {
		return id;
	}

	public void setId(EmpregadoEmbId id) {
		this.id = id;
	}
 
 
	
}



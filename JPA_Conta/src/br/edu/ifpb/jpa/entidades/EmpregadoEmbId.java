package br.edu.ifpb.jpa.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmpregadoEmbId implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String cpf;
	
	private String matricula;
	
	public EmpregadoEmbId() {
	}
	

	public EmpregadoEmbId(String cpf, String matricula) {
		super();
		this.cpf = cpf;
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpregadoEmbId other = (EmpregadoEmbId) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
	

}

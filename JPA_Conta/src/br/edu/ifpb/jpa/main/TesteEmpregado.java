package br.edu.ifpb.jpa.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpb.jpa.dao.ContaDAO;
import br.edu.ifpb.jpa.dao.EmpregadoDAO;
import br.edu.ifpb.jpa.entidades.Conta;
import br.edu.ifpb.jpa.entidades.ContaTipo;
import br.edu.ifpb.jpa.entidades.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {


		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
		EmpregadoDAO dao = new EmpregadoDAO(emf);

		Empregado emp = new Empregado();
//		emp.setPrimeiroNome("JOAO PAULO");
//		emp.setUltimoNome("Lopes");
//		emp.setEmail("joao.paulo@ifpb");
//		dao.adiciona(emp); 
		
//		emp = new Empregado();
//		emp.setPrimeiroNome("ERIVALDO");
//		emp.setUltimoNome("Lopes");
//		emp.setSalario(800000);
//		dao.adiciona(emp); 
		
		emp = new Empregado();
		emp.setPrimeiroNome("ANA PAULA");
		emp.setUltimoNome("Lopes");
		emp.setSalario(1000000);
		dao.adiciona(emp); 
 
		emf.close();
 
	}
}

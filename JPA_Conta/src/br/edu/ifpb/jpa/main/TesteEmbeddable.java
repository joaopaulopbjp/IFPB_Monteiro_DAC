package br.edu.ifpb.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpb.jpa.entidades.EmpregadoComposto;
import br.edu.ifpb.jpa.entidades.EmpregadoId;
import br.edu.ifpb.jpa.entidades.Empresa;
import br.edu.ifpb.jpa.entidades.Endereco;
import br.edu.ifpb.jpa.entidades.Pessoa;

public class TesteEmbeddable {

	public static void main(String[] args) {


		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
		EntityManager em = emf.createEntityManager();

		String cpf = "012.137.094-78";
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf(cpf);
		pessoa.setNome("JOAO PAULO LOPES");
		
		Endereco end = new Endereco();
		end.setCep(58041321);
		end.setEndereco("Rua projetada, s/n");
		end.setCidade("Monteiro");
		end.setEstado("Paraíba");
		
		pessoa.setEndereco(end);
		
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
//		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
//		EntityManager em = emf.createEntityManager();
//
//		String cnpj = "12.137.095/0001-81";
//		
//		Empresa emp = new Empresa();
//		emp.setCnpj(cnpj);
//		emp.setRazaoSocial("JOAO LOPES LTDA");
//		
//		
//		Endereco end = new Endereco();
//		end.setCep(58041321);
//		end.setEndereco("Rua projetada, s/n");
//		end.setCidade("Monteiro");
//		end.setEstado("Paraíba");
//		
//		emp.setEndereco(end);
//		
//		em.getTransaction().begin();
//		em.persist(emp);
//		em.getTransaction().commit();
		
//		em.close();
//		emf.close();
//
		
	}
}

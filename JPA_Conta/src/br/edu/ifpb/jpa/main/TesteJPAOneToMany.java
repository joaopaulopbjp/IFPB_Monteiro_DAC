package br.edu.ifpb.jpa.main;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpb.jpa.entidades.Cliente;
import br.edu.ifpb.jpa.entidades.Conta;
import br.edu.ifpb.jpa.entidades.Movimentacao;
import br.edu.ifpb.jpa.entidades.TipoMovimentacao;

import java.math.BigDecimal;
import java.util.Calendar;


public class TesteJPAOneToMany {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setId(1);
//    	Cliente cliente = new Cliente();
//    	cliente.setNome("ERIVALDO");
//    	cliente.setProfissao("Professor");

    	Cliente cliente = new Cliente();
    	cliente.setId(1);

//    	Cliente cliente2 = new Cliente();
//    	cliente2.setNome("ANA PAULA");
//    	cliente2.setProfissao("Economista");

//        Conta conta = new Conta();
//        conta.setAgencia("111");
//        conta.setBanco("Itau");
//        conta.setNumero("54321");
        
        cliente.setConta(conta);
//        cliente2.setConta(conta);
        
        
//        
//        Movimentacao movimentacao = new Movimentacao();
//        movimentacao.setData(Calendar.getInstance());
//        movimentacao.setDescricao("Churrascaria");
//        movimentacao.setTipoMovimentacao(TipoMovimentacao.DEBITO);
//        movimentacao.setValor(new BigDecimal("200.0"));
        
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData(Calendar.getInstance());
        movimentacao.setDescricao("Salário");
        movimentacao.setTipoMovimentacao(TipoMovimentacao.CREDITO);
        movimentacao.setValor(new BigDecimal("1500.00"));

        movimentacao.setConta(conta);

		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();

//        manager.persist(conta);
//        manager.persist(cliente);
        manager.persist(movimentacao);        

//        manager.persist(cliente2);

        manager.getTransaction().commit();
        manager.close();

    }

}

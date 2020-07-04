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


public class TesteJPAMaisContasEMovimentacoes {

    public static void main(String[] args) {

    	Cliente cliente = new Cliente();
    	cliente.setNome("ERIVALDO");
    	cliente.setProfissao("Professor");

    	Cliente cliente2 = new Cliente();
    	cliente2.setNome("JOAO PAULO");
    	cliente2.setProfissao("Analista de TI");


        Conta conta = new Conta();
        conta.setAgencia("1617");
        conta.setBanco("BB");
        conta.setNumero("22926-X");
        
        Conta conta2 = new Conta();
        conta2.setAgencia("0044");
        conta2.setBanco("CAIXA");
        conta2.setNumero("15234");

        cliente.setConta(conta);
        cliente2.setConta(conta2);
        
        
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData(Calendar.getInstance());
        movimentacao.setDescricao("Supermercado");
        movimentacao.setTipoMovimentacao(TipoMovimentacao.DEBITO);
        movimentacao.setValor(new BigDecimal("510.00"));
        
        Movimentacao movimentacao2 = new Movimentacao();
        movimentacao2.setData(Calendar.getInstance());
        movimentacao2.setDescricao("Pagamento Cartao");
        movimentacao2.setTipoMovimentacao(TipoMovimentacao.DEBITO);
        movimentacao2.setValor(new BigDecimal("2300.00"));
        
        Movimentacao movimentacao3 = new Movimentacao();
        movimentacao3.setData(Calendar.getInstance());
        movimentacao3.setDescricao("Deposito");
        movimentacao3.setTipoMovimentacao(TipoMovimentacao.CREDITO);
        movimentacao3.setValor(new BigDecimal("1000.00"));
        
        Movimentacao movimentacao4 = new Movimentacao();
        movimentacao4.setData(Calendar.getInstance());
        movimentacao4.setDescricao("Pagamento Energia");
        movimentacao4.setTipoMovimentacao(TipoMovimentacao.DEBITO);
        movimentacao4.setValor(new BigDecimal("300.00"));

        movimentacao.setConta(conta);
        movimentacao2.setConta(conta2);
        movimentacao3.setConta(conta);
        movimentacao4.setConta(conta2);

		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();

        manager.persist(cliente);
        manager.persist(cliente2);

        manager.persist(conta);
        manager.persist(conta2);
        manager.persist(movimentacao);        
        manager.persist(movimentacao2);        
        manager.persist(movimentacao3);        
        manager.persist(movimentacao4);        

        
//        manager.persist(cliente2);

        manager.getTransaction().commit();
        manager.close();

    }

}

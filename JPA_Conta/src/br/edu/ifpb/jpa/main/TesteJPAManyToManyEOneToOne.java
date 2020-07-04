package br.edu.ifpb.jpa.main;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import br.edu.ifpb.jpa.entidades.Categoria;
import br.edu.ifpb.jpa.entidades.Cliente;
import br.edu.ifpb.jpa.entidades.Conta;
import br.edu.ifpb.jpa.entidades.Movimentacao;
import br.edu.ifpb.jpa.entidades.TipoMovimentacao;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


public class TesteJPAManyToManyEOneToOne {

    public static void main(String[] args) {

//        Conta conta = new Conta();
//        conta.setId(1);

//    	Cliente cliente = new Cliente();
//    	cliente.setNome("ERIVALDO");
//    	cliente.setProfissao("Professor");
//    	
//        Conta conta = new Conta();
//        conta.setAgencia("111");
//        conta.setBanco("Itau");
//        conta.setNumero("54321");
//        
//        cliente.setConta(conta);
        
//        Movimentacao movimentacao = new Movimentacao();
//        movimentacao.setData(Calendar.getInstance());
//        movimentacao.setDescricao("Churrascaria");
//        movimentacao.setTipoMovimentacao(TipoMovimentacao.DEBITO);
//        movimentacao.setValor(new BigDecimal("200.0"));
//
//        movimentacao.setConta(conta);

//      Movimentacao movimentacao = new Movimentacao();
//
//        Categoria categ1 = new Categoria();
//        categ1.setNome("Viagens");
//
//        Categoria categ2 = new Categoria();
//        categ2.setNome("Negocios");
//
//        List<Categoria> listaCateg = Arrays.asList(categ1,categ2);
//        movimentacao.setCategorias(listaCateg);
        
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();

        Categoria categ1 = new Categoria();
        categ1.setNome("Viagens");

        Categoria categ2 = new Categoria();
        categ2.setNome("Negocios");

        manager.persist(categ1);
        manager.persist(categ2);
        
        Movimentacao movimentacao = manager.find(Movimentacao.class,1);

        List<Categoria> listaCateg = Arrays.asList(categ1,categ2);

        movimentacao.setCategorias(listaCateg);

        Movimentacao movimentacao2 = manager.find(Movimentacao.class,2);

        List<Categoria> listaCateg2 = Arrays.asList(categ1);


        movimentacao2.setCategorias(listaCateg2);
//        manager.persist(conta);
//        manager.persist(categ1);
//        manager.persist(categ2);
        
//        manager.persist(movimentacao);

        manager.getTransaction().commit();
        manager.close();

    }

}

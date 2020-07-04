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


public class TesteJPAColecaoPrimitivos {

    public static void main(String[] args) {

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
//        
//        Movimentacao movimentacao = new Movimentacao();
//        movimentacao.setData(Calendar.getInstance());
//        movimentacao.setDescricao("Churrascaria");
//        movimentacao.setTipoMovimentacao(TipoMovimentacao.DEBITO);
//        movimentacao.setValor(new BigDecimal("200.0"));
//
//        movimentacao.setConta(conta);
//        
//        List<String> listaCateg = Arrays.asList("Viagens","Negocios");
//        movimentacao.setCategorias(listaCateg);
//        
//		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
//        EntityManager manager = emf.createEntityManager();
//        manager.getTransaction().begin();
//
//        manager.persist(conta);
//        
//        manager.persist(movimentacao);
//
//        manager.getTransaction().commit();
//        manager.close();

    }

}

package br.edu.ifpb.jpa.main;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.ifpb.jpa.entidades.Cliente;
import br.edu.ifpb.jpa.entidades.Conta;
import br.edu.ifpb.jpa.entidades.Movimentacao;
import br.edu.ifpb.jpa.entidades.TipoMovimentacao;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;


public class TesteLazyOuEager {

    public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
        EntityManager em = emf.createEntityManager();
        

    	
//        String jpql = "select m from Movimentacao m where m.conta.id = 1";
//        Query query = em.createQuery(jpql);
//
//        List<Movimentacao> resultados = query.getResultList();
//
//        for (Movimentacao movimentacao : resultados) {
//            System.out.println("Descricao: " + movimentacao.getDescricao());
//            System.out.println("Valor: " + movimentacao.getValor());
//            System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
//            System.out.println("Conta.id: " + movimentacao.getConta().getId());
//        } 
        
        String jpql = "select c from Conta c";
//        String jpql = "select c from Conta c join fetch c.movimentacoes";

        
        Query query = em.createQuery(jpql);

        List<Conta> todasAsContas = query.getResultList();

        for (Conta conta : todasAsContas) {
            System.out.println("Id: " + conta.getId());
            System.out.println("Titular: " + conta.getCliente().getNome());
            System.out.println("Numero: " + conta.getNumero());
            System.out.println("Quantidade de Movimentacoes: ");
            System.out.println(conta.getMovimentacoes().size());
        }

        
        em.close();

    }

}

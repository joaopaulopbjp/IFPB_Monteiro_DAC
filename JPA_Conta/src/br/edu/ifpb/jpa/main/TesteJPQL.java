package br.edu.ifpb.jpa.main;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.edu.ifpb.jpa.entidades.Categoria;
import br.edu.ifpb.jpa.entidades.Cliente;
import br.edu.ifpb.jpa.entidades.Conta;
import br.edu.ifpb.jpa.entidades.Movimentacao;
import br.edu.ifpb.jpa.entidades.TipoMovimentacao;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;


public class TesteJPQL {

    public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
        EntityManager em = emf.createEntityManager();
        

        /*Primeiro teste*/
//        String jpql = "select m from Movimentacao m where m.conta.id = 1";
//        Query query = em.createQuery(jpql);

        /*Segundo teste - named parameters*/
//        Conta conta = new Conta();
//        conta.setId(1);
//        String jpql = "select m from Movimentacao m where m.conta = :conta and m.tipoMovimentacao = :tipo order by m.valor desc";
//        Query query = em.createQuery(jpql);
//        query.setParameter("conta",conta);
//        query.setParameter("tipo",TipoMovimentacao.CREDITO);
        
        /*Terceiro teste - consultando relacionamentos ManyToMany*/
//        Categoria categoria = new Categoria();
//        categoria.setId(2);
//
//        String jpql = "select m from Movimentacao m join m.categorias c where c = :categoria";
//
////        String jpql = "select m from Movimentacao m where m.categorias = :categoria";
//
//        
//        Query query = em.createQuery(jpql);
//        query.setParameter("categoria", categoria);
//
//        
//        List<Movimentacao> resultados = query.getResultList();
//
//        for (Movimentacao movimentacao : resultados) {
//            System.out.println("Descricao: " + movimentacao.getDescricao());
//            System.out.println("Valor: " + movimentacao.getValor());
//            System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
//            System.out.println("Conta.id: " + movimentacao.getConta().getId());
//        } 

        /*Quarto teste - usando funções e TypedQueries*/
////        String jpql = "select sum(m.valor) from Movimentacao m where m.conta = :conta";
//        String jpql = "select avg(m.valor) from Movimentacao m where m.conta = :conta group by day(m.data)";
//        Conta conta = new Conta();
//        conta.setId(1);
//        TypedQuery<Double> query = em.createQuery(jpql,Double.class);//TypedQuery
//        query.setParameter("conta",conta);
//
////        BigDecimal soma = (BigDecimal) query.getSingleResult();
//        List<Double> medias = query.getResultList();
//        for (Double media : medias) {
//        	 System.out.println("A média é: " + media);	
//	
//		}
        
        
//        String jpql = "select day(m.data), avg(m.valor) from Movimentacao m where m.conta = :conta group by day(m.data)" ;
//
//        
//        
//        Conta conta = new Conta();
//        conta.setId(1);
//        Query query = em.createQuery(jpql);
//        query.setParameter("conta",conta);
//
////        BigDecimal soma = (BigDecimal) query.getSingleResult();
////        BigDecimal media = BigDecimal.valueOf((Double)query.getSingleResult());
//        List<Object[]> mediaPorDia = query.getResultList();
//
//        for (Object[] DiasEMedias : mediaPorDia) {
//        	System.out.println("Dia : " + (Integer)DiasEMedias[0]);	
//        	System.out.println("A média é: " + (Double)DiasEMedias[1]);	
//		}

        /*Quinto teste - usando Named Queries*/
        Conta conta = new Conta();
        conta.setId(1);
        TypedQuery<Double> query = em.createNamedQuery("MediasPorDia",Double.class);//TypedQuery
        query.setParameter("conta",conta);

        List<Double> medias = query.getResultList();
        for (Double media : medias) {
        	 System.out.println("A média é: " + media);		
		}

        
        em.close();

    }

}

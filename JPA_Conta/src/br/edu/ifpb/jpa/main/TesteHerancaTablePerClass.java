package br.edu.ifpb.jpa.main;



import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.ifpb.jpa.entidades.Autor;
import br.edu.ifpb.jpa.entidades.BlogPostagem;
import br.edu.ifpb.jpa.entidades.Livro;
import br.edu.ifpb.jpa.entidades.Movimentacao;
import br.edu.ifpb.jpa.entidades.Publicacao;



public class TesteHerancaTablePerClass {

    public static void main(String[] args) {

    	Autor autor = new Autor();
    	autor.setNome("Martin Fowler");
    	
        Livro livro = new Livro();
        livro.setTitulo("Use a cabela SQL");
        livro.setNumPaginas(500);
        
        Publicacao pubLivro = new Publicacao();
        pubLivro.setTitulo("Use a cabela SQL");
        
        livro.setAutores(Arrays.asList(autor));
        
        
        Livro livro2 = new Livro();
        livro2.setTitulo("Engenharia de Software");
        livro2.setNumPaginas(640);
        livro2.setAutores(Arrays.asList(autor));

        Publicacao pubLivro2 = new Publicacao();
        pubLivro2.setTitulo("Engenharia de Software");
        
        
        BlogPostagem blogPost = new BlogPostagem();
        blogPost.setTitulo("Martin fowler");
        blogPost.setUrl("https://martinfowler.com/");
        blogPost.setAutores(Arrays.asList(autor));

        
        BlogPostagem blogPost2 = new BlogPostagem();
        blogPost2.setTitulo("Medium - java-cdi-um-tutorial");
        blogPost2.setUrl("https://medium.com/@vepo/java-cdi-um-tutorial-de9cd66abe3f");        
        blogPost2.setAutores(Arrays.asList(autor));
        
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();

        manager.persist(autor);
        
        manager.persist(livro);
        manager.persist(livro2);
        
        pubLivro.setId(livro.getId());
        pubLivro2.setId(livro2.getId());
        
        manager.persist(pubLivro);
        manager.persist(pubLivro2);
        
        manager.persist(blogPost);
        manager.persist(blogPost2);

        manager.getTransaction().commit();
        manager.close();

//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
//    	EntityManager manager = emf.createEntityManager();
//
//        String jpql = "select a from Autor a";
//        Query query = manager.createQuery(jpql,Autor.class);
//
//        List<Autor> resultados = query.getResultList();
//        for (Autor a : resultados) {
//        	for (Publicacao pub : a.getPublicacoes()) {
//                System.out.println("Título: " + pub.getTitulo());
//                if (pub instanceof Livro) {
//                    System.out.println("Tipo de publicacao: Livro");
//	
//				}else
//                    System.out.println("Tipo de publicacao: BlogPostagem");
//			}
//        }
        
//        String jpql = "select l from Livro l";
//        Query query = manager.createQuery(jpql,Livro.class);
//
//        List<Livro> resultados = query.getResultList();
//        for (Livro l : resultados) {
//                System.out.println("Título: " + l.getTitulo());
//        } 
//

        manager.close();

    }

}

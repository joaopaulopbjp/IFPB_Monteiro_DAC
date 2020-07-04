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



public class TesteHerancaMappedSuperclass {

    public static void main(String[] args) {

    	Autor autor = new Autor();
    	autor.setNome("Martin Fowler");
    	
        Livro livro = new Livro();
        livro.setTitulo("Use a cabela SQL");
        livro.setNumPaginas(500);
        
        livro.setAutores(Arrays.asList(autor));
        
        
        Livro livro2 = new Livro();
        livro2.setTitulo("Engenharia de Software");
        livro2.setNumPaginas(640);
        livro2.setAutores(Arrays.asList(autor));

        
        
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
        
        manager.persist(blogPost);
        manager.persist(blogPost2);

        manager.getTransaction().commit();
        
        String jpql = "select l from Livro l";
        Query query = manager.createQuery(jpql);

        List<Livro> resultados = query.getResultList();
        for (Livro l : resultados) {
            System.out.println("Título: " + l.getTitulo());
            System.out.println("Numero de paginas: " + l.getNumPaginas());
        } 

        jpql = "select bp from BlogPostagem bp";
        query = manager.createQuery(jpql);

        List<BlogPostagem> resultados2 = query.getResultList();
        for (BlogPostagem bp : resultados2) {
            System.out.println("Título: " + bp.getTitulo());
            System.out.println("Url: " + bp.getUrl());
        } 
        
        manager.close();

    }

}

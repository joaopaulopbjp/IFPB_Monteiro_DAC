package br.edu.ifpb.negocio;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculadoraEJB
 */
@Stateless
public class CalculadoraEJB {

    /**
     * Default constructor. 
     */
    public CalculadoraEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public int soma(int a, int b) {
    	return a + b;
    }

}

package br.edu.ifpb.dac.calculadora.beans;

import java.math.BigDecimal;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class CalculadoraBean{

	private BigDecimal numeroA;
	private BigDecimal numeroB;
	private BigDecimal resultado;
	
	public CalculadoraBean() {
	}
	
	public void soma() {
		resultado = numeroA.add(numeroB);
	}

	public BigDecimal getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(BigDecimal numeroA) {
		this.numeroA = numeroA;
	}

	public BigDecimal getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(BigDecimal numeroB) {
		this.numeroB = numeroB;
	}

	public BigDecimal getResultado() {
		return resultado;
	}

	public void setResultado(BigDecimal resultado) {
		this.resultado = resultado;
	}
	
	public BigDecimal getResultadoPercentual() {
		BigDecimal resultadoPercentual = null;
		if (resultado != null) {
			resultadoPercentual = resultado.divide(new BigDecimal(100));
		}
		return resultadoPercentual;
	}
	
	
}

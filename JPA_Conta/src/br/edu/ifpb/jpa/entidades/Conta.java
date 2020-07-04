package br.edu.ifpb.jpa.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name="TB_CONTA", uniqueConstraints = {@UniqueConstraint(name="CONTA_NUM_TIPO_UK", columnNames = {"numero","tipo"})})
public class Conta {

		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Integer id;
	    
	    private String banco; 
	    private String agencia;
	    private String numero;
	    @Enumerated(EnumType.STRING)
	    private ContaTipo tipo;
	    
	    @OneToMany(mappedBy="conta"/*, fetch=FetchType.EAGER*/)
	    private List<Movimentacao> movimentacoes;
	    
		@OneToOne(mappedBy="conta")
		private Cliente cliente;
	    
		public ContaTipo getTipo() {
			return tipo;
		}
		public void setTipo(ContaTipo tipo) {
			this.tipo = tipo;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getBanco() {
			return banco;
		}
		public void setBanco(String banco) {
			this.banco = banco;
		}
		public String getAgencia() {
			return agencia;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public List<Movimentacao> getMovimentacoes() {
			return movimentacoes;
		}
		public void setMovimentacoes(List<Movimentacao> movimentacoes) {
			this.movimentacoes = movimentacoes;
		}
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		
}

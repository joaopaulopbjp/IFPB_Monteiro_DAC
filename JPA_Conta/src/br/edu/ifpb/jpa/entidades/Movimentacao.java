package br.edu.ifpb.jpa.entidades;


import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

@Entity
@NamedQuery(query="select distinct avg(m.valor) from Movimentacao m where m.conta = :conta group by day(m.data)", name="MediasPorDia")
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private BigDecimal valor;

	@Enumerated(EnumType.STRING)
	private TipoMovimentacao tipoMovimentacao;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;

	private String descricao;

	@ManyToOne
	private Conta conta;

	@ManyToMany
	@JoinTable(name="MovimentacoesCategorias", joinColumns = @JoinColumn(name="Mov_FK"),inverseJoinColumns = @JoinColumn(name="Categ_FK") )
	private List<Categoria> categorias;

//	@ElementCollection
//	@Column(name="categoria_nome")
//	@CollectionTable(name="CategoriasMovimentacao")
//	private List<String> categorias;

	
	public Integer getId() {
		return id;
	}

	

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}



//	public List<String> getCategorias() {
//		return categorias;
//	}
//
//
//
//	public void setCategorias(List<String> categorias) {
//		this.categorias = categorias;
//	}



	public List<Categoria> getCategorias() {
		return categorias;
	}



	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}



}

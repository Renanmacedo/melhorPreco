package br.com.melhorpreco.web.model;

import java.math.BigDecimal;
import java.util.Date;


public class Produtos {

	private Short seq  = null;
	private String descricao = null;
	private String marca = null;
	private BigDecimal preco = null;
	private Date data = null;
	public Short getSeq() {
		return seq;
	}
	public void setSeq(Short seq) {
		this.seq = seq;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		if (seq == null) {
			if (other.seq != null)
				return false;
		} else if (!seq.equals(other.seq))
			return false;
		return true;
	}
	@Override
	public String toString(){
		return "[ DESCRIÇÃO =>" + this.descricao + ","+"PREÇO=>"+ this.preco  +"]";  
	}
}

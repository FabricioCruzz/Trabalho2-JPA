package br.edu.univas.si5.bd2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="VagaDetalhes")
public class VagaDetalhes {
	
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regSeqGen3")
	@SequenceGenerator(name = "regSeqGen3", sequenceName = "SEQ_VAGADETALHES", allocationSize = 1)
	private Integer codigo;
	
	@Column(name="area")
	private String area;
	
	@Column(name="salario")
	private Float salario;
	
	@Column(name="nomeVaga")
	private String nomeVaga;
	
	@OneToOne(mappedBy = "detalhes")
	private Vaga vaga;
	
	public VagaDetalhes() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}
	
	@Override
	public String toString() {
		return "Detalhes: [codigo=" + codigo + ", area=" + area + ", salario=" + salario + ", nomeVaga=" + nomeVaga + "]";
	}
	
}
